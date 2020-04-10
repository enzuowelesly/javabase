package usbdriver;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("open mouse");
    }

    @Override
    public void close() {
        System.out.println("close mouse");

    }
}
