public class CountPrinter implements Runnable
{

    private int i = 1;
    private int limit;
    public CountPrinter(int limit)
    {
        this.limit = limit;
    }

    @Override
    public void run() {

        while(i <= limit)
        {
            System.out.println(i);
            i++;
        }
    }
}
