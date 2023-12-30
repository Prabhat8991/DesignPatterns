package strategypattern;

import strategypattern.advancecombat.AdvanceCombat;
import strategypattern.advancecombat.NoCombatMode;
import strategypattern.armouros.ArmourOs;
import strategypattern.armouros.NoOsInstalled;

public abstract class Armour {

    private AdvanceCombat advanceCombat;
    private ArmourOs armourOs;

    protected Armour() {
       this.advanceCombat = new NoCombatMode();
       this.armourOs = new NoOsInstalled();
    }

    public void getSuitReady() {
        System.out.println(armourOs.armourname() + " is installed sir..");
    }

    public void initiateCombat() {
        advanceCombat.getAdvanceCombatReady();
    }

    public void setAdvanceCombat(AdvanceCombat advanceCombat) {
        this.advanceCombat = advanceCombat;
    }

    public void setArmourOs(ArmourOs armourOs) {
        this.armourOs = armourOs;
    }
}
