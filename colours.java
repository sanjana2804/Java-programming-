import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colour = sc.next();
        switch(colour){
            case "B":
                System.out.println("Blue");
                break;
            case "R":
                System.out.println("Red");
                break;
            case "G":
                System.out.println("Green");
                break;
            case "O":
                System.out.println("Orange");
                break;
            case "Y":
                System.out.println("Yellow");
                break;
            case "W":
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid code");
        }
    }
}
