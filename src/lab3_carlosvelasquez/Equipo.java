package lab3_carlosvelasquez;

import java.util.ArrayList;

public class Equipo {
    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Jugador> formacion = new ArrayList();
    
    String nombre, ciudad;
    float presupuesto;
    int palmares;

    public Equipo() {
    }

    public Equipo(String nombre, String ciudad, float presupuesto) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getFormacion() {
        return formacion;
    }

    public void setFormacion(ArrayList<Jugador> formacion) {
        this.formacion = formacion;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPalmares() {
        return palmares;
    }

    public void setPalmares(int palmares) {
        this.palmares = palmares;
    }

    @Override
    public String toString() {
        return " | " + nombre + " | " + ciudad + " | " + presupuesto + " | " + palmares + " | ";
    }
    
    public boolean hayPortero(){
        for (Jugador j : jugadores) {
            if (j.getTipo() == 'P') {
                return true;
            }
        }
        return false;
    }
}
