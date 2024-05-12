import java.util.Scanner;

class Animal {
    public String nome;
    protected int idade;
    protected int fome;
    protected int saude;
    protected int energia;
    protected int diversao;

    void status() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Saude: " + saude);
        System.out.println("Fome: " + fome);
        System.out.println("Energia: " + energia);
        System.out.println("Diversão: " + diversao);
    }

    void numerostatus() {

        nome = "Agente PATOgenico";

        System.out.println("\n");

        idade = 0;
        saude = 100;
        fome = 100;
        energia = 100;
        diversao = 100;

        System.out.println("\n");

    }

    void tamagoshiMorte() {

        if (saude == 0) {
            
            System.out.println("O "+nome+" morreu de doença");
            System.exit(0);

        } else if (fome == 0) {
            
            System.out.println("O "+nome+" morreu de fome");
            System.exit(0);

        } else if (energia == 0) {
            
            System.out.println("O "+nome+" morreu de cansaço");
            System.exit(0);

        } else if (diversao == 0) {

            System.out.println("O "+nome+" morreu de tédio ( literalmente )");
            System.exit(0);
            
        }

    }

    public void exibirOpcoes() {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("Opções:");

            System.out.println("\n");

            System.out.println("1 - Comer");
            System.out.println("2 - Dormir");
            System.out.println("3 - remedio");
            System.out.println("4 - Brincar");

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            System.out.println("\n"); 

            

            switch (opcao) {

                case 1:

                    System.out.println("O " + nome + " comeu");
                    System.out.println("\n");
                    fome += 10;
                    System.out.println("  _  ");
                    System.out.println("<(o )");
                    System.out.println(" (   )> ");
                    System.out.println("  ^^");
                    System.out.println("\n");
                    status();

                    break;

                case 2:

                    System.out.println("O " + nome + " dormiu");
                    System.out.println("\n");
                    energia += 10;
                    System.out.println("  _  ");
                    System.out.println("<(o )");
                    System.out.println(" (   )> ");
                    System.out.println("  ^^");
                    System.out.println("\n");
                    status();

                    break;

                case 3:

                    System.out.println("O " + nome + " tomou remedio");
                    System.out.println("\n");
                    saude += 10;
                    System.out.println("  _  ");
                    System.out.println("<(o )");
                    System.out.println(" (   )> ");
                    System.out.println("  ^^");
                    System.out.println("\n");
                    status();

                    break;

                case 4:

                    System.out.println("O " + nome + " brincou");
                    System.out.println("\n");
                    diversao += 10;
                    System.out.println("  _  ");
                    System.out.println("<(o )");
                    System.out.println(" (   )> ");
                    System.out.println("  ^^");
                    System.out.println("\n");
                    status();

                    break;

                default:

                    System.out.println("Opção inválida!");

                    break;

            }
        } while (opcao != 0);

        scanner.close();

        
    }
}
