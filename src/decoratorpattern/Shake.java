package decoratorpattern;

public abstract class Shake {
    int getCost() {
        return 0;
    }
    String description() {
        return "Unknown Shake";
    }
}
