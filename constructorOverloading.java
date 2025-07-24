public class constructorOverloading {
    static class Student{
        String name;
        int age;

        //Default
        Student(){
            this.name = "Unknown";
            this.age = 0;
        }

        //Partial Parameterized
        Student(String name){
            this.name = name;
            age = 18;
        }
        //Parameterized
        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        void detail(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.detail();
        System.out.println("-------------");
        Student s2 = new Student("Karan");
        s2.detail();
        System.out.println("-------------");
        Student s3 = new Student("Karan",33);
        s3.detail();
    }
}
