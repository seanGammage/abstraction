public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
