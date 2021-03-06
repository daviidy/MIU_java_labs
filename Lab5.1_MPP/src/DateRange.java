import java.time.*;

public class DateRange {
	private LocalDate startDate;
	private LocalDate endDate;
	
	public DateRange(LocalDate startDate, LocalDate endDate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	boolean isInRange(LocalDate date) {
		if (date.isAfter(startDate) || date.isEqual(startDate) && date.isBefore(endDate) || date.isEqual(endDate)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return startDate + " - " + endDate;
	}
	
	static LocalDate getFirstDayOfMonth(LocalDate date) {
		return date;
		
	}
	
	static LocalDate getLastDayOfMonth(LocalDate date) {
		return date;
	}
	
	
}
