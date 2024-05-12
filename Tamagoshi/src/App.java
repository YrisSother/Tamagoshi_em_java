import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {

        Timer timer = new Timer();
        int intervaloMinutos = 1;

        Animal a1 = new Animal();

        timer.scheduleAtFixedRate(new AtualizarStatus(a1), 0L, intervaloMinutos * 60 * 1000L);

        System.out.println("\n");

        DateFormat formadata = new SimpleDateFormat("HH:mm:ss");
        Date data = new Date();
        System.out.println(formadata.format(data));

        System.out.println("\n");

        System.out.println("O seu tamagoshi nasceu!");

        System.out.println("\n");

        System.out.println("  _  ");
        System.out.println("<(o )");
        System.out.println(" (   )> ");
        System.out.println("  ^^");

        System.out.println("\n");

        a1.numerostatus();
        a1.status();
        a1.exibirOpcoes();
        a1.tamagoshiMorte();

        System.out.println("\n");
    }
}