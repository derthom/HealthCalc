/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthcalc;

/**
 *
 * @author Derrick
 */
public class HealthCalc {
    double diet=0.0,health=0.0,dna=0.0,fe1=0.0,fe2=0.0;
    double res=0.0,result=0.0;;
    /**
     * @param args the command line arguments
     */
    //public double calc(double,double,double);
    public static void main(String[] args) {
        
        HealthCalc c=new HealthCalc();
        c.calc();
        
        // TODO code application logic here
    }
    public void calc()
    {
      System.out.println("For Realistic Scenario of Overall Health");
      dna=3;
      
      for(double i=1.0;i<=5;i++)
      {
          //String fe11=ratings(i);
          
          for(double j=1.0;j<=5;j++)
          {
              //System.out.println("WHEN DIET"+fe11+"AND");
              //String fe22=ratings(j);
              //System.out.println("WHEN HABITS"+fe22+"THEN OVERALL RATING IS");
              System.out.println("DIET :"+i+" AND HEALTH :"+j);
              result=(i*j)/dna;
              System.out.println(result);
          }
          
      }
      
      
    }
    public String ratings(int fe1)
    {
        switch(fe1){
            case 1:String s1="VERY BAD";
                    return s1;
                    //break;
            case 2:String s2="BAD";
                   return s2;
            case 3 :String s3="AVERAGE";
                   return s3;
            case 4:String s4="GOOD";
                   return s4;
            case 5:String s5="VERY GOOD";
                   return s5;
            default:String s6=" ";
                    return s6; 
        }
        
    }
}
