public class TV implements CanOnOff, CanChangeChannel {
    private boolean isTurnedOn = false;
    private int channelNumber = 1;    

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }


    @Override
    public void channelDown() {
        setChannel(this.channelNumber - 1);
    }

    @Override
    public void channelUp() {
        setChannel(this.channelNumber + 1);
    }

    @Override
    public void setChannel(int number) {
        if (isTurnedOn && number >= 1 && number <= 99) {
            this.channelNumber = number;
        } 
    }

    @Override
    public void off() {
        setTurnedOn(false);
        
    }

    @Override
    public void on() {
        setTurnedOn(true);
        
    }

    public void displayInfo() {
        if (isTurnedOn) {
            System.out.println("TV is on");
            System.out.println("Channel number is " + channelNumber);
        } else {
            System.out.println("TV is off");
        }
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }
}
