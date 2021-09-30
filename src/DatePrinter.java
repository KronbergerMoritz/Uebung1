import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable
{
    private int i = 0;
    private int limit;

    public DatePrinter(int limit)
    {
        this.limit = limit;
    }

    @Override
    public void run()
    {

        while(i <= limit) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));

            i++;
        }
    }
}
