package tareaaulica1009;

public class MainMascota {
    public static void main(String[] args){
        Dueño dueño1 = new Dueño("Franco", 18, 29666666);
        Mascota mascota1 = new Mascota("Rocky", "perro", dueño1, 5);
        System.out.println(mascota1);
         System.out.println(mascota1.estimarEdadHumana() );
    }
}
