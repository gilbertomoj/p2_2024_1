import java.util.Scanner;

public class BJLRep {
    Scanner scanner = new Scanner(System.in);

    public void ex_1() {
        int sum = 0;
        for (int i = 1; i <= 10; i ++) {
            sum += i;
        }
        System.out.println("Somatório: " + sum);
    }

    public void ex_2() {
        System.out.println("Insira o valor de A: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o valor de B: ");
        int num2 = scanner.nextInt();

        System.out.println("Série numérica: ");
        for (int i = num1 + 1; i <= num2 - 1; i ++) {
            System.out.print(i + " ");
        }
    }

    public void ex_3() {
        int num1 = 0;
        int positiveCount = 0;
        do {
            System.out.println("Insira um número: ");
            num1 = scanner.nextInt();
            if( num1 > 0) {
                positiveCount += 1;
            }
        } while (num1 != 0);
        System.out.println("Quantidade de positivos: "+positiveCount);
    }

    public void ex_4() {
        System.out.println("Insira o valor de A: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o valor de B: ");
        int num2 = scanner.nextInt();
        for (int i = num1; i <= num2; i ++) {
            if(i  % 2 != 0) {
                System.out.println("É impar: " + i);
            }
        }
    }
    public void ex_5() {
        System.out.println("Insira um número: ");
        int num1 = scanner.nextInt();
        boolean isPrimo = true;
        for(int i = 2; i < num1; i ++) {
            if (num1 % i == 0) {
                isPrimo = false;
                break;
            }
        }
        if(isPrimo) {
            System.out.println(num1+" é primo.");
        } else {
            System.out.println(num1+" não é primo.");
        }

    }
    public static void main(String[] args) {
        BJLRep bjlRep = new BJLRep();
//        bjlRep.ex_1();
//        bjlRep.ex_2();
//        bjlRep.ex_3();
//        bjlRep.ex_4();
//        bjlRep.ex_5();
    }


}
