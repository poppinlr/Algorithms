package basic;

public class Single {

    private static Single instance;

    private Single() {}

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        } else {
            return instance;
        }
        return instance;
    }
}
