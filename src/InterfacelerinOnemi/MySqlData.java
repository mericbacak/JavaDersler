package InterfacelerinOnemi;

public class MySqlData implements IDatabase {
    @Override
    public void add() {
        System.out.println("MySql Ekleme");
    }

    @Override
    public void get() {
        System.out.println("MySql elde etme");
    }

    @Override
    public void update() {
        System.out.println("MySql güncelleme");
    }

    @Override
    public void delete() {
        System.out.println("MySql silme");
    }
}
