import java.util.Scanner;
import java.util.InputMismatchException;

public class exercise1 {
    
    // VERSION 1
    /*
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angkar pertama: ");
        int num1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();

        System.out.print("Pilh operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                if (num2 != 0){
                    result = (double) num1/num2; //ubah ke double
                } else{
                    System.out.println("Error: tidak bisa dibagi 0!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Operator tidak sesuai");
                validOperation = false;
        }

        if (validOperation){
            System.out.println("Hasil: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Masukkan angkar pertama: ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double num2 = scanner.nextDouble();

            System.out.print("Pilh operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                    }
                    break;
                default:
                    System.out.println("Operator tidak valid!");
            }
        }catch (InputMismatchException e){
            System.out.println("Error: input harus berupa angka!");
        }finally{
            scanner.close();
        }
    }
}
