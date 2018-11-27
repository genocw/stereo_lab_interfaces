import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecordDeck extends Component {

    private SpeedType currentSpeed;

    public RecordDeck(String make, String model) {
        super(make, model);
        this.currentSpeed = SpeedType.SPEED1;
    }

    public String playRecord() {
        return "I'm playing a record!";
    }

    public SpeedType getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void changeSpeed(SpeedType newSpeed) {
        this.currentSpeed = newSpeed;
    }

}
