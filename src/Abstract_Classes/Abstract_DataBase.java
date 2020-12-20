package Abstract_Classes;

public abstract class Abstract_DataBase {
    public void add(){
        System.out.println("Eklendi");
    }
    public void delete(){
        System.out.println("Silindi");
    }
    abstract void update();
    abstract void get();
}
