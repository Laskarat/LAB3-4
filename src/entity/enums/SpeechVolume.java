package entity.enums;

public enum SpeechVolume {
    LOUD(100),
    MEDIUM(50),
    QUIET(0);

    private int volume;

    private SpeechVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

}
