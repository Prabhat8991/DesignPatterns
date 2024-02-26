package decoratorpattern;

public class Chocolate extends ShakeDecorator {

    Chocolate(Shake shake) {
        this.shake = shake;
    }

    @Override
    int getCost() {
        return 10 + shake.getCost();
    }

    @Override
    String description() {
        return shake.description() + "with " + "Chocolate";
    }
}
