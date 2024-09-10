public class Tank implements RobotFactory{
    @Override
    public Robot creerRobot() {
        return new SimpleRobot.Builder("Tank").shootFrequency(300).canonPower(7).lifePoint(400).shieldPower(10).build();
    }
}
