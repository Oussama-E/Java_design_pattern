public class DoubledCanon extends Amelioration{
    private int multiplicator;

    public DoubledCanon(Robot improvedRobot) {
        super(improvedRobot);
        this.multiplicator = 2;
    }

    public DoubledCanon(Robot improvedRobot, int multiplicator) {
        super(improvedRobot);
        this.multiplicator = multiplicator;
    }

    @Override
    public int getCanon() {
        return super.getCanon() * multiplicator;
    }
}
