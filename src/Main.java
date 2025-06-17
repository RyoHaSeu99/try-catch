

class Util {
    public static void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

@FunctionalInterface
interface A {
    public void say(String name);
}

public class Main {
    public static void main(String[] args) {
        A a = (String name) -> Util.sayHello(name);

        a.say("RyoHaSeu");


    }
}