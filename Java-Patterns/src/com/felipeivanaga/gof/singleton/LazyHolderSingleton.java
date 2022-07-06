package com.felipeivanaga.gof.singleton;

/**
 * Lazy Holder Singleton
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Reference</a>
 *
 * @author FelipeIvanaga
 */
public class LazyHolderSingleton {
    private static class InstanceHolder {
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
