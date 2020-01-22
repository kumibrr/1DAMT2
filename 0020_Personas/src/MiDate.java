import java.util.Date;

public class MiDate extends Date {

	@SuppressWarnings("deprecation")
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Date object = (Date) obj;
		
		if (object.getDay() == this.getDay( )&& (object.getMonth() == this.getMonth()) && (object.getYear() == this.getYear())) result = true;
		
		return result;
	}
	
}
