import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    MP3 mp3;
    Stereo stereo;
    Radio radio;
    RecordDeck record;

    @Before
    public void setup() {
        mp3 = new MP3();
        radio = new Radio("Sony", "S210");
        record = new RecordDeck("Sony", "S310");
        stereo = new Stereo(radio, record, "Herbs");
    }

    @Test
    public void canConnect() {
        assertEquals("Herbs", mp3.connect(stereo));
    }

}
