import java.text.SimpleDateFormat;
import java.util.Date;
public class DatePrinter implements Runnable{

    SimpleDateFormat dateFormat = new SimpleDateFormat();
     String date = dateFormat.format(new Date());

    @Override
    public void run() {

        for(int i = 0; i < 21; i++) {
            System.out.println(date);
        }
    }
}
