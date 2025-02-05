package entity.animals;
import java.util.Random;
import entity.enums.Intelligence;
import entity.enums.SpeechVolume;
import interfaces.Speaking;
import interfaces.Thinking;
import exceptions.checkNameException;

public class Tiger extends Animal implements Thinking, Speaking {
    public Tiger(String name, Intelligence intelligence, SpeechVolume speechVolume) {
        super(name, intelligence, speechVolume);
    }

    @Override
    public void wayOfThinking() {
        if (this.getIntelligence().getCoefficent() == 100) {
            System.out.print(" и с умным видом " + "стал объяснять, что произошло");
        } else if (this.getIntelligence().getCoefficent() == 75) {
            System.out.print(" стал объяснять, что произошло");
        } else if (this.getIntelligence().getCoefficent() == 50) {
            System.out.print(" и недоумевая, начал объяснять, что произошло");
        } else if (this.getIntelligence().getCoefficent() == 25) {
            System.out.print(" и даже не подумав, начал нести всякую чушь");
        }
    }
    public void checkNameNew() throws checkNameException {
        if (this.getName() == null){
            throw new checkNameException("Ошибка из за неправильного имени!");
        }
    }

    @Override
    public void wayOfSpeaking() {
        if (this.getSpeechVolume().getVolume() == 100) {
            System.out.print(this.getName() + " громким голосом");
        } else if (this.getSpeechVolume().getVolume() == 50) {
            System.out.print(this.getName() + " не громко");
        } else if (this.getSpeechVolume().getVolume() == 0) {
            System.out.print(this.getName() + " тихонько");
        }
    }

    @Override
    public void strayChance(int delta){
        if (this.getIntelligence().getCoefficent() >= 75){
            Random random = new Random();
            int chance = random.nextInt(100);
            if (chance < 70){ // проверка что 10 + delta от нуля до 100
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

        // Приводим объект к типу Medved
        Tiger other = (Tiger) obj;

        // Сравниваем поля name и intelligence пошагово
        if (getName() == null) {
            if (other.getName() != null) return false; // Если наш name null, а у другого не null, то объекты не равны
        } else if (!getName().equals(other.getName())) {
            return false; // Если name не равны, объекты не равны
        }

        if (getIntelligence() == null) {
            if (other.getIntelligence() != null) return false; // Если наш intelligence null, а у другого не null, то объекты не равны
        } else if (!getIntelligence().equals(other.getIntelligence())) {
            return false; // Если intelligence не равны, объекты не равны
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17; // Начальное значение хэша

        // Добавляем хэш-код поля name
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);

        // Добавляем хэш-код поля intelligence
        result = 31 * result + (getIntelligence() != null ? getIntelligence().hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "Это тайгер" + this.getName();
    }



    //    @Override
//    public boolean equals(Object obj) {
//        // Проверяем, является ли объект тем же самым экземпляром
//        if (this == obj) return true;
//
//        // Проверяем, является ли объект null или принадлежит другому классу
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        // Приводим объект к типу Tiger
//        Tiger other = (Tiger) obj;
//
//        // Сравниваем поле name
//        if (getName() == null) {
//            return other.getName() == null; // Если наш name null, проверяем, что и у другого объекта name null
//        } else {
//            return getName().equals(other.getName()); // Иначе сравниваем значения
//        }
//        if (getIntelligence() == null) {
//            return other.getIntelligence() == null; // Если наш Intelligence null, проверяем, что и у другого объекта Intelligence null
//        } else {
//            return getIntelligence().equals(other.getIntelligence()); // Иначе сравниваем значения
//        }
//    }

    //    @Override
//    public int hashCode() {
//        // Генерируем хэш-код на основе поля name
//        return getName() != null ? getName().hashCode() : 0;
//    }
}