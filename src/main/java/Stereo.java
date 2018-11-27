public class Stereo {

    private Radio radio;
    private RecordDeck record;
    private String name;

    public Stereo(Radio radio, RecordDeck record, String name) {
        this.radio = radio;
        this.record = record;
        this.name = name;
    }

    public Radio getRadio() {
        return this.radio;
    }

    public RecordDeck getRecord() {
        return record;
    }

    public String getName() {
        return name;
    }

    public String tuneRadio() {
        return this.radio.tune();
    }

    public String playRecord() {
        return this.record.playRecord();
    }

    public SpeedType getCurrentRecordSpeed() {
        return this.record.getCurrentSpeed();
    }

    public void changeRecordSpeed(SpeedType newSpeed) {
        this.record.changeSpeed(newSpeed);
    }
}
