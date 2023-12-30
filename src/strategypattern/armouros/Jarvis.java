package strategypattern.armouros;

public class Jarvis implements ArmourOs {

    @Override
    public void installArmourOs() {
        System.out.println("Jarvis at your service.. ");
    }

    @Override
    public String armourname() {
        return "Jarvis";
    }
}
