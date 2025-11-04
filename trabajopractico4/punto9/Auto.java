package punto9;

public class Auto {

   private String patente;
   private int cont;
   
   public Auto() {
      patente="";
      cont=0;
   } 
   
   public Auto(String p) {
      patente=p;
      cont=0;
   }
   
   public String getPatente() {
      return patente;      
   }
   
   public int getCont() {
      return cont;      
   }
   
   public void setPatente(String p) {
      patente = p;      
   }
   
   public void incrementarCont() {
      cont = cont + 1;
   }
     
}