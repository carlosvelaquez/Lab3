package lab3_carlosvelasquez;

public class Defensa extends Jugador{
    float nivelAgresividad, altura, peso, velocidad;

    public Defensa() {
    }

    public Defensa(float nivelAgresividad, float altura, float peso, float velocidad, String nombre, String apellido, String paisNacimiento, String equipo, char piePreferido, int edad, int numero, float precio, boolean estado) {
        super(nombre, apellido, paisNacimiento, equipo, piePreferido, edad, numero, precio, estado);
        this.nivelAgresividad = nivelAgresividad;
        this.altura = altura;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public float getNivelAgresividad() {
        return nivelAgresividad;
    }

    public void setNivelAgresividad(float nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
