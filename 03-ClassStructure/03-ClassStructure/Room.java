public class Room
{
    String number;
    int beds;
    boolean occupied = false;
    String guestName;

    Room(String number)
    {
        this.number = number;
        this.beds = 2;
    }
    Room(String number, int beds)
    {
        this.number = number;
        this.beds = beds;
    }

    public void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;
    }
    public void checkout() {
        this.occupied = false;
        this.guestName = "";
    }
    public boolean isOccupied() {
        if (this.occupied == true) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return this.number + ", " + this.beds + ", " + this.occupied + ", " + this.guestName;
    }
    public static void report(Room[] rooms) {
        for (Room i : rooms) {
            System.out.println(i);
        }
    }
    public static void reportRooms(Room[] rooms) {
        int numberOccupied = 0;
        for (Room i : rooms) {
            if (i.occupied == true) {
                numberOccupied += 1;
            }
        }
        System.out.print("Liczba zajętych pokoi: " + numberOccupied);
        System.out.print("Liczba wolnych pokoi: " + (rooms.length - numberOccupied));
    }
    public static void reportBeds(Room[] rooms) {
        int freeBeds = 0;
        for (Room i : rooms) {
            if (i.occupied == false) {
                freeBeds += i.beds;
            }
        }
        System.out.print("Liczba wolnych łóżek: " + freeBeds);
    }
    
    public static void main(String[] args) {
        Room r1 = new Room("1");
        Room r2 = new Room("2");
        Room r3 = new Room("3");
        Room r4 = new Room("4", 3);
        Room r5 = new Room("5", 3);
        Room r6 = new Room("6", 1);
        Room[] rooms = {r1, r2, r3, r4, r5 ,r6};
        
        rooms[0].checkin("Jarek");
        
        System.out.println(rooms[0]);
        
        report(rooms);
        reportRooms(rooms);
        reportBeds(rooms);
    }
}
