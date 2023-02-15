import java.util.Scanner;
 public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com a velocidade média: ");
        int velocidade = ler.nextInt();
        System.out.println("Entre com o tempo gasto: ");
        int tempo = ler.nextInt();
        System.out.println("Insira o consumo km por litro do seu veiculo: ");
        int consumo = ler.nextInt();
        int distancia = velocidade * tempo;
        float combustivel = distancia / consumo;

        System.out.println("O consumo final de combustivel gasto foi: " + combustivel + " litros");

    }
}
