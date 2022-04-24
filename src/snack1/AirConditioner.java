package snack1;

public class AirConditioner {
    private boolean acState;

    public boolean getAcOn() {
        return acState;
    }

    public void turnOn() {
        acState = true;
    }

    public void turnOff() {
        acState = false;
    }
}
