package com.juhuyoon;

//by using composition, you don't run into the issue of extending only one class.
//this will allow for multiple cases to be connected together.
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy graphic
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
