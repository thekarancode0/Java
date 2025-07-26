public class copyConstructor {
    static class Student{
        String name;
        int id;
        Student(String name, int id){
            this.name = name;
            this.id = id;
        }

        //copyConstructor
        Student(Student obj){
            this.name = obj.name;
            this.id = obj.id;
        }

        void detail(){
            System.out.println("Name: " + name);
            System.out.println("Id: " + id);
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
            Student s = new Student("Karan",878);
            Student s1 = new Student(s);

            s.detail();
            s1.detail();
    }
}
