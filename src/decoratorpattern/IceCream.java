package decoratorpattern;

public class IceCream extends ShakeDecorator {

    IceCream(Shake shake) {
        this.shake = shake;
    }

    @Override
    int getCost() {
        return shake.getCost() + 30;
    }

    @Override
    String description() {
        return shake.description() + " and with Icecream";
    }
}
