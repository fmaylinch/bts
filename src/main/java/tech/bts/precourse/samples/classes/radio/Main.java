package tech.bts.precourse.samples.classes.radio;

/**
 * 1- Create a Radio class.
 * 2- It should have the field `volume`.
 * 3- The volume should be initialized to 0.
 * 4- Add the methods `turnVolumeUp` and `turnVolumeDown`.
 * 5- The volume can never be lower than 0 or greater than 100.
 * 6- Add the `toString` method with a message like "The radio is playing at volume XXX".
 * 7- Add methods `turnOn` and `turnOff`.
 * 8- The `toString` now would say "The radio is on/off. Volume is XXX".
 *    Or it may say "The radio if off" / "The radio is playing at volume XXX".
 *
 * Not done yet:
 *
 * 9- The radio now can store 10 channels. They are initialized to frequency 100.0
 *    You can play one channel with `playChannel(INDEX)`.
 *    You can set the channel frequency, with `setChannelFrequency(INDEX, FREQUENCY).
 *    Now `toString` would say e.g. "Radio playing frequency 87.7 with volume 70".
 */
public class Main {

    public static void main(String[] args) {

        Radio radio = new Radio();

        radio.turnVolumeUp(10);

        System.out.println( radio );

        radio.turnOn();

        radio.turnVolumeUp(70);
        radio.turnVolumeDown(30);

        System.out.println( radio );
    }
}
