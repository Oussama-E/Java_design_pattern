public class PicVert implements RobotFactory{
    @Override
    public Robot creerRobot() {
        return new SimpleRobot.Builder("Pic_vert").canonPower(3).shieldPower(3).shootFrequency(30).build();
    }
}
