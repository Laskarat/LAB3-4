package entity.humans;
import entity.animals.Tiger;
import entity.enums.Intelligence;
import interfaces.Thinking;
import exceptions.checkIntelligenceCheckedException;

public class KristoferRobin extends Human implements Thinking {
    public KristoferRobin(String name, Intelligence intelligence) {
        super(name, intelligence);
    }

    public void checkIntelligence() throws checkIntelligenceCheckedException{
        if (this.getIntelligence() == null){
            throw new checkIntelligenceCheckedException("Ошибка из за неправильной характеристики интеллекта! Введите корректно!");
        }
    }

    @Override
    public void wayOfThinking(){
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String s : strayanimals) {
            sb.append(s + ", ");
            count += 1;
        }
        if (count == 0 && this.getIntelligence().getCoefficent() == 100) {
            System.out.print(this.getName() + " сразу понял, что никто не потерялся.");
        } else if (count == 0 && this.getIntelligence().getCoefficent() == 75) {
            System.out.print(this.getName() + " довольно быстро понял, что никто не потерялся.");
        } else if (count == 0 && this.getIntelligence().getCoefficent() == 50) {
            System.out.print("И прошло немало времени, пока " + this.getName() + " понял, что вроде бы никто не потерялся.");
        } else if (count == 0 && this.getIntelligence().getCoefficent() == 25) {
            System.out.print(this.getName() + " понял только на следующий день, что никто вроде не потерялся.");
        } else if (this.getIntelligence().getCoefficent() == 100 && count != 0) {
            System.out.print(this.getName() + " сразу понял, что " + sb.toString() + "оказавшиеся не пойми где, бродят где-то в тумане, заблудившись в лесной чаще.");
        } else if (this.getIntelligence().getCoefficent() == 75 && count != 0) {
            System.out.print(this.getName() + " довольно быстро понял, что " + sb.toString() + "оказавшиеся не пойми где, бродят где-то в тумане, заблудившись в лесной чаще.");
        } else if (this.getIntelligence().getCoefficent() == 50 && count != 0) {
            System.out.print("И прошло немало времени, пока " + this.getName() + " понял, что " + sb.toString() + "оказавшиеся не пойми где, бродят где-то в тумане, заблудившись в лесной чаще.");
        } else if (this.getIntelligence().getCoefficent() == 25 && count != 0) {
            System.out.print(this.getName() + " понял только на следующий день, что " + sb.toString() + "оказавшиеся не пойми где, потерялись и бродят где-то в лесной чаще.");
        }
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, является ли объект тем же самым экземпляром
        if (this == obj) return true;

        // Проверяем, является ли объект null или принадлежит другому классу
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приводим объект к типу Tiger
        KristoferRobin other = (KristoferRobin) obj;

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
        return "Это кристоферробин" + this.getName();
    }
}






















//        StringBuilder sb = new StringBuilder();
//        int count = 0;
//        for (String s : strayanimals){
//            sb.append(s + ", ");
//            count += 1;
//        }
//        if (count == 0 && this.getIntelligence().getCoefficent() == 100){
//            System.out.print(this.getName() + " сразу понял, что никто не потерялся");
//        }
//        else if (count == 0 && this.getIntelligence().getCoefficent() == 75){
//            System.out.print(this.getName() + " довольно быстро понял, что никто не потерялся" );
//        }
//        else if(count == 0 && this.getIntelligence().getCoefficent() == 50){
//            System.out.print("И прошло немало времени, пока " + this.getName() + " понял, что вроде бы никто не потерялся");
//        }
//        else if(count == 0 && this.getIntelligence().getCoefficent() == 25){
//            System.out.print(this.getName() + " понял только на следующий день, что никто вроде не потерялся");
//        }
//        else if (this.getIntelligence().getCoefficent() == 100 && count != 0) {
//            System.out.print(this.getName() + " сразу понял, что " + sb.toString() + "оказавшиеся в лесу, бродят где-то в тумане, заблудившись в лесной чаще.");
//        } else if (this.getIntelligence().getCoefficent() == 75 && count != 0) {
//            System.out.print(this.getName() + " довольно быстро понял, что " + sb.toString() + "оказавшиеся в лесу, бродят где-то в тумане, заблудившись в лесной чаще.");
//        } else if (this.getIntelligence().getCoefficent() == 50 && count != 0) {
//            System.out.print("И прошло немало времени, пока " + this.getName() + " понял, что " + sb.toString() + "оказавшиеся в лесу, бродят где-то в тумане, заблудившись в лесной чаще.");
//        } else if (this.getIntelligence().getCoefficent() == 25 && count != 0) {
//            System.out.print(this.getName() + " понял только на следующий день, что " + sb.toString() + "оказавшиеся в лесу, потерялись и бродят где-то в лесной чаще.");
//        }
//    }
//StringBuilder sb = new StringBuilder();
//for (String s : straykids)
//{
//    sb.append(s);
//}
//System.out.println(sb.toString()


