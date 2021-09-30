import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrinter implements Runnable
{
    public DatePrinter()
    {
        this.run();
    }

    @Override
    public void run()
    {
        while(true) {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            System.out.println(formatter.format(date));
        }
    }
}
