package decoratorpattern;

public class IceCreamDecorator extends ShakeDecorator {

    IceCreamDecorator(Shake shake) {
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
