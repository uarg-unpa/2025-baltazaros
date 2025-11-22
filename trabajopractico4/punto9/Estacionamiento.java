package punto9;

public class Estacionamiento {

   private String nombre;
   private PilaAuto lugares;
   
   public Estacionamiento(String n) {
      nombre = n;
      lugares = new PilaAuto();   
   } 
   
   public boolean ingresar(Auto a) {
      if (!lugares.estaLlena()){
         lugares.meter(a);
         return true;
      }else
         return false;   
   }
   
   public Auto egresar(String p) {
      PilaAuto aux = new PilaAuto();
      Auto au = null;
      boolean enc=false;
      while ( !lugares.estaVacia() & !enc ){
         Auto a = lugares.sacar();
         a.incrementarCont();
         if ( a.getPatente().equals(p) ) {
            au=a;
            enc=true;
         }
         else 
            aux.meter(a);     
      }
      while (!aux.estaVacia())
         lugares.meter(aux.sacar());    
   
      return au;
   } 





}