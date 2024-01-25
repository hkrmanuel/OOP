import java.text.SimpleDateFormat;
import java.util.Date;
public class DateTime {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        System.out.println("TImeinMilliseconds " +time );
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date currentTime = new Date(time);

        String Time = sdf.format(currentTime);

        System.out.println(Time);


    }
    
}
