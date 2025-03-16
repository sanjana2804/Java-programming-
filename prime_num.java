import java.util.Scanner;
class prime_num{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				System.out.println("Not a Prime number");
				break;
			}
			else{
				System.out.println("Prime number");
				break;
			}
		}
	}
}
