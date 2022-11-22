package OOP.Interface.Demo;

public interface A {
    // static interface methods should always have a body
    // call via the interface name
    static void greeting() {
        System.out.println("Hi I am static method");
    }

    default void fun() {
        System.out.println("I am in A");
    }
}
