import entity.animals.*;
import java.util.Scanner;
import entity.enums.*;
import entity.humans.*;
import exceptions.checkIntelligenceCheckedException;
import other.Forest;

public class Main {
    public static void main(String[] args) {
        Medved puh = new Medved("Жмиль", Intelligence.VERY_SMART, SpeechVolume.QUIET);
        Pig pyatochok = new Pig("Наки", Intelligence.VERY_SMART, SpeechVolume.MEDIUM);
        Tiger tigra = new Tiger("Милов", Intelligence.VERY_SMART, SpeechVolume.QUIET);
        Rabbit krolik = new Rabbit("Волков", Intelligence.VERY_SMART, SpeechVolume.QUIET);
        Kengoroo kroshkaru = new Kengoroo("Жданов", Intelligence.VERY_SMART, SpeechVolume.LOUD);
        Kengoroo kenga = new KengorooSmall("Певчих", Intelligence.VERY_SMART, SpeechVolume.LOUD);
        KristoferRobin kristopherrobin = new KristoferRobin("Албуров", Intelligence.VERY_SMART);
        Forest forest = new Forest(40);
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите время суток:");
            System.out.println("1 - День");
            System.out.println("2 - Ночь");
            System.out.println("3 - Утро");
            int choice = scanner.nextInt();
            scanner.close();
            try {
                kristopherrobin.checkIntelligence();
            } catch (checkIntelligenceCheckedException e){
                System.out.println(e.getMessage());
                return;
            }
            if (choice == 1 && (forest.density() >= 0 && forest.density() <= 40)) {
                tigra.checkNameNew();
                tigra.strayChance(20); // +20% что не заблудятся
                krolik.strayChance(20);
                pyatochok.strayChance(20);
                puh.strayChance(20);
                kenga.strayChance(20);
                kroshkaru.strayChance(20);
                puh.wayOfThinking();
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (choice == 1 && (forest.density() >= 41 && forest.density() <= 100)) {
                tigra.checkNameNew();
                tigra.strayChance(10); // +10% что не заблудятся
                krolik.strayChance(10);
                pyatochok.strayChance(10);
                puh.strayChance(10);
                kenga.strayChance(10);
                kroshkaru.strayChance(10);
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (choice == 2 && (forest.density() >= 0 && forest.density() <= 40)) {
                tigra.checkNameNew();
                tigra.strayChance(-15); // -15% что не заблудятся
                krolik.strayChance(-15);
                pyatochok.strayChance(-15);
                puh.strayChance(-15);
                kenga.strayChance(-15);
                kroshkaru.strayChance(-15);
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (choice == 2 && (forest.density() >= 41 && forest.density() <= 100)) {
                tigra.checkNameNew();
                tigra.strayChance(-20); // -20% что не заблудятся
                krolik.strayChance(-20);
                pyatochok.strayChance(-20);
                puh.strayChance(-20);
                kenga.strayChance(-20);
                kroshkaru.strayChance(-20);
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (choice == 3 && (forest.density() >= 0 && forest.density() <= 40)) {
                tigra.checkNameNew();
                tigra.strayChance(8); // +5% что не заблудятся
                krolik.strayChance(8);
                pyatochok.strayChance(8);
                puh.strayChance(8);
                kenga.strayChance(8);
                kroshkaru.strayChance(8);
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (choice == 3 && (forest.density() >= 41 && forest.density() <= 100)) {
                tigra.checkNameNew();
                tigra.strayChance(5); // +5% что не заблудятся
                krolik.strayChance(5);
                pyatochok.strayChance(5);
                puh.strayChance(5);
                kenga.strayChance(5);
                kroshkaru.strayChance(5);
                puh.wayOfThinking();
                puh.wayOfSpeaking();
                tigra.wayOfSpeaking();
                tigra.wayOfThinking();
                kroshkaru.wayOfSpeaking(tigra);
                kroshkaru.wayOfThinking();
                kenga.wayOfSpeaking();
                kenga.wayOfThinking();
                kristopherrobin.wayOfThinking();
            } else if (forest.density() >= 0 && forest.density() <= 100){
                System.out.println("Выберите число от 1 до 3!");
            }
            else{
                System.out.println("Выберите правильную плотность леса!");
            }
        }
    }
}



















// Добавить выбор дня, утра, ночи и влияние этого выбора на персонажей. Добавить исключения, сделать рекордер (лес например).
//        puh.wayOfThinking();
//        puh.wayOfSpeaking();
//        tigra.wayOfSpeaking();
//        tigra.wayOfThinking();
//        kroshkaru.wayOfSpeaking(tigra);
//        kroshkaru.wayOfThinking();
//        kenga.wayOfSpeaking();
//        kenga.wayOfThinking();
//            if(choice == 1 && (forest.density() >= 0 && forest.density() <= 40)){
//                tigra.strayChance(20); // +20% что не заблудятся
//                krolik.strayChance(20);
//                pyatochok.strayChance(20);
//                puh.strayChance(20);
//                kenga.strayChance(20);
//                kroshkaru.strayChance(20);
//            }
//            else if(choice == 1 && (forest.density() >= 41 && forest.density() <= 100)){
//                tigra.strayChance(10); // +10% что не заблудятся
//                krolik.strayChance(10);
//                pyatochok.strayChance(10);
//                puh.strayChance(10);
//                kenga.strayChance(10);
//                kroshkaru.strayChance(10);
//            }
//            else if(choice == 2 && (forest.density() >= 0 && forest.density() <= 40)){
//                tigra.strayChance(-15); // -15% что не заблудятся
//                krolik.strayChance(-15);
//                pyatochok.strayChance(-15);
//                puh.strayChance(-15);
//                kenga.strayChance(-15);
//                kroshkaru.strayChance(-15);
//            }
//            else if(choice == 2 && (forest.density() >= 41 && forest.density() <= 100)){
//                tigra.strayChance(-20); // -20% что не заблудятся
//                krolik.strayChance(-20);
//                pyatochok.strayChance(-20);
//                puh.strayChance(-20);
//                kenga.strayChance(-20);
//                kroshkaru.strayChance(-20);
//            }
//            else if(choice == 3 && (forest.density() >= 0 && forest.density() <= 40)){
//                tigra.strayChance(8); // +5% что не заблудятся
//                krolik.strayChance(8);
//                pyatochok.strayChance(8);
//                puh.strayChance(8);
//                kenga.strayChance(8);
//                kroshkaru.strayChance(8);
//            }
//            else if(choice == 3 && (forest.density() >= 41 && forest.density() <= 100)){
//                tigra.strayChance(5); // +5% что не заблудятся
//                krolik.strayChance(5);
//                pyatochok.strayChance(5);
//                puh.strayChance(5);
//                kenga.strayChance(5);
//                kroshkaru.strayChance(5);
//            }
//            else{
//                System.out.println("Выберите число от 1 до 3!");
//            }