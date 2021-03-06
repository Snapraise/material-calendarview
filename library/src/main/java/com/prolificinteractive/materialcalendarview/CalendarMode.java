package com.prolificinteractive.materialcalendarview;

@Experimental
public enum CalendarMode {

    MONTHS(6),
    WEEKS(2);

    final int visibleWeeksCount;

    CalendarMode(int visibleWeeksCount) {
        this.visibleWeeksCount = visibleWeeksCount;
    }
}
