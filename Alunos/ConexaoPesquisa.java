package aula11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexaoPesquisa {

    public ArrayList medos = new ArrayList(); 
    
    public ConexaoPesquisa() {
     try {
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
            Connection con = DriverManager.getConnection("jdbc:odbc:fobias");
            Statement declara = con.createStatement(); 
            ResultSet resultado = declara.executeQuery("Select * from fobias"); 
            
            while(resultado.next()){
                
                medos.add(resultado.getString("NomeFobia").toLowerCase());
                
            }
            
            resultado.close();
            declara.close();
            con.close();
            
        }
        catch(Exception e){
            
            e.printStackTrace();
            
        }
        
    }
    
    public ArrayList pesquisator(String pedaco){
        
        ArrayList retorno = new ArrayList(); 
        
        for(int i = 0; i < medos.size(); i++){
            
            String fobia = (String)medos.get(i); 

            if(fobia.indexOf(pedaco)>=0){
                retorno.add(fobia); 
            }else { }
        }
        return retorno; 
    }
}
