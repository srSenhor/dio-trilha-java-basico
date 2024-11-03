import facade.Facade;
import singleton.EagerSingleton;
import singleton.LazyHolderSingleton;
import singleton.LazySingleton;
import strategy.AggressiveAct;
import strategy.PhilosophicalAct;
import strategy.Robot;

public class App {
    public static void main(String[] args) throws Exception {

        // ===== Exemplo de funcionamento do Singleton ==========

        System.out.println("===== Exemplo de funcionamento do Singleton ==========\n");

        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println("Lazy: " + lazy);
        lazy = LazySingleton.getInstance();
        System.out.println("Lazy: " + lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println("Eager: " + eager);
        eager = EagerSingleton.getInstance();
        System.out.println("Eager: " + eager);

        LazyHolderSingleton holder = LazyHolderSingleton.getInstance();
        System.out.println("Lazy Holder: " + holder);
        holder = LazyHolderSingleton.getInstance();
        System.out.println("Lazy Holder: " + holder);

        System.out.println();

        // ===== Exemplo de funcionamento do Strategy ===========

        System.out.println("===== Exemplo de funcionamento do Strategy ===========\n");

        Robot bob = new Robot();
        System.out.print("Robo realiza acao: ");
        bob.doAct();

        bob.setAction(new AggressiveAct());
        System.out.print("Robo realiza acao: ");
        bob.doAct();

        bob.setAction(new PhilosophicalAct());
        System.out.print("Robo realiza acao: ");
        bob.doAct();

        System.out.println();

        // ===== Exemplo de funcionamento do Facade =============

        System.out.println("===== Exemplo de funcionamento do Facade ==============\n");

        Facade facade = new Facade();
        System.out.println("Migrando cliente: ");
        facade.migrateClient("Vinicius", "12345-678");

        System.out.println();


    }
}
