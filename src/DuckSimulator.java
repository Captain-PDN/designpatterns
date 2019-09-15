public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }
    private void simulate() {
        QuackAble mallardDuck = new QuackCounter(new QuackEcho(new  MallardDuck()));
        QuackAble redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        QuackAble rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        QuackAble gooseDuck = new GooseAdapter(new Goose());
        QuackAble pigeonDuck = new PigeonAdapter(new Pigeon());
        System.out.println("\nDuck Simulator: With Decorator");
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
