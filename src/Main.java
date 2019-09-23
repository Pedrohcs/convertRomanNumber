import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConvertNumber convert = new ConvertNumber();
        String romanNumber;
        int decimalNumber;

        System.out.println("Digite o algorismo romano a ser convertido:");
        romanNumber = input.nextLine();

        decimalNumber = convert.toDecimal(romanNumber);
        System.out.println("O número convertido é: " + decimalNumber);
    }
}
