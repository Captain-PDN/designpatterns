public class QuackEcho implements QuackAble {
    private QuackAble duck;
    QuackEcho(QuackAble duck) {
        this.duck = duck;
    }
    public void quack() {
        duck.quack();
        echo();
    }

    private void echo(){
        System.out.print("Echo : ");
        duck.quack();
    }
}
