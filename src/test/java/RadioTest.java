import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setup() {
        radio = new Radio("Sony", "S190");
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("S190", radio.getModel());
    }

    @Test
    public void canTune() {
        assertEquals("I found a station!", radio.tune());
    }

}
