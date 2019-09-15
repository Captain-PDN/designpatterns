public class QuackCounter implements QuackAble {
    private QuackAble duck;
    private static int numberOfQuacks;
    QuackCounter(QuackAble duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    static int getQuacks() {
        return numberOfQuacks;
    }
}
