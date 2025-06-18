package jour1.job1;
import java.util.Scanner;

class input{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("insert your name here: ");

        String name=scanner.nextLine();
        System.out.printf("your parents don't know how to choose a name, %s ", name);

    }
}