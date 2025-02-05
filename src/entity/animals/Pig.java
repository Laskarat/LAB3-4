package entity.animals;
import java.util.Random;
import entity.enums.Intelligence;
import entity.enums.SpeechVolume;

public class Pig extends Animal {
    public Pig(String name, Intelligence intelligence, SpeechVolume speechVolume){
        super(name, intelligence, speechVolume);
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

        // Приводим объект к типу Pig
        Pig other = (Pig) obj;

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
        return "Это пиг " + this.getName();
    }
}
