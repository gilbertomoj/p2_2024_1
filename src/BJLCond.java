import java.util.Scanner;

public class BJLCond {
    Scanner scanner = new Scanner(System.in);

    public void ex_1() {
        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();

        if( num1 > num2 ) {
            System.out.println("O maior é " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior é " + num2);
        } else {
            System.out.println("Os números são iguais !");
        }
    }

    public void ex_2() {
        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        int num3 = scanner.nextInt();

        if( num1 <= num2 || num1 <= num3) {
            System.out.println("Erro");
        } else {
            System.out.println("Condição Satisfeita");
        }
    }

    public void ex_3() {
        System.out.println("Insira um número:");
        int num1 = scanner.nextInt();

        if(num1 % 2 == 0) {
            System.out.println( num1 + " é par");
        } else {
            System.out.println( num1 + " é impar");
        }
    }

    public void ex_4() {
        System.out.println("Insira o primeiro valor :");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo valor :");
        int num2 = scanner.nextInt();

        if(num1 == num2) {
            System.out.println( "Multiplicação : " + (num1 * num2));
        } else if (num1 > num2){
            System.out.println("Subtração :" + (num1 - num2));
        } else {
            System.out.println("Soma : "+ (num1 + num2));
        }
    }

    public void ex_5() {
        System.out.println("Digite 1 para somar;");
        System.out.println("Digite 2 para subtrair;");
        System.out.println("Digite 3 para multiplicar;");
        System.out.println("Digite 4 para dividir;");
        int value = scanner.nextInt();

        System.out.println("Insira o primeiro valor:");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo valor:");
        int num2 = scanner.nextInt();

        switch (value) {
            case 1:
                System.out.println("Soma : " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtração : " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplicação : " + (num1 * num2));
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Divisão por zero.");

                } else {
                    System.out.println("Divisão :" + (num1 / num2));
                }
                break;
        }
    }


    public static void main(String[] args) {
        BJLCond bjlCond = new BJLCond();

//        bjlCond.ex_1();
//        bjlCond.ex_2();
//        bjlCond.ex_3();
//        bjlCond.ex_4();
        bjlCond.ex_5();
    }

}
