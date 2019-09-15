public class PigeonAdapter implements QuackAble {
    private Pigeon pigeon;
    PigeonAdapter(Pigeon pigeon){
        this.pigeon = pigeon;
    }
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
