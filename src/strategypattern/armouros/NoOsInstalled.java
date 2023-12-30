package strategypattern.armouros;

public class NoOsInstalled implements ArmourOs {
    @Override
    public void installArmourOs() {

    }

    @Override
    public String armourname() {
        return "No ArmourOs";
    }
}
