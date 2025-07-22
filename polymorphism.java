//Base class
class Animals {
    void makeSound(){
        System.out.println("Some generic animal sound");
    }
}

//child1
class Dog extends Animals{
    @Override
    void makeSound() {
        System.out.println("Woof!!");
    }
}

//child2
class Cat extends Animals{
    @Override
    void makeSound(){
        System.out.println("Meow!!");
    }
}

//child3
class Cow extends Animals{
    @Override
    void makeSound(){
        System.out.println("Moo!!");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3]; //reference
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Cow();

        for(Animals a : animals){
            a.makeSound();
        }

    }
}

