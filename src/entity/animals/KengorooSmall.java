package entity.animals;
import java.util.Random;
import entity.enums.Intelligence;
import entity.enums.SpeechVolume;
import interfaces.Speaking;
import interfaces.Thinking;

public class KengorooSmall extends Kengoroo implements Thinking, Speaking {
    public KengorooSmall(String name, Intelligence intelligence, SpeechVolume speechVolume){
        super(name, intelligence, speechVolume);
    }

    @Override
    public void wayOfThinking() {
        if (this.getIntelligence().getCoefficent() == 100) {
            System.out.print(" доходчиво объясняя, уговаривает их не говорить одновременно. ");
        } else if (this.getIntelligence().getCoefficent() == 75) {
            System.out.print(" начала уговаривать их не говорить одновременно. ");
        } else if (this.getIntelligence().getCoefficent() == 50) {
            System.out.print(" пытается уговорить их не говорить одновременно, но у нее ничего не вышло. ");
        } else if (this.getIntelligence().getCoefficent() == 25) {
            System.out.print(" выдав лишь несколько несвязных звуков, прекратила попытки уговорить их не говорить одновременно. ");
        }
    }

    @Override
    public void wayOfSpeaking(){
        if (this.getSpeechVolume().getVolume() == 100){
            System.out.print("а " + this.getName() + ", повышенным тоном,");
        }
        else if(this.getSpeechVolume().getVolume() == 50){
            System.out.print("а " + this.getName() + ", не громко,");
        }
        else if(this.getSpeechVolume().getVolume() == 0){
            System.out.print("а " + this.getName() + ", тихонько,");
        }
    }

    @Override
    public void strayChance(int delta) {
        if (this.getIntelligence().getCoefficent() >= 75) {
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 78 + delta) {
                System.out.print("");
            } else {
                strayanimals.add(this.getName());
            }
        } else {
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 35 + delta) {
                System.out.print("");
            } else {
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

        // Приводим объект к типу KengorooSmall
        KengorooSmall other = (KengorooSmall) obj;

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
        return "Это кенгурусмалл" + this.getName();
    }
}
