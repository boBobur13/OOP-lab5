class SmartDevice {
    private String brand;
    private boolean isPowerOn;
    public SmartDevice(String brand, boolean isPowerOn) {
        this.brand = brand;
        this.isPowerOn = isPowerOn;
    }
    public String getStatus() {
        return "Brand : " + brand + ", Power: " + (isPowerOn ? "on" : "off");
    }
}
class Hub<T> {
    private T device;
    public void storeDevice(T item) {
        device = item;
    }
    public T getDevice() {
        return device;
    }
    public void statusReport() {
        if (device instanceof SmartDevice) {
            System.out.println(((SmartDevice) device).getStatus());
        } else {
            System.out.println(device);
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        SmartDevice lamp = new SmartDevice(" BMW ", true);
        Hub<SmartDevice> myHub = new Hub<>();
        myHub.storeDevice(lamp);
        myHub.statusReport();
    }
}
