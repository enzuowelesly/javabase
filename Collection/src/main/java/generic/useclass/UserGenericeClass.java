package generic.useclass;

public class UserGenericeClass {
    public static void main(String[] args) {
        GenericeClass genericeClass =new GenericeClass();
        genericeClass.setName("my name is enzo");
        System.out.println(genericeClass.getName());

        GenericeClassE genericeClassEno=new GenericeClassE();
        genericeClassEno.setName("lal");
        System.out.println(genericeClassEno.getName());
        System.out.println("==============");
        GenericeClassE<Integer> genericeClassE =new GenericeClassE<>();
        genericeClassE.setName(12);
        int i=genericeClassE.getName();
        System.out.println(i);


        GenericeClassE<String>genericeClassE1 = new GenericeClassE<>();
        genericeClassE1.setName("yaya");
        String srt =genericeClassE1.getName();
        System.out.println(srt);
    }
}
