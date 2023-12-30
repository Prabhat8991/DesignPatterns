package strategypattern.advancecombat;

public class SpellProtector implements AdvanceCombat {
    @Override
    public void getAdvanceCombatReady() {
        System.out.println("SpellProtector combat mode is activating..");
    }
}
