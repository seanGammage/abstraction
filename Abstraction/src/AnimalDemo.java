public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        Cat cat = new Cat("Whiskers", "Tabby");

        System.out.println(dog.getName() + " says:");
        dog.makeSound();

        System.out.println(cat.getName() + " says:");
        cat.makeSound();
    }
}
