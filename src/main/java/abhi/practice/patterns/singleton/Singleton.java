package abhi.practice.patterns.singleton;

import java.util.Objects;

public class Singleton {

    private static Singleton instance = null;
    private final String name;
    private Singleton(String name){
        this.name = name;
    }

    public static synchronized Singleton getInstance(String name){
            if (Objects.isNull(instance)) {
                instance = new Singleton(name);
            }
            return instance;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
