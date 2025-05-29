//Initialize a character variable with an alphabhet in a program.
//If the character value is in lowercase, the output should be displayed in uppercase in the following format.
//If the character value is in uppercase, the output should be displayed in lowercase in the following format.
//Example2 i/p:A  o/p:A->a

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int ascii = ch;
        char result;
        if(ch>=97 && ch<=122) {
            ascii = ascii - 32;
            result=(char)ascii;
            System.out.println(ch + "->" + result);
        }
        else if(ch>=65 && ch<=90) {
            ascii = ascii + 32;
            result=(char)ascii;
            System.out.println(ch + "->" + result);
        }
    }
}
