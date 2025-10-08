package trabajopractico2.punto6; //aparentemente me da error el tema del package, desconozco el porqué, si está todo bien escrito.

public class Fecha {

    private int dia, mes, año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
        }
    public void setMes(int mes) {
        this.mes = mes;
        }
    public void setAño (int año) {
        this.año = año;
        }
    
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    
    public String getNombreMes() {
    switch (mes) {
        case 1:  return "Enero";
        case 2:  return "Febrero";
        case 3:  return "Marzo";
        case 4:  return "Abril";
        case 5:  return "Mayo";
        case 6:  return "Junio";
        case 7:  return "Julio";
        case 8:  return "Agosto";
        case 9:  return "Septiembre";
        case 10: return "Octubre";
        case 11: return "Noviembre";
        case 12: return "Diciembre";
        default: return "Mes inválido";
        }
    }

}