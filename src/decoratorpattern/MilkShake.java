package decoratorpattern;

public class MilkShake extends Shake {

    @Override
    int getCost() {
        return 20;
    }

    @Override
    String description() {
        return "This is milk shake ";
    }
}
