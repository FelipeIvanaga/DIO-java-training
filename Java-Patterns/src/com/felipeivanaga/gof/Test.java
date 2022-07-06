package com.felipeivanaga.gof;

import com.felipeivanaga.gof.singleton.EagerSingleton;
import com.felipeivanaga.gof.singleton.LazyHolderSingleton;
import com.felipeivanaga.gof.singleton.LazySingleton;

public class Test {
    public static void main(String[] args) {
        System.out.println("\n###Singleton###");
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println("Lazy mem: " + lazy);
        lazy = LazySingleton.getInstance();
        System.out.println("Lazy mem: " + lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println("Eager mem: " + eager);
        eager = EagerSingleton.getInstance();
        System.out.println("Eager mem: " + eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println("Lazy Holder mem: " + lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println("Lazy Holder mem: " + lazyHolder);


    }
}
