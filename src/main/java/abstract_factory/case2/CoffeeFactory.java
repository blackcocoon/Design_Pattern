package abstract_factory.case2;

public abstract class CoffeeFactory {

    public static Coffee offer(CoffeeFactory coffeeFactory) {
        return coffeeFactory.create();
    }

    protected abstract Coffee create();
}
