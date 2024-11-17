public class MethodsorFunctions {
    public static void PrintFunction(){
        System.out.println("Printing Function");
    }
public static void PrintName(String name){ //here the type is string and we are passing parameter name
    System.out.println(name); //we will be printing the name
}
public static void Number(int a , int b){
   int sum = a+b;
    System.out.println(sum);
}


    public static void main(String[] args) {
    PrintFunction();
        PrintFunction(); //here a function is being called so we donot have to write the function many times
        PrintFunction();

        PrintName("adithya"); //here the function is called and the paramter name is adithya : since string the value is written inside ""

    Number(1,5);
    }
}
