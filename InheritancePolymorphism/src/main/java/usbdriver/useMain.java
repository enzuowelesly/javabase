package usbdriver;

public class useMain {
    public static void main(String[] args) {
        Computer computer =new Computer();
        computer.powerOn();
        USB mouse =new Mouse();
        computer.usedevice(mouse);


        Keyboard keyboard =new Keyboard();

        computer.usedevice(keyboard);
        System.out.println("===============");
        computer.usedevice(new Mouse());
        computer.usedevice(new Keyboard());

        computer.powerOff();
    }
}
