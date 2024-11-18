//Abstraction -> it hides unnecessary data from user and only exposes the necessary data
//e.g -> zipfile ->  if we download zip file , when zip is unzipped we can know what is there inside but we cannot know the functions used to create exe file
//abstract  class Demo{
//   //method
//    abstract void display();
//}
//public class OOPS extends Demo {
//    void display() {
//        System.out.println("method called");
//    }
//
//
//    public static void main(String[] args) {
//OOPS obj = new OOPS();
//obj.display();
//    }
//
//}


 //encapsulation -> binding variables and methods under single entity
 //e.g -> capsule - > here a capsule of medicine haa multiple drugs into it
// class Employee{
//    String name;
//
//    public void  setname(String name) {
//        this.name = name;
//    }
//    public String getname(){
//        return name;
//    }
//
//     public static void main(String[] args) {
//         Employee e1 = new Employee();
//         e1.setname("John");
//         System.out.println(e1.getname());
//
//     }
//
// }






//inheritance -> acquirring property of one class to another class
//eg -> consider animal example the animal can be a dog ,a dog can eat as well as sleep  all the charector is inherited

//class Employee{
//    int salary=400;
//}
//class Programmer extends Employee{
//    int Bonus=400;
//}
//public class OOPS {
//    public static void main(String[] args) {
//        Programmer Programmer=new Programmer();
//        System.out.println(Programmer.Bonus);
//        System.out.println(Programmer.salary);
//    }
//}







//polymorphism -> performing tasks in different ways
//eg -> drawing of polygon there can be multiple shapes like square , rectangle etc
 //this is also example for overloading -> multiple function with same name but diff parameters
//class helper{
//    static int multiply(int a, int b){
//        return a*b;
//    }
//    static double multiply(double a, double b){
//        return a*b;
//    }
//}
//public class OOPS
//{
//    public static void main(String[] args) {
//        helper help = new helper();
//        System.out.println(helper.multiply(2,4));
//        System.out.println(helper.multiply(2.4,3.4));
//    }
//}


//method overirde - >if a function is called in parent class same function can be called in child class
//
// class Animal {
//    void sound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void sound() {
//        System.out.println("Dog barks");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Animal myDog = new Dog(); // Upcasting
//        myDog.sound(); // Calls the overridden method in Dog class
//    }
//}

