//to find if received command line arguements
import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1=sc.next();
      if(args.length>0){
        for(int i=0;i<args.length;i++){
          System.out.print(i);
          if(i<args.length-1){
            System.out.print(", ");
          }
          else{
            System.out.println();
          }
        }
      }
      else{
        System.out.println("no value");
      }
        
    }
}
