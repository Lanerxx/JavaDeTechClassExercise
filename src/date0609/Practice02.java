package date0609;

public class Practice02 {
    public static void main(String[] args) {
        Practice02 p2 = new Practice02();
        p2.AnimalEat(new Dog());
        p2.AnimalEat(new Cat());
    }

    void AnimalEat(Animal animal){
        animal.eat();
        if (animal instanceof Dog){
            System.out.println("是狗子");
            ((Dog) animal).specialEat();
        }
    }
}

class Animal{
    String name;
    int age;
    void eat(){
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dogs eat bones.");
    }
    void specialEat(){
        System.out.println("Special");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("Cats eat fishes.");
    }
}