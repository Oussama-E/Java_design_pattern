public class SimpleRobot implements Robot{
    private final String name;
    private int lifePoint;
    private final int canonPower;
    private final int shieldPower;
    private final int shootFrequency;

    private SimpleRobot(Builder builder){
        this.name = builder.name;
        this.lifePoint = builder.lifePoint;
        this.canonPower = builder.canonPower;
        this.shieldPower = builder.shieldPower;
        this.shootFrequency = builder.shootFrequency;
    }
    @Override
    public int getCanon() {
        return canonPower;
    }

    @Override
    public int getShield() {
        return shieldPower;
    }

    @Override
    public int getFreq() {
        return shootFrequency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        lifePoint += i;
        return lifePoint;
    }

    public static class Builder{
        private final String name;
        private int lifePoint = 100;
        private int canonPower = 1;
        private int shieldPower = 1;
        private int shootFrequency = 100;

        public Builder(String name){
            this.name = name;
        }

        public Builder lifePoint(int lifePoint){
            this.lifePoint = lifePoint;
            return this;
        }

        public Builder canonPower(int canonPower){
            this.canonPower = canonPower;
            return this;
        }

        public Builder shieldPower(int shieldPower){
            this.shieldPower = shieldPower;
            return this;
        }

        public Builder shootFrequency(int shootFrequency){
            this.shootFrequency = shootFrequency;
            return this;
        }

        public Robot build(){
            return new SimpleRobot(this);
        }

    }
}
