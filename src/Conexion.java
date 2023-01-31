import javax.xml.transform.Result;
import java.sql.*;


public class Conexion {
    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection Conexion = DriverManager.getConnection("jdbc:mysql://localhost/ESTUDIANTES", "root", "Pelota2002");
            Statement s = Conexion.createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM NOM_ESTUDIANTES");
            while (rs.next()) {
                System.out.println(rs.getString("Nom_Estudiante") + " " + rs.getString(3));
            }
            Conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
