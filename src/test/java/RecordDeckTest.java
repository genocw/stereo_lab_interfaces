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

}
