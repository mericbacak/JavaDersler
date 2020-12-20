package Abstract_Classes;

public class Main {
    public static void main (String [] args){
        Abstract_DataBase abstract_dataBase1= new MySQL_DB();
        Abstract_DataBase abstract_dataBase2= new MongoDB();

        abstract_dataBase1.add();
        abstract_dataBase2.add();

        abstract_dataBase1.update();
        abstract_dataBase2.update();

        abstract_dataBase1.get();
        abstract_dataBase2.get();

        abstract_dataBase1.delete();
        abstract_dataBase2.delete();
    }
}
