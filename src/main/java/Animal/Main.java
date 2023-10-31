package Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.move();

        Fish fish1 = new Fish();
        fish1.move();

        Duck duck1 = new Duck();
        duck1.move();
    }
}

abstract class Animal {
    public abstract void move();
}

class Cat extends Animal {
    public void move() {
        System.out.println("Я побежал");
    }
}

class Fish extends Animal {
    public void move() {
        System.out.println("Я поплыла");
    }
}

class Duck extends Animal {
    public void move() {
        System.out.println("Я полетела");
    }
}