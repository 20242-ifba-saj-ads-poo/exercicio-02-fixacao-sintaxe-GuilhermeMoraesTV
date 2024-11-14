
//No código do exercício anterior, aumente a quantidade de números que terão os fatoriais impressos,
// até 20, 30, 40. Em um determinado momento, além desse cálculo demorar, vai começar a mostrar respostas
// completamente erradas. Por quê? Mude de int para long para ver alguma mudança.

class Exercicio5 {
    public static void main(String[] args) {
        for (int n = 1; n < 30; n++){
            long fatorial = 1;
            for (long j = 1; j <= n; j++){
                fatorial *= j;
            }
            System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }
}