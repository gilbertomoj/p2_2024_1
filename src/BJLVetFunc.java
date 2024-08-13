import java.util.Arrays;
import java.util.Scanner;

public class BJLVetFunc {
    Scanner scanner = new Scanner(System.in);

    public void isFirstGreater(int[] vet) {
        if( vet[0] > vet[1] && vet[0] > vet[2]) {
            System.out.println("Condição Satisfeita");
        } else {
            System.out.println("Erro");
        }
    }

    public void maior(int num1, int num2) {
        if( num1 == num2 ) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O maior é :" + num1);
        } else {
            System.out.println("O maior é :" + num2);
        }
    }

    public void parImpar(int num1) {
        if(num1 % 2 == 0) {
            System.out.println(num1 + " é par");
        } else {
            System.out.println(num1 + " é impar");
        }
    }

    public void dividir100(float[] vetor) {
        System.out.println("Conteúdo dividido por 100: ");
        for(int i = 0; i < 5; i ++) {
            System.out.println(vetor[i]/100);
        }
    }
    // ---- Main Functions
    public void ex_1() {
        System.out.println("Insira o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Insira o segundo número:");
        int num2 = scanner.nextInt();
        maior(num1, num2);

    }
    public void ex_2() {
        int[] vet = new int[3];
        System.out.println("Insira o primeiro número:");
        vet[0] = scanner.nextInt();
        System.out.println("Insira o segundo número:");
        vet[1] = scanner.nextInt();
        System.out.println("Insira o terceiro número:");
        vet[2] = scanner.nextInt();
        isFirstGreater(vet);
    }
    public void ex_3() {
        System.out.println("Insira um número:");
        int num1 = scanner.nextInt();
        parImpar(num1);
    }

    public void ex_4() {
        float[] vet = new float[5];
        for(int i = 0; i< 5; i++) {
            System.out.println("Insira o dado da posição "+ (i + 1));
            vet[i] = scanner.nextFloat();
        }
        dividir100(vet);
    }

    public void ex_5() {
        int[] vet = new int[5];
        for(int i = 0; i < 5; i ++) {
            System.out.println("Insira o dado da posição "+ (i + 1));
            vet[i] = scanner.nextInt();
        }
        System.out.println("Insira a chave de busca :");
        int key = scanner.nextInt();
        findNumber(vet, key);
    }

    private void findNumber(int[] vet, int key) {
        int position = 0;
        for(int i = 0; i < 5; i ++) {
//            System.out.println(vet[i]);
            if(vet[i] == key) {
                position = i;
            }
        }

        if(position == 0) {
            System.out.println("Chave não encontrada!");
        } else {
            System.out.println("Chave encontrada na posição: " + (position + 1));
        }
    }

    public static void main(String[] args) {
        BJLVetFunc bjlVetFunc = new BJLVetFunc();
//        bjlVetFunc.ex_1();
//        bjlVetFunc.ex_2();
//        bjlVetFunc.ex_3();
//        bjlVetFunc.ex_4();
        bjlVetFunc.ex_5();
    }
}
