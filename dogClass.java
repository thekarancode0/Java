
public class dogClass {
    static class Dog{
        String name;
        String breed;
        int age;
        Dog(String name, String breed){
            this.name = name;
            this.breed = breed;
        }

        void bark(){
            System.out.println("Dog is Barking...");
        }

        void setAge(int age){
            if(age >= 0){
                this.age = age;
            }else{
                System.out.println("Invalid input!!");
            }
        }
        int getAge(){
            return age;
        }
        void detail(){
            System.out.println("Name: " + name + " Breed: " + breed);
        }
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Tom","Husky");
        Dog d2 = new Dog("Tommy","Labrador");
        d1.detail();
        d1.setAge(2);
        d1.bark();
        System.out.println("Age: " + d1.getAge());
        System.out.println("------------------");
        d2.setAge(4);
        d2.bark();
        System.out.println("Age: " + d1.getAge());
    }
}
