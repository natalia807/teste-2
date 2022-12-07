import java.util.Scanner;
class Fatorial {
    public static void main(String[] args) {
        int number;

        Scanner enter = new Scanner(System.in);

        System.out.println("Digite o número que você deseja obter o fatorial: ");

        number = enter.nextInt(); 

        System.out.println("O fatorial de " + number + " é " + factorial(number) + ".");
    }
    public static double factorial(double num){
        if(num <= 1){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}