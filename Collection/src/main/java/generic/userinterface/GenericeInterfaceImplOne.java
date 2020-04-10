package generic.userinterface;

public class GenericeInterfaceImplOne implements GenericeInterface<String> {
    @Override
    public void show(String o) {
        System.out.println(o);

    }
}
