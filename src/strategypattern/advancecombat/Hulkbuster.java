package strategypattern.advancecombat;

public class Hulkbuster implements AdvanceCombat{
    @Override
    public void getAdvanceCombatReady() {
        System.out.println("Hulkbuster is getting ready sir...");
    }
}
