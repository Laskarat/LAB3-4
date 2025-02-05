package entity.enums;

public enum Intelligence {
    VERY_SMART(100),
    SMART(75),
    NORMAL(50),
    DUMB(25);


    private int coefficent;

    private Intelligence(int coefficent){
        this.coefficent = coefficent;
    }

    public int getCoefficent(){
        return coefficent;
    }
}

