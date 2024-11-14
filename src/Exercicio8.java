
//Imprima a seguinte tabela, usando fors encadeados:
//
//1
//2 4
//3 6 9
//4 8 12 16
//n n*2 n*3 .... n*n

public class Exercicio8 {
    public static void main(String[] args){
        int linhas = 5;

        for (int n = 1; n <= linhas; n++){
            for (int i = 1; i <= n; i++){
                System.out.print(n * i + " ");
            }
            System.out.println();
        }
    }
}
