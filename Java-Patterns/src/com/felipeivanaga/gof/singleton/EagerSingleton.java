package com.felipeivanaga.gof.singleton;

/**
 * "Eager" Singleton
 *
 * @author FelipeIvanaga
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        super();
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
