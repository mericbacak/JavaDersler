package InterfacelerinOnemi;

public class MongoDB implements IDatabase{
    @Override
    public void add() {
        System.out.println("MongoDB ekleme");
    }

    @Override
    public void get() {
        System.out.println("MongoDB get");
    }

    @Override
    public void update() {
        System.out.println("MongoDB güncelleme");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB silme");
    }
}
