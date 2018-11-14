package patterns.singleton;

/*
    Отсутствует:
    - ленивая инициализация
    - возможность обработки исключений
 */

class Singleton2 {

    private static Singleton2 instance = new Singleton2();

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
