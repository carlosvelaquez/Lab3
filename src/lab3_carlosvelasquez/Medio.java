package lab3_carlosvelasquez;

public class Medio extends Jugador{
    float nivelCreatividad, nivelDominio, promedioAsistencias;

    public Medio() {
    }

    public Medio(float nivelCreatividad, float nivelDominio, float promedioAsistencias, String nombre, String apellido, String paisNacimiento, String equipo, char piePreferido, int edad, int numero, float precio, boolean estado) {
        super(nombre, apellido, paisNacimiento, equipo, piePreferido, edad, numero, precio, estado);
        this.nivelCreatividad = nivelCreatividad;
        this.nivelDominio = nivelDominio;
        this.promedioAsistencias = promedioAsistencias;
    }

    public float getNivelCreatividad() {
        return nivelCreatividad;
    }

    public void setNivelCreatividad(float nivelCreatividad) {
        this.nivelCreatividad = nivelCreatividad;
    }

    public float getNivelDominio() {
        return nivelDominio;
    }

    public void setNivelDominio(float nivelDominio) {
        this.nivelDominio = nivelDominio;
    }

    public float getPromedioAsistencias() {
        return promedioAsistencias;
    }

    public void setPromedioAsistencias(float promedioAsistencias) {
        this.promedioAsistencias = promedioAsistencias;
    }
    
    
}
