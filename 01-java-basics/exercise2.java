import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else if(num == 2){
            isPrime = true;
        }else if(num % 2 == 0){
            isPrime = false;
        } else{
            for (int i = 3; i < num; i+=2){
                if (num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println(num + " adalah bilangan prima");
        }else {
            System.out.println(num + " bukan bilangan prima");
        }

        scanner.close();
    }
}
