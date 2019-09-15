public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CounterEchoDuckFactory();
        simulator.simulate(duckFactory);
    }
    private void simulate(AbstractDuckFactory duckFactory) {
        QuackAble mallardDuck = duckFactory.createMallardDuck();
        QuackAble mallardDuck2 = duckFactory.createMallardDuck();
        QuackAble redheadDuck = duckFactory.createRedheadDuck();
        QuackAble redheadDuck2 = duckFactory.createRedheadDuck();
        QuackAble rubberDuck = duckFactory.createRubberDuck();
        QuackAble rubberDuck2 = duckFactory.createRubberDuck();
        QuackAble gooseDuck = new GooseAdapter(new Goose());
        QuackAble pigeonDuck = new PigeonAdapter(new Pigeon());

        Flock flockOFAll = new Flock();
        flockOFAll.add(mallardDuck);
        flockOFAll.add(mallardDuck2);
        flockOFAll.add(redheadDuck);
        flockOFAll.add(redheadDuck2);
        flockOFAll.add(rubberDuck);
        flockOFAll.add(rubberDuck2);
        flockOFAll.add(gooseDuck);
        flockOFAll.add(pigeonDuck);

        System.out.println("\nDuck Simulator: With Decorator, Factory And Composite Pattern");
        simulate(flockOFAll);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }
    private void simulate(QuackAble duck) {
        duck.quack();
    }
}
