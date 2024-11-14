import java.util.Scanner;

//Escreva um programa que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
//
//se x é par, x = x / 2
//se x é impar, x = 3 * x + 1
//imprime x
//O programa deve parar quando x tiver o valor final de 1.
// Por exemplo, para x = 13, a saída será: 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1



public class Exercicio7 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = leitor.nextInt();

        while (n1 != 1){
            System.out.print(n1 + " -> ");
            if (n1 % 2 == 0){
                n1 = n1 / 2;
            }else {
                n1 = 3 * n1 +1;
            }
        }
        System.out.println(n1);
    }
}
