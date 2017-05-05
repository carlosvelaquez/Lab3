package lab3_carlosvelasquez;

public class Delantero extends Jugador{
    float nivelDefinicion, altura, velocidad, promedioGoles;

    public Delantero() {
    }

    public Delantero(float nivelDefinicion, float altura, float velocidad, float promedioGoles, String nombre, String apellido, String paisNacimiento, String equipo, char piePreferido, int edad, int numero, float precio, boolean estado) {
        super(nombre, apellido, paisNacimiento, equipo, piePreferido, edad, numero, precio, estado);
        this.nivelDefinicion = nivelDefinicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.promedioGoles = promedioGoles;
    }

    public float getNivelDefinicion() {
        return nivelDefinicion;
    }

    public void setNivelDefinicion(float nivelDefinicion) {
        this.nivelDefinicion = nivelDefinicion;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getPromedioGoles() {
        return promedioGoles;
    }

    public void setPromedioGoles(float promedioGoles) {
        this.promedioGoles = promedioGoles;
    }
    
    
}
