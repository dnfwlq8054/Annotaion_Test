import java.lang.annotation.*;

class AnnotationTest {

    @Color("green")
    @Color("blue")
    @Color("red")
    private class RGBColor {}

    @Color("green")
    public class GreenColor {}

    public void repeatableAnnotationTest() {
        RGBColor rgbColor = new RGBColor();
        GreenColor greenColor = new GreenColor();

        Colors rgbColors = rgbColor.getClass().getAnnotation(Colors.class);
        Color[] rgbColorArray = rgbColor.getClass().getAnnotationsByType(Color.class);

        Colors greenColors = greenColor.getClass().getAnnotation(Colors.class);
        Color[] greenColorArray = greenColor.getClass().getAnnotationsByType(Color.class);

        System.out.println("rgbColors : " + rgbColors);
        System.out.println("rgbColorArray : " + rgbColorArray);
        System.out.println("rgbColorArray.length : " + (rgbColorArray != null ? rgbColorArray.length : 0));
        System.out.println("greenColors : " + greenColors);
        System.out.println("greenColorArray : " + greenColorArray);
        System.out.println("greenColorArray.length : " + (greenColorArray != null ? greenColorArray.length : 0));
    }

    public static void main(String[] args) {
        AnnotationTest test = new AnnotationTest();

        test.repeatableAnnotationTest();
    }
}