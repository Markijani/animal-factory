package us.kvitko.catfactoryapp.model.entity;

public abstract class Animal {

    private int age;
    private double weight;
    private Color color;
    private long id;

    public Animal(int age, double weight, Color color, long id) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cat {"  +
                "age=" + age +
                ", weight=" + weight +
                ", color=" + color +
                ", id=" + id +
                '}';
    }
}
