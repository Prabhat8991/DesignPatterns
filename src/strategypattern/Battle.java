package strategypattern;

import strategypattern.advancecombat.AdvanceCombat;
import strategypattern.advancecombat.Hulkbuster;
import strategypattern.armouros.ArmourOs;
import strategypattern.armouros.Jarvis;
import strategypattern.armours.MarkOne;

public class Battle {
    public static void main(String[] args) {
        Armour markOne = new MarkOne();
        markOne.getSuitReady();
        markOne.initiateCombat();

        ArmourOs jarvis = new Jarvis();
        markOne.setArmourOs(jarvis);

        markOne.getSuitReady();

        AdvanceCombat hulkbuster = new Hulkbuster();
        markOne.setAdvanceCombat(hulkbuster);

        markOne.initiateCombat();
    }
}
