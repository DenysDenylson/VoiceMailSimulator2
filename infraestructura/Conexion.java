import java.sql.DriverManager;
import java.sql.SQLException;
//import org.postgresql.Driver;


public class Conexion {

    java.sql.Connection con;
    java.sql.Statement st;
    java.sql.ResultSet res;

    public Conexion() {
        try {
            try {
                Class.forName("org.postgresql.Driver");
                System.out.println("Se cargo el driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Error al cargar el Driver");
            }
            con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/db_VoiceMail", "user", "123");
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar a la base de datos"+ex.toString());
        }        
    }
    
    public void Insertar(String sql){
        try {
            st = con.createStatement();
            st.executeQuery(sql);
            //java.sql.ResultSet rs = st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error en el insertado:"+e.toString());
        }
    }
    
    public java.sql.ResultSet Consulta(String sql){
        try {
            st = con.createStatement();//se conecta con el motor de base datos
            return st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error en la consulta:"+e.toString());
            return null;
        }
    }
    
    public String Eliminar(String sql){
        try {
            st = con.createStatement();//se conecta con el motor de base datos
            int resultado = st.executeUpdate(sql);
            if (resultado == 1) {
                return "Elimino";
            } else {
                return "Error";
            }
        } catch (SQLException e) {
            System.out.println("Error al Insertado"+e.toString());
            return "Error";
        }
    }
    
    public String Modificar(String sql){
        try {
            st = con.createStatement();//se conecta con el motor de base datos
            int resultado = st.executeUpdate(sql);
            if(resultado == 1)
                return "Actulizado";
            else
                return "Error";
        } catch (SQLException e) {
            System.out.println("Error insertado:"+e.toString());
            return "error";
        }
    }
    
    public boolean Validar(String sql){
        java.sql.ResultSet hoja_resultados = null;
        try {
            st = con.createStatement();//se conecta con el motor de base datos
            hoja_resultados = st.executeQuery(sql);
            if(hoja_resultados.next())//si los datos son correctos
                return true;
            else//No esta registro en la base de datos
                return false;
        } catch (SQLException e) {
            System.out.println("Error Consultado:"+e.toString());
            return false;
        }
    }
}
