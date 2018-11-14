package patterns.singleton;

//Отсутствует возможность обработки исключений
class Singleton3 {

    private Singleton3() {
    }

    private static class SingletonHolder {
        private final static Singleton3 INSTANCE = new Singleton3();
    }

    public static Singleton3 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
