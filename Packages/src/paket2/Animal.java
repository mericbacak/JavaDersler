package paket2;
///Java Programlama Dersleri 39 - Protected
public class Animal {
 protected String name;

    public Animal(String name) {
        super();
        this.name = name;
    }
    public void speak(){
        System.out.println(this.name+ " konuşuyor");
    }
}
