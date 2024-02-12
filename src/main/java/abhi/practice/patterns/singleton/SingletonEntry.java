package abhi.practice.patterns.singleton;

public class SingletonEntry {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("Abhinav");
        Singleton singleton2 = Singleton.getInstance("Prakash");

        System.out.println("Singleton 1: " + singleton1);
        System.out.println("Singleton 2: " + singleton2);

        SingletonLazy singletonLazy1 = SingletonLazy.getInstance("Rahul");
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance("Dutta");

        System.out.println("singletonLazy 1: " + singletonLazy1);
        System.out.println("singletonLazy 2: " + singletonLazy2);
    }
}
