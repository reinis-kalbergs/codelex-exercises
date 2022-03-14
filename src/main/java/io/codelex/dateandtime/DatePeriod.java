package io.codelex.dateandtime;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public String toString() {
        return "DatePeriod{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public DatePeriod(LocalDate startDate, LocalDate endDate) {
        if (endDate.isAfter(startDate)) {
            this.startDate = startDate;
            this.endDate = endDate;
        } else {
            this.startDate = endDate;
            this.endDate = startDate;
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public DatePeriod intersection(DatePeriod secondDatePeriod) {

        if (!doTheyOverlap(secondDatePeriod)) return null;
        if (this.isInside(secondDatePeriod)) return this;
        if (secondDatePeriod.isInside(this)) return secondDatePeriod;

        if (this.startDate.isBefore(secondDatePeriod.getStartDate())) {
            return new DatePeriod(secondDatePeriod.getStartDate(), this.endDate);
        } else if (secondDatePeriod.getStartDate().isBefore(this.startDate)) {
            return new DatePeriod(this.startDate, secondDatePeriod.getEndDate());
        } else {
            throw new RuntimeException("ERROR: unaccounted date period");
        }

    }

    private boolean doTheyOverlap(DatePeriod secondDateTime) {
        return secondDateTime.getStartDate().isBefore(this.endDate) || secondDateTime.getStartDate().isEqual(this.endDate);
    }

    private boolean isInside(DatePeriod secondDateTime) {
        return (this.startDate.isAfter(secondDateTime.getStartDate()) || this.startDate.isEqual(secondDateTime.getStartDate())) &&
                (this.endDate.isBefore(secondDateTime.getEndDate()) || this.endDate.isEqual(secondDateTime.getEndDate()));
    }

}
