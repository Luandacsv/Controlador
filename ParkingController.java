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
    public void enter() {
        if (remainingSpaces > 0) {
            occupiedSpaces++;
            remainingSpaces--;
            System.out.println("Entrada liberada.");
            System.out.println("Vagas ocupadas: " + occupiedSpaces);
            System.out.println("Vagas restantes: " + remainingSpaces);
        } else {
            System.out.println("Estacionamento lotado.");
        }
    }
    // Saída
    public void exit() {
        if (occupiedSpaces > 0) {
            occupiedSpaces--;
            remainingSpaces++;
            System.out.println("Saída liberada.");
            System.out.println("Vagas ocupadas: " + occupiedSpaces);
            System.out.println("Vagas restantes: " + remainingSpaces);
        } else {
            System.out.println("Estacionamento vazio.");
        }
    }
}