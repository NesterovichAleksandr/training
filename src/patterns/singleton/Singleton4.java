package patterns.singleton;

/*
    Синхронизация полезна только один раз, при первом обращении к getInstance(),
    после этого каждый раз, при обращении этому методу, синхронизация просто забирает время.
 */
class Singleton4 {

    private static Singleton4 instance;

    private Singleton4() {
    }

    public static synchronized Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
