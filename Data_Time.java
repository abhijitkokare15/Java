import java.time.*;

public class Data_Time {

    public static void main(String[] args) {

        // LocalDate d = LocalDate.now();
        //   LocalDate d = LocalDate.of(2005,Month.APRIL,13);
          // we can also specify number 
            // LocalDate d = LocalDate.of(2005,Month.FEBRUARY,29); // give an error bs, 29 is leap year

            // LocalTime t = LocalTime.now(); 
            //  LocalTime t = LocalTime.now();
            // System.out.println(t);
            LocalDateTime dt  = LocalDateTime.now();
            IO.println(dt);
            Instant i = Instant.now();
            System.out.println(i);// retun with date+GMT

            for(String s: ZoneId.getAvailableZoneIds()) // rnt country wise zone id
            {
                IO.println(s);
            }
            
            LocalTime t = LocalTime.now(ZoneId.of("Asia/Tokyo")); // return tokey time by using its zone id
             System.out.println(t);

        
}
}