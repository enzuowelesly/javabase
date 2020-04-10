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
        if (usb instanceof Keyboard){
            Keyboard keyboard=(Keyboard)usb;
            keyboard.type();
        }else if (usb instanceof  Mouse){
            Mouse mouse =(Mouse)usb;
            mouse.click();
        }
        usb.close();
    }
}
