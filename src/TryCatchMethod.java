public class TryCatchMethod {
    public static void main(String[] args) {
        int[] number={10,20,30,40,50};
        try {
            System.out.println(number[7]); //if we know there is any possible errors we put it in try block
        }catch(Exception exception) {
//try solving the by adding code   //here we will decide what to do with the code
        }
        System.out.println("the issue is resolved"); // this is will eventually print even if error has occur
    }
}
