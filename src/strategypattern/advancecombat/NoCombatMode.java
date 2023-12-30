package strategypattern.advancecombat;

public class NoCombatMode implements AdvanceCombat {

    @Override
    public void getAdvanceCombatReady() {
        System.out.println("No combat mode is invoked sir");
    }
}
