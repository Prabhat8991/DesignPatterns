package decoratorpattern;

public class DecoratorPatternPlayground {

    public static void main(String[] args) {

        Shake milkShake = new MilkShake();
        System.out.println("MilkShake cost: " + milkShake.getCost());
        System.out.println(milkShake.description());

        ChocolateDecorator milkShakeWithChocolate = new ChocolateDecorator(milkShake);
        System.out.println("Chocolate milk shake cost: " + milkShakeWithChocolate.getCost());
        System.out.println(milkShakeWithChocolate.description());

        IceCreamDecorator milkShakeWithChocolateAndIcecream = new IceCreamDecorator(milkShakeWithChocolate);
        System.out.println("Milkshake with Icecream and chocolate cost: " + milkShakeWithChocolateAndIcecream.getCost());
        System.out.println(milkShakeWithChocolateAndIcecream.description());

    }
}
