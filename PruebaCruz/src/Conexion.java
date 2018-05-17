import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp.BasicDataSource;


public class Conexion {
  
    
    
    
    
    public DataSource dataSource;
    
    static String bd = "cruz roja"; //mencionasmos la base de datos
    static String login = "root"; //mencionamos el usuario
    static String pass = ""; // mencionamos la contraseña
    static String url = "jdbc:mysql://localhost/"+bd; // hacemos la conexion    
    static Connection con; // nombramos el conector
    
    
    public Conexion(){
        
        inicializaDataSource();
        
    }
    
    private void inicializaDataSource(){
    
            BasicDataSource basicDataSource = new BasicDataSource();
            
            basicDataSource.setDriverClassName("org.gjt.mm.mysql.Driver");
            basicDataSource.setUsername(login);
            basicDataSource.setPassword(pass);
            basicDataSource.setUrl(url);
            basicDataSource.setMaxActive(50);
            
            dataSource = basicDataSource;
            
            
    }
    public static Connection geConnection(){
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         con = DriverManager.getConnection(url,login,pass);
         if (con!=null){
            System.out.println("Conección a base de datos "+bd+". listo");
         }
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error al conectar"+e.getMessage());
      }
        return con;
   }
   
}
    
