package strategypattern.armours;

import strategypattern.Armour;

public class MarkOne extends Armour {

    public MarkOne() {
        super();
    }

    @Override
    public void getSuitReady() {
        super.getSuitReady();
        System.out.println("MarkOne is ready sir...");
    }

    @Override
    public void initiateCombat() {
        super.initiateCombat();
        System.out.println("MarkOne engaged...");
    }
}
