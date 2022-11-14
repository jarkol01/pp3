public class Clock
{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        hour = 0;
        minute = 0;
    }
    Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public void setClock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }
    public void setClock() {
        this.hour = 0;
        this.minute = 0;
    }
    public void displayTime() {
        System.out.println(String.format("%02d", hour) + ":" + String.format("%02d", minute));
    }
    public void addOneMinute() {
        if (this.minute == 59) {
            this.minute = 0;
            if (this.hour == 23) {
                this.hour = 0;
            } else {
                this.hour += 1;
            }
        } else {
            this.minute += 1;
        }
        
        if (this.hour == this.alarmHour && this.minute == this.alarmMinute) {
            this.runAlarm();
        }
    }
    public void setAlarm(int alarmHour, int alarmMinute) {
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }
    public void runAlarm() {
        System.out.println("beep-beeep-beep-beep !!");
    }
    
    public static void main(String[] args) {
        Clock c1 = new Clock(12, 47);
        c1.displayTime();
        c1.setClock(18, 14);
        c1.displayTime();
        c1.setClock(9, 3);
        c1.displayTime();
        c1.setClock(23, 58);
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        c1.addOneMinute();
        c1.displayTime();
        
        Clock c2 = new Clock(10, 48);
        c2.setAlarm(10,50);
        c2.displayTime();
        c2.addOneMinute();
        c2.displayTime();
        c2.addOneMinute();
        c2.displayTime();
        c2.addOneMinute();
        c2.displayTime();
    }
}
