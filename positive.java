import java.util.Scanner;
class demo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0){
            if(num==0){
                System.out.println("zero");
            }else{
                System.out.println("positive");
            }   
        }else{
            System.out.println("negative");
        }
        
    }
}
