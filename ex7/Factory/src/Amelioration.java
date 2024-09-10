public abstract class Amelioration implements Robot {
    private Robot improvedRobot;

    public Amelioration(Robot improvedRobot){
        this.improvedRobot = improvedRobot;
    }
    @Override
    public int getCanon() {
        return improvedRobot.getCanon();
    }

    @Override
    public int getShield() {
        return improvedRobot.getShield();
    }

    @Override
    public int getFreq() {
        return improvedRobot.getFreq();
    }

    @Override
    public String getName() {
        return improvedRobot.getName();
    }

    @Override
    public int diffLife(int i) {
        return improvedRobot.diffLife(i);
    }
}
