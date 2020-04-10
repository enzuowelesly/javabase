package usbdriver;

public class Computer {
    public void  powerOn(){
        System.out.println("turn on ");
    }
    public void powerOff(){
        System.out.println("turn off");
    }
    public void  usedevice( USB usb){
        usb.open();
        usb.close();
    }
}
