import java.util.ArrayList;

public class Flock implements QuackAble {
    private ArrayList<QuackAble> quackers = new ArrayList<>();
    void add(QuackAble quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        for (int i = 0; i < quackers.size(); i++) {
            if (i == 0) {
                quackers.get(i).quack();
                quackers.get(i).quack();
            }
            quackers.get(i).quack();
        }
    }
}

