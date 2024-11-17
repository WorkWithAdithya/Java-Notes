import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
//inputs can be taken from scanner

        Scanner scanthis=new Scanner(System.in);
        System.out.println("enter your age :");
//        int name=scanthis.nextInt(); //here int is the type where we are collecting the info from scanner
//        System.out.println(name);

//        float name=scanthis.nextFloat(); //here the type is float
//        System.out.println(name);

//       String name = scanthis.next(); //for string we do not have to to add nextString
//        System.out.println(name); //here only one word is selected in a sentence

        //if we want to select whole line in a string we have to do this
        String Fname=scanthis.nextLine(); //nextLine is called to select whole line in a string
        System.out.println(Fname);
    }
}
