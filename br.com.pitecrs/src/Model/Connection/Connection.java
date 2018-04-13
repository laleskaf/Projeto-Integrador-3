
package Model.Connection;

import java.sql.DriverManager;

/**
 *
 * @author rafael.eraquino
 */
public class Connection {
    
    public Connection() {
    }
    
    //public static Connection conector(){
        //Connection conector;
        
        String driver = "com.mysql.jdbc.Driver";
        String urlConector = "jdbc:mysql://localhost:3306/produto";
        String login = "root";
        String senha = "";
        
        ///try{
            //Class.forName(driver);
            
            //conector = DriverManager.getConnection(urlConector, login, senha);
            //return conector;
        //}
        //catch(Exception e){
           // return null;
        //}
        
   // }
}
