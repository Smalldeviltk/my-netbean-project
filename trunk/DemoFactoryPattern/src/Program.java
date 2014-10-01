
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import sun.util.BuddhistCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Small
 */
public class Program {

    public static void main(String[] args) throws InterruptedException {
        BakeryFactory bakery = new BakeryFactory(); //init bakery for create cake
        Calendar cal = new BuddhistCalendar();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        while (true) {
            int currentMonth = cal.get(Calendar.MONTH); //get current Month

            ICake cake = bakery.MakeCake(currentMonth); //Make a cake depend on current month

            System.out.println(cake.GetCakeName() + " created at " + dateFormat.format(cal.getTime()));//Show name of cake

            Thread.sleep(1000); //wait 1 second
        }
    }
}
