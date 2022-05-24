import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("conf.properties")) {
            props.load(fis);
        }
        Class.forName(props.getProperty("jdbc.driver.class"));

        String url = props.getProperty("jdbc.url");
        String login = props.getProperty("jdbc.login");
        String password = props.getProperty("jdbc.password");

        try (Connection connection = DriverManager.getConnection(url, login, password)) {
//            String strSql = "INSERT INTO hero ( Type, Name, LvlHp, LvlAttack, Arme, Bouclier)" +
//                   " VALUES ( 'Guerrier', 'Franciiis', 10, 10, 'couteauDangereux', 'pshit')";
//            try (Statement statement = connection.createStatement()){
//                statement.executeUpdate(strSql);
//            }
            String strSql = " Select * FROM hero";
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery(strSql);
                while (resultSet.next()) {
                    int Id = resultSet.getInt(1);
                    String Type = resultSet.getString(2);
                    String Name = resultSet.getString(3);
                    int LvlHp = resultSet.getInt(4);
                    int LvlAttack = resultSet.getInt(5);
                    String Arme = resultSet.getString(6);
                    String Bouclier = resultSet.getString(7);

                    System.out.printf(Id + " " +Type + " " + Name + " " + LvlHp + " " + LvlAttack + " " + Arme + " " + Bouclier + "\n");
                }
            }
        }
    }
}



