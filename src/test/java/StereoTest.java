import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    RecordDeck record;

    @Before
    public void setup() {
        radio = new Radio("Sony", "S190");
        record = new RecordDeck("Sony", "S320");
        stereo = new Stereo(radio, record, "Herbs");
    }

    @Test
    public void canTuneRadio() {
        assertEquals("I found a station!", stereo.tuneRadio());
    }

    @Test
    public void canPlayRecord() {
        assertEquals("I'm playing a record!", stereo.playRecord());
    }

    @Test
    public void canGetCurrentRecordSpeed() {
        assertEquals(SpeedType.SPEED1, stereo.getCurrentRecordSpeed());
    }

    @Test
    public void canChangeRecordSpeed() {
        stereo.changeRecordSpeed(SpeedType.SPEED2);
        assertEquals(SpeedType.SPEED2, stereo.getCurrentRecordSpeed());
    }

}
