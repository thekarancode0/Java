import java.util.Scanner;

public class Project7Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double result = 0;
        boolean firstInput = true;

        System.out.println("---Simple Calculator---");
        System.out.println("Type, exit to quit");

        while(true){
            if(firstInput){
                System.out.print("Enter a number: ");
                if(read.hasNextDouble()){
                    result = read.nextDouble();
                    firstInput = false;
                }else{
                    String input = read.next();
                    if(input.equalsIgnoreCase("exit"))break;
                    else{
                        System.out.println("Invalid input, try again.");
                        continue;
                    }
                }
            }
            System.out.print("Enter operator(+,-,*,/) or 'exit' : ");
            String op = read.next();
            if(op.equalsIgnoreCase("exit")) break;

            System.out.print("Enter next number: ");
            if(!read.hasNextDouble()){
                System.out.println("Invalid number. Try again.");
                read.next();
                continue;
            }
            double num = read.nextDouble();
            switch (op){
                case "+":
                    result += num;
                    break;
                case "-":
                    result -= num;
                    break;
                case "*":
                    result *= num;
                    break;
                case "/":
                    if(num != 0){
                        result /= num;
                    }else{
                        System.out.println("Error: cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }
            System.out.println("Current result: " + result);
        }
        System.out.println("Final result: " + result);
        read.close();
    }
}
