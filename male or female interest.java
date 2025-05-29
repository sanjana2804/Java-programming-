//Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
//If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
//If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
//If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
//If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        //System.out.println("hello");
        Scanner sc=new Scanner(System.in);
        String gender=sc.next();
        int age= sc.nextInt();
        if(gender.equals("female") && age>=1 && age<=58)
            System.out.println("Interest is 8.2%");
        else if(gender.equals("female") && age>=59 && age<=100)
            System.out.println("Interest is 9.2%");
        else if(gender.equals("male") && age>=1 && age<=58)
            System.out.println("Interest is 8.4%");
        else if(gender.equals("male") && age>=59 && age<=100)
            System.out.println("Interest is 10.5%");

    }
}
