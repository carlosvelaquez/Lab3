package lab3_carlosvelasquez;

public class Portero extends Jugador{
    float nivelJuegoAereo, nivelJuegoPies;

    public Portero() {
    }

    public Portero(float nivelJuegoAereo, float nivelJuegoPies, String nombre, String apellido, String paisNacimiento, String equipo, char piePreferido, int edad, int numero, float precio, boolean estado) {
        super(nombre, apellido, paisNacimiento, equipo, piePreferido, edad, numero, precio, estado);
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
