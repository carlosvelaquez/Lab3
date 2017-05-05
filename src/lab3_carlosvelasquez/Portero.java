package lab3_carlosvelasquez;

public class Portero extends Jugador{
    float nivelJuegoAereo, nivelJuegoPies;

    public Portero() {
    }

    public Portero(float nivelJuegoAereo, float nivelJuegoPies, String nombre, String apellido, String paisNacimiento, char piePreferido, int edad, float precio) {
        super(nombre, apellido, paisNacimiento, piePreferido, edad, precio);
        this.nivelJuegoAereo = nivelJuegoAereo;
        this.nivelJuegoPies = nivelJuegoPies;
    }
    
    public float getNivelJuegoAereo() {
        return nivelJuegoAereo;
    }

    public void setNivelJuegoAereo(float nivelJuegoAereo) {
        this.nivelJuegoAereo = nivelJuegoAereo;
    }

    public float getNivelJuegoPies() {
        return nivelJuegoPies;
    }

    public void setNivelJuegoPies(float nivelJuegoPies) {
        this.nivelJuegoPies = nivelJuegoPies;
    }
    
    
}
