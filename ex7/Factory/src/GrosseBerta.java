public class GrosseBerta implements RobotFactory{
    @Override
    public Robot creerRobot() {
        return new SimpleRobot.Builder("Grosse_berta").shootFrequency(300).canonPower(20).build();
    }
}
