public class InternetDevice {
    String name;
    boolean connected;
    static int connectedDevices = 0;
    
    public InternetDevice(String name) 
    {
        this.name = name;
        this.connectedDevices += 1;
    }
    
    public void connect() 
    {
        this.connected = true;
    }
    
    public void disconnect() 
    {
        this.connected = false;
    }
    
    public void isConnected() 
    {
        if (this.connected) {
            System.out.println("Device is connected");
        } else {
            System.out.println("Device is NOT connected");
        }
        
    }
    
    public void displayStatus() 
    {
        System.out.println(name);
        System.out.println(connected);
    }
    
    public static void displayConnections() 
    {
        System.out.println(connectedDevices);
    }
    
    public static void main(String[] args) 
    {
        InternetDevice d1 = new InternetDevice("Lodówka");
        d1.connect();
        d1.displayStatus();
        
        InternetDevice d2 = new InternetDevice("Mikrofalówka");
        d2.disconnect();
        d2.displayStatus();
        
        InternetDevice d3 = new InternetDevice("Ekspres do kawy");
        d3.connect();
        d3.displayStatus();
        
        InternetDevice d4 = new InternetDevice("Piekarnik");
        d4.disconnect();
        d4.displayStatus();
        
        InternetDevice d5 = new InternetDevice("Smartphone");
        d5.connect();
        d5.displayStatus();
        
        displayConnections();
        
    }
}