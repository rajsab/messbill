
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajdeep
 */
public class helper {
    
    public void runquery(String sql,int flag){
        Connection con;
        try{
           con=connect();
            PreparedStatement ps=con.prepareStatement(sql);
            if(flag==1){
               ResultSet rs=ps.executeQuery();
               if(!rs.next()){
                   JOptionPane.showMessageDialog(null,"Sorry,search result not found");
               }
            }
            else{
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Success");
            }
                
            
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
             
   }
 public Connection connect(){
             Connection con=null;
             try{
                 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/messbilling?zeroDateTimeBehavior=convertToNull","root","1234");
             
             }
             catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
             }
        return con;
 }
    
    
    
    
    
    
    
    
    
    
    
}
