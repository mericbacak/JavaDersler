package PolyMorfizim;
//32 - Polymorphism ( Çok Biçimlilik )
class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println(" Hayvan konuşuyor...");
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" Ötüyor");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" havlıyor");
    }
}

class Horse extends Animal{
    public Horse(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName()+" kişniyor");
    }
}
public class Main {
    public static void speaktry(Animal animal){
        animal.speak();
    }
    public static void main(String[] args){
        Animal animal= new Animal(" Hayvan");
        Dog dog= new Dog(" Marley");
        Bird bird= new Bird(" Tweety");
        Horse horse= new Horse(" Şahbatur");
        animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();
        speaktry(new Bird("Thnikiy"));
        }
    }


