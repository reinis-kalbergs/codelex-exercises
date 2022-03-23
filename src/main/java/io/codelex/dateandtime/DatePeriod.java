package io.codelex.dateandtime;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public String toString() {
        return "DatePeriod {" +
                "startDate = " + startDate +
                " , endDate = " + endDate +
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

    public DatePeriod intersection(DatePeriod secondPeriod) {
        if (doTheyOverlap(secondPeriod)) {
            if (this.isInside(secondPeriod)) {
                return new DatePeriod(this.startDate, this.endDate);
            } else if (secondPeriod.isInside(this)) {
                return new DatePeriod(secondPeriod.getStartDate(), secondPeriod.getEndDate());
            } else if (this.startDate.isBefore(secondPeriod.getStartDate())) {
                return new DatePeriod(secondPeriod.getStartDate(), this.endDate);
            } else if (secondPeriod.getStartDate().isBefore(this.startDate)) {
                return new DatePeriod(this.startDate, secondPeriod.getEndDate());
            }
        }
        return null;
    }

    private boolean doTheyOverlap(DatePeriod secondPeriod) {
        return secondPeriod.getStartDate().isBefore(this.endDate) || secondPeriod.getStartDate().isEqual(this.endDate);
    }

    private boolean isInside(DatePeriod secondPeriod) {
        return (this.startDate.isAfter(secondPeriod.getStartDate()) || this.startDate.isEqual(secondPeriod.getStartDate()))
                && (this.endDate.isBefore(secondPeriod.getEndDate()) || this.endDate.isEqual(secondPeriod.getEndDate()));
    }

}
