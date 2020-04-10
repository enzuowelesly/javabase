package usbdriver;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("open keyboard");
    }

    @Override
    public void close() {
        System.out.println("close keyboard");
    }
    public void type(){
        System.out.println("keyboard type");
    }
}
