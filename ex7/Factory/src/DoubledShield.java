public class DoubledShield extends Amelioration{
    private int multiplicator;
    public DoubledShield(Robot improvedRobot) {
        super(improvedRobot);
        this.multiplicator = 2;
    }

    public DoubledShield(Robot improvedRobot, int multiplicator) {
        super(improvedRobot);
        this.multiplicator = multiplicator;
    }

    @Override
    public int getShield() {
        return super.getShield()*multiplicator;
    }
}
