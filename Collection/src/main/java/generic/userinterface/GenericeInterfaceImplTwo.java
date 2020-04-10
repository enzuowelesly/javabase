package generic.userinterface;

public class GenericeInterfaceImplTwo<E> implements GenericeInterface<E> {
    @Override
    public void show(E e) {
        System.out.println(e);

    }
    public void showint(int in){
        System.out.println(in);
    }
}
