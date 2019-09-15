public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CounterEchoDuckFactory();
        simulator.simulate(duckFactory);
    }
    private void simulate(AbstractDuckFactory duckFactory) {
        QuackAble mallardDuck = duckFactory.createMallardDuck();
        QuackAble redheadDuck = duckFactory.createRedheadDuck();
        QuackAble rubberDuck = duckFactory.createRubberDuck();
        QuackAble gooseDuck = new GooseAdapter(new Goose());
        QuackAble pigeonDuck = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Decorator And Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeonDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    private void simulate(QuackAble duck) {
        duck.quack();
    }
}
