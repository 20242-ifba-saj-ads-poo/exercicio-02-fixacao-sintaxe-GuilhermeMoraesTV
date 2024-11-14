//Imprima a soma de 1 até 1000.

class Exercicio2 {
    public static void main(String[] args) {
        int resultado = 0;
        for(int i = 0; i < 1000; i++){
            resultado = 1 + i;
            System.out.println("Soma: 1 + "  + i + " = " + resultado);
        }
    }
}