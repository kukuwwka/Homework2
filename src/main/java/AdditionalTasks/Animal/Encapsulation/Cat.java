package AdditionalTasks.Animal.Encapsulation;

public class Cat {
    private String name; // исправлен модификатор доступа
    private int age;     // исправлен модификатор доступа
    private int weight;  // исправлен модификатор доступа

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {  // добавлен геттер
        return weight;
    }

    public void setWeight(int weight) { // добавлен сеттер
        this.weight = weight;
    }
}
