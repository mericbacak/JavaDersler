package paket1;
import paket2.Animal;
import paket2.Student2;

class Main1 {//default
    public static void main(String [] args){
        //Student2 student1= new Student2("Meriç BAcak ");
        //student1.study();
        Student1 student1=new Student1("MEriç BAcak");
        student1.study();
        Animal animal=new Animal("Hayvan");
        //System.out.println(Animal.name);
        //protected olduğu için bu satır hata verir.
    }
}
