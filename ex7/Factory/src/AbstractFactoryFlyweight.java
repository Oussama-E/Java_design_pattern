import java.util.HashMap;

public class AbstractFactoryFlyweight {
    private HashMap<String, RobotFactory> hashMap = new HashMap<>();

    public void put(String name, RobotFactory robotFactory){
        hashMap.put(name, robotFactory);
    }

    public Robot create(String name){
        return hashMap.get(name).creerRobot();
    }
}
