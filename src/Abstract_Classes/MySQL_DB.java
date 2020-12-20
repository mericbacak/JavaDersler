package Abstract_Classes;

public class MySQL_DB  extends Abstract_DataBase{
    @Override
    void update() {
        System.out.println("MySQL_DB Güncellendi");
    }

    @Override
    void get() {
        System.out.println("MYSQL_DB elde edildi");
    }
}
