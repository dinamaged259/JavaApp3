
package modeling_task1;
import javax.swing.*;
import java.text.DecimalFormat;

public class Modeling_Task1 {

    
    public static void main(String[] args) {
        String prin=JOptionPane.showInputDialog("Enter The Principal Value");
        double P=Double.parseDouble(prin);
        String term=JOptionPane.showInputDialog("Enter The Number of Terms");
        double T=Double.parseDouble(term);
        String rate=JOptionPane.showInputDialog("Enter The Annual Rate");
        double R=Double.parseDouble(rate);
        double N=T*12;
        double I=(R/100)/12;
        double M=(P*(I*(Math.pow((1+I),N))))/((Math.pow((1+I),N))-1);
        
        
        
        
        int months=1;
        int month=1;
        int year=2023;
        double begining=P;
        double payment=M;
        double interest=I*begining;
        double principal=payment-interest;
        double ending =begining-principal;
        String output="";
        output+=String.format("%s", "Months");
        output+=String.format("%30s", "Date");
        output+=String.format("%51s", "Beginning Balance");
        output+=String.format("%22s", "Payment");
        output+=String.format("%37s", "Interest");
        output+=String.format("%36s", "Principal");
        output+=String.format("%40s", "Ending Balance");
        output+="\n";
        DecimalFormat m1 = new DecimalFormat("#000");
        DecimalFormat m2 = new DecimalFormat("#00");
        DecimalFormat m3 = new DecimalFormat("#.00");
        for(int i=1; i<=N; i++)
        {
            output+=String.format("%7s", m1.format(months));
            output+=String.format("%30s", m2.format(month));
            output+="/1/"+year;
            if(month==12)
            {
                month=1;
                year++;
            }
            else
                month++;
                
            
            output+=String.format("%30s", "$");
            output+=String.format( m3.format(begining));
            begining=ending;
            
            output+=String.format("%30s", "$");
            output+=String.format( m3.format(payment));
            output+=String.format("%30s", "$");
            output+=String.format( m3.format(interest));
            interest=begining*I;            
            
            
            output+=String.format("%30s", "$");
            output+=String.format( m3.format(principal));
            principal=payment-interest;
            output+=String.format("%30s", "$");
            output+=String.format( m3.format(ending));
            
            ending=begining-principal;
            
       
            
            
            output+="\n";
         
        }
        JOptionPane.showMessageDialog(null, output);
        
    }
    
}
