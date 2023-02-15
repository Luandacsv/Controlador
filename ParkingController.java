public class ParkingController {
        // Variáveis
        private int totalSpaces;
    private int occupiedSpaces;
    private int remainingSpaces;

    //Construtor
    public ParkingController(int totalSpaces) {
        this.totalSpaces = totalSpaces;
        this.occupiedSpaces = 0;
        this.remainingSpaces = totalSpaces;
    }

    //Métodos

    //Entrada
    public void enter(int qtd) {
        System.out.println("Entrada liberada.");
        System.out.println("Entrando " + qtd + " carros");
        if (remainingSpaces > 0 && remainingSpaces > qtd) {
            occupiedSpaces = occupiedSpaces + qtd;
            remainingSpaces = remainingSpaces - qtd;
            System.out.println("Vagas ocupadas: " + occupiedSpaces);
            System.out.println("Vagas restantes: " + remainingSpaces);
        } else {
            System.out.println("Estacionamento lotado.");
        }
    }
    // Saída
    public void exit(int qtd) {
        System.out.println("Saída liberada.");
        System.out.println("Saindo " + qtd + " carros");
        if (occupiedSpaces >= qtd) {
            occupiedSpaces = occupiedSpaces -qtd;
            remainingSpaces = remainingSpaces +qtd;
            System.out.println("Vagas ocupadas: " + occupiedSpaces);
            System.out.println("Vagas restantes: " + remainingSpaces);
        } else {
            System.out.println("Quantidade de saida maior que os espaços ocupados");
        }
    }
}