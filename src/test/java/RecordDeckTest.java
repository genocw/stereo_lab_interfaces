import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck record;

    @Before
    public void setup() {
        record = new RecordDeck("Phillips", "P210");
    }

    @Test
    public void canGetMake() {
        assertEquals("Phillips", record.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("P210", record.getModel());
    }

    @Test
    public void canPlayRecord() {
        assertEquals("I'm playing a record!", record.playRecord());
    }

    @Test
    public void startsOnLowestSpeed() {
        assertEquals(SpeedType.SPEED1, record.getCurrentSpeed());
    }

    @Test
    public void canChangeSpeed() {
        record.changeSpeed(SpeedType.SPEED2);
        assertEquals(SpeedType.SPEED2, record.getCurrentSpeed());
    }

}
