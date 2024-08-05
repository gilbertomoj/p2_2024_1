import java.util.Scanner;

public class BJLSeq {
    Scanner scanner = new Scanner(System.in);

    public void ex_1() {
        System.out.println("Informe quatro números, em sequência: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println("Resultado da soma: " + (num1 + num2 + num3 + num4));
    }

    public void ex_2() {
        System.out.println("Insira o salário:  ");
        float sal = scanner.nextFloat();
        float newSal = (float) (sal * 1.25);
        System.out.println("Novo salário: " + newSal);
    }

    public void ex_3() {
        System.out.println("Insira a base:  ");
        float base = scanner.nextInt();
        System.out.println("Insira a altura:  ");
        float altura = scanner.nextInt();

        System.out.println("Area do triangulo: " + (base * altura));
    }

    public void ex_4() {
        System.out.println("Insira o primeiro número:  ");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Resultado: " + (Math.pow(num1, num2)));

    }
    public static void main(String[] args) {
        BJLSeq bjlSeq = new BJLSeq();
//        bjlSeq.ex_1();
//        bjlSeq.ex_2();
//        bjlSeq.ex_3();
//        bjlSeq.ex_4();
    }
}
