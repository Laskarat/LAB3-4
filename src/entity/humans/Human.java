package entity.humans;
import entity.Obj;
import entity.enums.Intelligence;

public abstract class Human extends Obj {
    private String name;
    private Intelligence intelligence;

    public Human(String name, Intelligence intelligence){
        this.name = name;
        this.intelligence = intelligence;
    }

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
}
