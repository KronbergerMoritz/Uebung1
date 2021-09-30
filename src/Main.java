public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("** Welcome **%n%n");

        int limit = 20;

        DatePrinter dp = new DatePrinter(limit);
        Thread th1 = new Thread(dp);

        CountPrinter cp = new CountPrinter(limit);
        Thread th2 = new Thread(cp);

        th1.start();
        th2.start();
    }

    //Fragen Beantworten
    // Bei öfteren Durchläufen fällt auf das sich die Threads immer mehr untereinandere Vermischen
    //Bei weniger Durchläufen ist die Performance besser und somit läuft es Nacheinanderer und nicht durchmischt

}
