import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

   int systemNumber= (int)(Math.random()*100);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int number=scanner.nextInt();

        if (number < 0)
            System.out.println("enter a number which is greater than 0");

        else if(systemNumber == number){
            System.out.println("congrats you are the winner!");
            System.out.println("You have selected : "+number);
            System.out.println("the system generated number is :"+systemNumber);

        }
        else if ( number > systemNumber ){
            System.out.println("The number you entered is greater ");
            System.out.println("You have selected : "+number);
            System.out.println("the system generated number is :"+systemNumber);
        }
        else
            System.out.println("The number you entered is less ");
        System.out.println("You have selected : "+number);
        System.out.println("the system generated number is :"+systemNumber);


    }
}
