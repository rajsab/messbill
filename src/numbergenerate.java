import java.util.Random;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajdeep
 */
public class numbergenerate {
public String a;
   
    public String generate(){
        a="";
        Random r=new Random();
        char alphabet[]=new char[25]; 
        int i,j=0,k;
        for(i=65;i<90;i++){
        alphabet[j]=(char) i;
        j++;
        }
        for(j=0;j<7;j++){
            if(j<3){
                k=r.nextInt(24);
                a=a+alphabet[k];
            }
            else{
                k=r.nextInt(9);
                a=a+k;
            }
        }
        return(a);
        
    }
    
}

