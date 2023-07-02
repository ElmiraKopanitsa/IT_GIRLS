package kz.kopanitsa.lesson.week6.model;

public class DayOfWeek {
    enum Week {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}


    public void dayOfWeek() {
        Week weekDay = Week.SUNDAY;
        switch (weekDay) {
            case MONDAY:
                System.out.println("Сегодня будний день  - понедельник.");
                break;
            case TUESDAY:
                System.out.println("Сегодня будний день - вторник.");
                break;
            case WEDNESDAY:
                System.out.println("Сегодня будний день - среда.");
                break;
            case THURSDAY:
                System.out.println("Сегодня будний день - четверг.");
                break;
            case FRIDAY:
                System.out.println("Сегодня будний день - пятница.");
                break;
            case SATURDAY:
                System.out.println("Сегодня выходной - суббота.");
                break;
            case SUNDAY:
                System.out.println("Сегодня выходной - воскресенье.");
                break;
        }
    }
}
