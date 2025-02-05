package entity.animals;
import entity.Obj;
import entity.enums.Intelligence;
import entity.enums.SpeechVolume;

public abstract class Animal extends Obj {
    private String name;
    private Intelligence intelligence;
    private SpeechVolume speechVolume;

    public Animal(String name, Intelligence intelligence, SpeechVolume speechVolume){
        this.name = name;
        this.intelligence = intelligence;
        this.speechVolume = speechVolume;
    }

    public abstract void strayChance(int delta);

    public String getName(){
        return name;
    }

    public Intelligence getIntelligence(){
        return intelligence;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setIntelligence(Intelligence intelligence){
        this.intelligence = intelligence;
    }

    public SpeechVolume getSpeechVolume(){
        return speechVolume;
    }

    public void setSpeechVolume(SpeechVolume speechVolume){
        this.speechVolume = speechVolume;
    }
}
