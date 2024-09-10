public class HalfDamage extends Amelioration{
    private int improvement;

    public HalfDamage(Robot improvedRobot) {
        super(improvedRobot);
        this.improvement = 2;
    }

    public HalfDamage(Robot improvedRobot, int improvement) {
        super(improvedRobot);
        this.improvement = improvement;
    }

    @Override
    public int diffLife(int i) {
        return super.diffLife(i/improvement);
    }
}
