package ro.sda.advanced._3_composition;

public class PC {
    private Case myCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case myCase, Monitor monitor, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        myCase.pressPowerButton();
        this.drawLogo();
    }

    public void drawLogo(){
        monitor.drawPixelAt(1000,200,"red");
    }
}
