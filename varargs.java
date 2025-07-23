public class varargs {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int... args){
        int sum = 0;
        for(int arg: args){
            sum += arg;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(12,22));
        System.out.println(sum(11,11,22,33,22));
    }
}
