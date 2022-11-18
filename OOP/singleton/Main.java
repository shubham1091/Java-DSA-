package OOP.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.geInstance("shubham");
        Singleton obj2 = Singleton.geInstance("aayushi");
        Singleton obj3 = Singleton.geInstance("ashnoor");

        // all three ref variable are pointing to just one object

        System.out.println(obj.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);
        // name will not be changed

    }

}
