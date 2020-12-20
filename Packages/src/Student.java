public class Student {
    public static int no_of_students=0;
    //bu şekilde tanımlarsan bellekte 0 olarak tanımlanır
    public Student(){
        no_of_students++;
    }
    public static String deneme(){
        return "statik method";
    }
}
