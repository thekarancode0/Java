package string;

import org.w3c.dom.ls.LSOutput;

public class BasicCore {
    public static void main(String[] args) {
//        String s = "karan";
//        String q = "karan";
//        String w = new String("karan");
//        System.out.println(s == q);
//        System.out.println(q == w);

        String s = "karancode0";
        System.out.println("Length: " + s.length());
        System.out.println("Char at 4: " + s.charAt(4));
        System.out.println("Substring: " + s.substring(5));
        System.out.println("Substring: " + s.substring(3,7));
        System.out.println("Equals(reference): " + s.equals("karacode0"));

        System.out.println("--------------------------");
        System.out.println("mainKaranCode".equalsIgnoreCase("MainKarancode"));
        System.out.println("Compare: " + "apple".compareTo("banaba"));
        System.out.println("KARAN".toLowerCase());
        System.out.println("jilagopalganjkehum".toUpperCase());
        System.out.println("Trim: " + "   karan   ".trim());


        String name = "shrinath ji gopalganj";
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" ji"));
        System.out.println("___________________________");
        System.out.println(String.join("$$","Karan","kumar","gopalganj","bihar"));
        System.out.println("_____split-----------");
        String address = "Hajiyapur,Gopalganj,Bihar,India";
        String[] subAddress = address.split(",");

        System.out.println(address);
        for(String add: subAddress){
            System.out.println(add);
        }

        String state = "Bihar";
        System.out.println(state.concat("TOP"));
        System.out.println(state);
    }
}
