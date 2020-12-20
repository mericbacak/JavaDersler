package Abstract_Classes;

public class MongoDB  extends Abstract_DataBase{
    @Override
    void update() {
        System.out.println("MongoDB Güncellendi");
    }

    @Override
    void get() {
        System.out.println("MongoDB elde edildi");
    }
}
