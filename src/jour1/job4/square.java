package jour1.job4;
import java.util.Scanner;
public class square {
    public static void main(String[]args){
        System.out.println("enter a number");
        Scanner scanner=new Scanner(System.in);

        int oldNumber=scanner.nextInt();

        int newNumber=oldNumber*oldNumber;

        System.out.println("your square of "+oldNumber+" is : "+newNumber);
    }
}
