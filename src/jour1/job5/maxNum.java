package jour1.job5;

import java.util.Scanner;

public class maxNum {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the first number: ");
        int firstNum=scanner.nextInt();
        System.out.println("enter the second number: ");
        int secondNum=scanner.nextInt();
        System.out.println("enter the third number: ");
        int thirdNum=scanner.nextInt();

        int[] numList={firstNum, secondNum, thirdNum};
        int biggestNum=0;

        for (int number:numList){
            int currentNum=number;

            if (currentNum>biggestNum){
                biggestNum=currentNum;
            }
            for (int numToCheck:numList){
                if (numToCheck>biggestNum){
                    biggestNum=numToCheck;
                }
            }
        }

        System.out.println("the biggest number in the list is: "+biggestNum);

    }
}
