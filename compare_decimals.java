import java.util.Scanner;
class compare_decimals{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("1st num:");
		int inp1=sc.nextInt();
		System.out.println("2nd num:");
		int inp2=sc.nextInt();
		int a,b;
		a=inp1%1000;
		b=inp2%1000;
		//System.out.println(a);
		//System.out.println(b);
		if(a==b)
			System.out.println("True");
		else
			System.out.println("False");	
	}
}
