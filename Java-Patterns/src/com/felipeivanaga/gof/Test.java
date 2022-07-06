package com.felipeivanaga.gof;

import com.felipeivanaga.gof.facade.Facade;
import com.felipeivanaga.gof.singleton.EagerSingleton;
import com.felipeivanaga.gof.singleton.LazyHolderSingleton;
import com.felipeivanaga.gof.singleton.LazySingleton;
import com.felipeivanaga.gof.strategy.*;

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

        System.out.println("\n###Strategy###");
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();

        System.out.println("\n###Facade###");
        Facade facace = new Facade();
        facace.migrateClient("Tyler", "82100-150");
    }
}
