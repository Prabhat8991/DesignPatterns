package decoratorpattern;

public class ChocolateDecorator extends ShakeDecorator {

    ChocolateDecorator(Shake shake) {
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
