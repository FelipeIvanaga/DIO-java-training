package com.felipeivanaga.gof.singleton;

/**
 * "Lazy" Singleton
 *
 * @author FelipeIvanaga
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
