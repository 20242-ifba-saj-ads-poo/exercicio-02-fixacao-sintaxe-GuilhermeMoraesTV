
//Imprima os primeiros números da série de Fibonacci até passar de 100.
// A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc...
// Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante,
// o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3)

public class Exercicio6 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        System.out.print("Fibonacci: "+ n1);

        while (n2 <= 100){
            System.out.print(", "+ n2);
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
    }
}
