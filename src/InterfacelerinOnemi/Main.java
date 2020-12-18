package InterfacelerinOnemi;

class DataBaseManager{
    public void AddDataBase(IDatabase database){
        database.add();
    }
    public void UpdateDataBase(IDatabase database){
        database.update();
    }
    public void DeleteDataBase(IDatabase database){
        database.delete();
    }
    public void GetDataBase(IDatabase database){
        database.get();
    }
}
public class Main {
    public static void main(String[] args){
        DataBaseManager manager = new DataBaseManager();
        manager.AddDataBase(new MySqlData());
        manager.AddDataBase(new MongoDB());
        manager.AddDataBase(new OracleDB());

        manager.UpdateDataBase(new MySqlData());
        manager.UpdateDataBase(new MongoDB());
        manager.UpdateDataBase(new OracleDB());

        manager.DeleteDataBase(new MySqlData());
        manager.DeleteDataBase(new MongoDB());
        manager.DeleteDataBase(new OracleDB());

        manager.GetDataBase(new MySqlData());
        manager.GetDataBase(new MongoDB());
        manager.GetDataBase(new OracleDB());
    }
}
