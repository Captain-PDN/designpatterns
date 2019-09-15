public class CounterEchoDuckFactory extends AbstractDuckFactory{
    public QuackAble createMallardDuck() {
        return new QuackCounter(new QuackEcho(new MallardDuck()));
    }
    public QuackAble createRedheadDuck() {
        return new QuackCounter(new QuackEcho(new RedheadDuck()));
    }
    public QuackAble createRubberDuck() {
        return new QuackCounter(new QuackEcho( new RubberDuck()));
    }
}
