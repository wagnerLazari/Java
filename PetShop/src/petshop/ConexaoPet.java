

package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class ConexaoPet {
      public ConexaoPet(){
          try{
            Class.forName("org.apache.derby.jdbc.ClientService");
            
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/PetShop"); 
            Statement declara = con.createStatement();  
            ResultSet resultado = declara.executeQuery("Select * from agenda");
            while (resultado.next()){
                
            }

            resultado.close();
            declara.close();
            con.close();
        
        }catch(Exception e){
            e.printStackTrace();
        } 
      }   
}
