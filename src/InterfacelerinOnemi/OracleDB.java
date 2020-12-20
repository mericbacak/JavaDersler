package InterfacelerinOnemi;

public class OracleDB implements IDatabase {
    @Override
    public void add() {
        System.out.println("ORacle ekleme");
    }

    @Override
    public void get() {
        System.out.println("Oracle get");
    }

    @Override
    public void update() {
        System.out.println("Oracle güncelleme");
    }

    @Override
    public void delete() {
        System.out.println("Oracle silme");
    }
}
