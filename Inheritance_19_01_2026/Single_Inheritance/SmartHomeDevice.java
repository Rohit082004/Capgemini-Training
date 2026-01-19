public class SmartHomeDevice {
    public static void main(String[] args) {
        Device d = new Thermostat(101, "ON", 25);
        d.displayStatus();
    }
}

class Device {
    int deviceId;
    String status;

    Device(int d, String s) {
        this.deviceId = d;
        this.status = s;
    }

    void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status : " + status);
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    public Thermostat(int deviceId, String status, double t) {
        super(deviceId, status);
        this.temperatureSetting = t;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
    }
}
