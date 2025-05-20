package interface_5_20;

import java.util.Scanner;

interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b){
        return a * b;
    }

    static int subtract(int a, int b){
        return a-b;
    }

}

class SimpleCalculator implements Calculator{
    @Override
    public int add(int a, int b){
        return a+b;
    }
} 

public class Main {
    public static void main(String[] args){
        SimpleCalculator calc = new SimpleCalculator();
        Scanner stdin = new Scanner(System.in);

        int numone = stdin.nextInt();

        int numtwo = stdin.nextInt();

        System.out.println(calc.add(numone,numtwo));

        System.out.println(calc.multiply(numone,numtwo));

        System.out.println(Calculator.subtract(numone,numtwo));
    }
}
