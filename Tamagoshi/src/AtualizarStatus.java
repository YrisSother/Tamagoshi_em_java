import java.util.TimerTask;

class AtualizarStatus extends TimerTask {
    private Animal animal;

    public AtualizarStatus(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void run() {

        System.out.println("\n");
        System.out.println("STATUS ATUALIZADO!");
        System.out.println("\n");
        animal.status();
        animal.exibirOpcoes();
        System.out.println("\n");
       
        animal.idade += 1;
        animal.saude -= 1;
        animal.fome -= 30;
        animal.energia -= 20;
        animal.diversao -= 10;

        
    }

}