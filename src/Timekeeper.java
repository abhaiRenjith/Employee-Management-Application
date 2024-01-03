import java.text.SimpleDateFormat;
import java.util.Date;

public class Timekeeper {
    public String timerightnow(){
        SimpleDateFormat template = new SimpleDateFormat("dd/MM/yy hh:mm:ss");
        Date date = new Date();
        return template.format(date);
    }


}
