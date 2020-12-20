public class Main1 {
    public static void Deneme1(){
        //static tanımlanmzasa çağrılmaz;
        System.out.println("DEneme");
    }
    public static void main(String[] args){
        Student student1=new Student();
        Student student2=new Student();
        Student student3=new Student();
        System.out.println("öğrenci sayısı "+ Student.no_of_students);
        System.out.println(Student.deneme());
        Deneme1();
    }
}
