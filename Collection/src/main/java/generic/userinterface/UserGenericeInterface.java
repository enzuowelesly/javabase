package generic.userinterface;

public class UserGenericeInterface {
    public static void main(String[] args) {
        GenericeInterfaceImplOne genericeInterface =new GenericeInterfaceImplOne();
        genericeInterface.show("string");

        GenericeInterfaceImplTwo<Integer> genericeInterfaceImplTwo =new GenericeInterfaceImplTwo();
            genericeInterfaceImplTwo.show(12);
            genericeInterfaceImplTwo.showint(22);
    }
}
