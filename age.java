import java.util.Scanner;
class age{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
    String op=(age>0 && age<=12)? "child":(age>=13 && age<=19)? "Teenage" :(age>=20 && age<=64)? "adult":"Senior";
		System.out.println(op);
	}
}
