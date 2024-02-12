package abhi.practice.patterns.singleton;

import java.util.Objects;

public class SingletonLazy {

    private static SingletonLazy instance = null;
    private final String name;
    private SingletonLazy(String name){
        this.name = name;
    }

    public static SingletonLazy getInstance(String name){
            if (Objects.isNull(instance)) {
                synchronized (SingletonLazy.class) {
                    if(Objects.isNull(instance)) {
                        instance = new SingletonLazy(name);
                    }
                }
            }
            return instance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
