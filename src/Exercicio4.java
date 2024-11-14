
//Imprima os fatoriais de 1 a 10. O fatorial de um número $n$ é $n * n-1 * n-2$ ... até $n = 1$.

class Exercicio4 {
    public static void main(String[] args) {
        for (int n = 1; n < 10; n++){
            int fatorial = 1;
            for (int j = 1; j <= n; j++){
                fatorial *= j;
            }
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }
}