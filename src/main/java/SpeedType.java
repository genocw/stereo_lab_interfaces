public enum SpeedType {

    SPEED1(33),
    SPEED2(45),
    SPEED3(78);

    private final int speed;

    SpeedType(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
