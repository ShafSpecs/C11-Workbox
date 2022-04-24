package snack1;

public class AirConditioner {
    private boolean acState;
    private int temperature = 18;

    public boolean getAcOn() {
        return acState;
    }

    public void turnOn() {
        acState = true;
    }

    public void turnOff() {
        acState = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void changeTemperature(int newTemperature) {
        if (newTemperature >= 16 && newTemperature <= 30) {
            temperature = newTemperature;
        } else if (newTemperature < 16) {
            temperature = 16;
        } else {
            temperature = 30;
        }
    }
}
