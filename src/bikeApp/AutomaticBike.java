package bikeApp;

public class AutomaticBike {

    private boolean isOn;
    private int currentSpeed;
    private int currentGear;

    public AutomaticBike() {
        this.isOn = false;
        this.currentSpeed = 0;
        this.currentGear = 1;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setGear(int gear) {
        this.currentGear = gear;
    }

    public void accelerate() {
        switch (currentGear) {
            case 1:
                currentSpeed += 1;
                break;
            case 2:
                currentSpeed += 2;
                break;
            case 3:
                currentSpeed += 3;
                break;
            case 4:
                currentSpeed += 4;
                break;
        }
        checkAutomaticGearChange();
    }

    public void decelerate() {
        switch (currentGear) {
            case 1:
                currentSpeed = Math.max(0, currentSpeed - 1);
                break;
            case 2:
                currentSpeed = Math.max(0, currentSpeed - 2);
                break;
            case 3:
                currentSpeed = Math.max(0, currentSpeed - 3);
                break;
            case 4:
                currentSpeed = Math.max(0, currentSpeed - 4);
                break;
        }
        checkAutomaticGearChange();
    }

    private void checkAutomaticGearChange() {
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }

        if (currentSpeed > 40) {
            currentGear++;
            currentSpeed = Math.min(40, currentSpeed);
        }
    }
}

