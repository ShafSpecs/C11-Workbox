package snack2;

public class Bike {
    private boolean powerOn = false;
    private int speed;
    private int gear = 1;

    public boolean getPowerOn() {
        return powerOn;
    }

    public void setPowerOn() {
        powerOn = true;
    }

    public void setPowerOff() {
        powerOn = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCurrentGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    private void checkGear() {
        if(speed <= 20) {
            setGear(1);
        } else if (speed > 20 && speed <= 30) {
            setGear(2);
        } else if (speed > 30 && speed <= 40) {
            setGear(3);
        } else {
            setGear(4);
        }
    }

    public void accelerate() {
        if(speed <= 20) {
            setSpeed(this.speed + 1);
            setGear(1);
        } else if (speed > 20 && speed <= 30) {
            setSpeed(this.speed + 2);
            setGear(2);
        } else if (speed > 30 && speed <= 40) {
            setSpeed(this.speed + 3);
            setGear(3);
        } else {
            setSpeed(this.speed + 4);
            setGear(4);
        }

        checkGear();
    }

    public void decelerate() {
        if(speed <= 20) {
            setSpeed(this.speed - 1);
            setGear(1);
        } else if (speed > 20 && speed <= 30) {
            setSpeed(this.speed - 2);
            setGear(2);
        } else if (speed > 30 && speed <= 40) {
            setSpeed(this.speed - 3);
            setGear(3);
        } else {
            setSpeed(this.speed - 4);
            setGear(4);
        }

        checkGear();
    }
}
