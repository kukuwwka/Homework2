package InterfaceRunnable;

import java.util.TreeMap;

class Animals implements Runnable {

    @Override
    public void run() {
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
    }

    public class Dog {
        String name;
        int age;
        String color;
    }

    public class Bird {
        String name;
        int age;
        String color;
    }

    public class Fish {
        String name;
        int age;
        String color;
    }
}