package tech.bts.precourse.samples.classes.radio;

public class Radio {

    // Fields / properties
    private boolean on;
    private int volume;
    private int maxVolume;

    // Constructor
    public Radio() {
        this.on = false;
        this.volume = 0;
        this.maxVolume = 100;
    }

    // Methods

    public void turnVolumeUp(int amount) {

        if (this.on) {

            this.volume += amount;
            if (this.volume > this.maxVolume) {
                this.volume = this.maxVolume;
            }
        }
    }

    public void turnVolumeDown(int amount) {

        if (this.on) {

            this.volume -= amount;
            if (this.volume < 0) {
                this.volume = 0;
            }
        }
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public String toString() {

        /*
        String onOff;

        if (this.on) {
            onOff = "ON";
        } else {
            onOff = "OFF";
        }
        */

        // CONDITION ? VALUE_IF_TRUE : VALUE_IF_FALSE
        String onOff = this.on ? "ON" : "OFF";

        return "The radio is " + onOff + ", volume: " + this.volume;
    }
}
