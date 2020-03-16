package Masha;

import java.util.concurrent.atomic.AtomicReference;

public final class Singleton {
    private static AtomicReference<Singleton> instance;

    private Singleton() {
        instance = new AtomicReference<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            Singleton s = new Singleton();
            instance.compareAndSet(null, s);
        }
        return instance.get();
    }
}
