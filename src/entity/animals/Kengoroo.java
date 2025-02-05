package entity.animals;
import java.util.Random;
import entity.enums.Intelligence;
import entity.enums.SpeechVolume;
import interfaces.Speaking;
import interfaces.Thinking;

public class Kengoroo extends Animal implements Thinking, Speaking {
    public Kengoroo(String name, Intelligence intelligence, SpeechVolume speechVolume){
        super(name, intelligence, speechVolume);
    }

    @Override
    public void wayOfThinking(){
        if (this.getIntelligence().getCoefficent() == 100) {
            System.out.print(" в деталях начал объяснять про свой бисквитный кашель, ");
        } else if (this.getIntelligence().getCoefficent() == 75) {
            System.out.print(" начал объяснять про свой бисквитный кашель,");
        } else if (this.getIntelligence().getCoefficent() == 50) {
            System.out.print(" кое-как начал объяснять про свой кашель,");
        } else if (this.getIntelligence().getCoefficent() == 25) {
            System.out.print(" начал объяснять про свой кашель, хотя у самого в голове одна каша, ");
        }
    }

    public void wayOfSpeaking(Tiger tiger) {
        if (this.getSpeechVolume().getVolume() == 100) {
            if (this.getSpeechVolume().getVolume() > tiger.getSpeechVolume().getVolume()) {
                System.out.print(", и в то же самое время, громким голосом, перебивая " + tiger.getName() + ", " + this.getName());
            } else {
                System.out.print(", и в то же самое время, громким голосом, " + this.getName());
            }
        } else if (this.getSpeechVolume().getVolume() == 50) {
            if (this.getSpeechVolume().getVolume() > tiger.getSpeechVolume().getVolume()) {
                System.out.print(", и в то же самое время, перебивая " + tiger.getName() + ", " + this.getName());
            } else {
                System.out.print(", и в то же самое время, " + this.getName());
            }
        } else if (this.getSpeechVolume().getVolume() == 0) {
            System.out.print(", и в то же самое время, еле слышным голосом, " + this.getName());
        }
    }

    @Override
    public void strayChance(int delta){
        if (this.getIntelligence().getCoefficent() >= 75){
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 50 + delta){
                System.out.print("");
            }
            else{
                strayanimals.add(this.getName());
            }
        }
        else{
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 35 + delta){
                System.out.print("");
            }
            else{
                strayanimals.add(this.getName());
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, является ли объект тем же самым экземпляром
        if (this == obj) return true;

        // Проверяем, является ли объект null или принадлежит другому классу
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приводим объект к типу Kengoroo
        Kengoroo other = (Kengoroo) obj;

        // Сравниваем поле name
        if (getName() == null) {
            return other.getName() == null; // Если наш name null, проверяем, что и у другого объекта name null
        } else {
            return getName().equals(other.getName()); // Иначе сравниваем значения
        }
    }

    @Override
    public int hashCode() {
        // Генерируем хэш-код на основе поля name
        return getName() != null ? getName().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Это кенгуру" + this.getName();
    }

    @Override
    public void wayOfSpeaking(){

    }
}
