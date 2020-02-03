import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class Gigasecond {

    LocalDateTime localDateTime;
    public static final Long GIGASECOND = new Long((long) Math.pow(10,9));

    Gigasecond(LocalDate birthDate) {
        //this.localDateTime = birthDate.atStartOfDay();
	this.localDateTime = new Gigasecond(birthDate.atStartOfDay()).localDateTime;
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.localDateTime = birthDateTime;
    }

    LocalDateTime getDateTime() {
        return this.localDateTime.plusSeconds( GIGASECOND );
    }

}
