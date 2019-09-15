public class GooseAdapter implements QuackAble {
    private Goose goose;
    GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    public void quack() {
        goose.honk();
    }
}
