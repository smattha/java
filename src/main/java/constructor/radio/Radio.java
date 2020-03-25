package constructor.radio;

/**
 * @author Matthaiakis Stergios>
 */
public class Radio {
    int volume;        //0 -10
    float tuning;        //current station tuned in
    char band;        //'A' for AM or 'F' for FM

    Radio() {
        System.out.println("Inside no-argument constructor");
        tuning = 80.0F;
        band = 'F';
        volume = 5;
    }

    Radio(float t) {
        System.out.println("Inside float constructor");
        tuning = t;
        band = 'A';
        volume = 8;
    }

    void turnOn(int v, float t, char b) {
        System.out.println("Turning on the radio");
        setVolume(v);
        setBand(b);
        tuning = t;
    }

    void setVolume(int volume) {
        //make sure the input is valid (between 0 and 10)
        System.out.println("Setting the volume to " + volume);
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            this.volume = 0;
        }

        //Let's see what happens here
        volume = -5;
    }

    void setBand(char b) {
        System.out.println("Setting the band to " + b);
        //make sure the input is valid ('A' or 'F')
        if (b == 'A' || b == 'F') {
            band = b;
        } else {
            band = 'F';
        }
    }

    void turnUp() {
        System.out.println("Turning the volume up");
        if (volume < 10) {
            volume += 1;    //increase volume by 1
        }
    }

    void turnDown() {
        System.out.println("Turning the volume down");
        if (volume > 0) {
            volume -= 1;    //decrease volume by 1
        }
    }

    float getTuning() {
        System.out.println("Inside getTuning");
        return tuning;
    }

    void changeBand() {
        System.out.println("Switching bands");
        if (band == 'A') {
            band = 'F';
        } else {
            band = 'A';
        }
    }
}
