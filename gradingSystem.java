public class gradingSystem {
    public static void main(String[] args) {
        int marks = 78;
        if (marks >= 60) {
            System.out.println("Grade A");
        }else if(marks <= 60){
            System.out.println("Grade B");
        }else if(marks <= 30){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade F");
        }
    }
}
