package lab3_carlosvelasquez;

public class Jugador {
    String nombre, apellido, paisNacimiento, equipo = "Ninguno";
    char piePreferido, tipo = 'n';
    int edad, numero;
    float precio;
    public boolean estado;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, String paisNacimiento, char piePreferido, int edad, float precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisNacimiento = paisNacimiento;
        this.piePreferido = piePreferido;
        this.edad = edad;
        this.precio = precio;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public char getPiePreferido() {
        return piePreferido;
    }

    public void setPiePreferido(char piePreferido) {
        this.piePreferido = piePreferido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String piePreferidoString, tipoString;
        if (piePreferido == 'I') {
            piePreferidoString = "Izquierdo";
        }else{
            piePreferidoString = "Derecho";
        }
        
        switch (tipo) {
            case 'D':
                tipoString = "Delantero";
                break;
            case 'F':
                tipoString = "Defensa";
                break;
            case 'M':
                tipoString = "Medio";
                break;
            case 'P':
                tipoString = "Portero";
                break;
            default:
                tipoString = "No Definido";
                break;
        }
        
        return " | " + nombre + " | " + apellido + " | " + edad + " | " + paisNacimiento + " | " + piePreferidoString + " | " + precio + " | " + tipoString + " | " + equipo + " | ";
    }
    
    
    
    public String toStringCont(){
        String piePreferidoString, tipoString;
        if (piePreferido == 'I') {
            piePreferidoString = "Izquierdo";
        }else{
            piePreferidoString = "Derecho";
        }
        
        switch (tipo) {
            case 'D':
                tipoString = "Delantero";
                break;
            case 'F':
                tipoString = "Defensa";
                break;
            case 'M':
                tipoString = "Medio";
                break;
            case 'P':
                tipoString = "Portero";
                break;
            default:
                tipoString = "No Definido";
                break;
        }
        
        return " | " + nombre + " | " + apellido + " | " + edad + " | " + paisNacimiento + " | " + piePreferidoString + " | " + precio + " | " + tipoString + " | ";
    }
}
