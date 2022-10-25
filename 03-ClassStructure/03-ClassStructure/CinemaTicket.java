public class CinemaTicket
{
    static String CinemaName;
    String filmTitle;
    int row;
    int seat;
    double price;
    
    public void displayInfo()
    {
        System.out.println(CinemaName);
        System.out.println(filmTitle);
        System.out.println(row);
        System.out.println(seat);
        System.out.println(price);
    }
    public CinemaTicket (String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        if (row == 1 || row == 2) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }
    public static void main(String[] args) {
        CinemaTicket.CinemaName = "Morning Star Cinema";
        
        CinemaTicket t1 = new CinemaTicket("Gladiator", 2, 31);
        CinemaTicket t2 = new CinemaTicket("Gladiator", 7, 2);
        
        t1.displayInfo();
        t2.displayInfo();
    }
}
