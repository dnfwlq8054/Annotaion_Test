import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Annotaion_Test {
    @Annotation_interface()
    String s = "first";

    @Annotation_interface("hwan")
    String name = "second";
    int num = 100;

    public void anno_fnc(){
        System.out.println(name);
        System.out.println(num);
    }

    public static void main(String[] args) {
        Annotaion_Test at = new Annotaion_Test();
        Field[] ano_met = Annotaion_Test.class.getDeclaredFields();

        for(Field e : ano_met){
            Annotation_interface a = e.getAnnotation(Annotation_interface.class);
            System.out.println(e.getName());
            if(a != null) {
              //  System.out.println(a.value() + a.num());
               // System.out.println(e.get(new Annotaion_Test()));
            }
        }
    }
}
