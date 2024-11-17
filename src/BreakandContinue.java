public class BreakandContinue {
    public static void main(String[] args) {
int i=0;
while(true){//true helps in running the code continuesly
   if(i==3) {
       i++;
       continue; //continue helps in moving the line of code back to the top
   }
       System.out.println(i);
    i++;
    if(i==5)
        break;
}
    }
}
