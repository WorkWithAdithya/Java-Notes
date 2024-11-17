public class SwithStatements {
    public static void main(String[] args) {
        int day=1;
        switch (day){
            case 1:  //here 1 the value which was given above we can change the value if needed
                System.out.println("Monday");
                break; //this basically helps in getting out of the block/loop
            case 2:
                break;
            default:
                System.out.println("any day");
        }
    }
}
