package lab3_carlosvelasquez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_CarlosVelasquez {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList();
    static ArrayList<Equipo> equipos = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Laboratorio 3 - Carlos Velásquez");
        
        try{
            do{
                menu();
            }while(true);
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados");
        }
    }
    
    public static void menu(){
        entrada = new Scanner(System.in);
        
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        System.out.println("[1] Equipos");
        System.out.println("[2] Jugadores");
        System.out.println("[3] Salir del Programa");
        System.out.print("\nSeleccione un módulo - ");
        
        int menuSel = entrada.nextInt();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        if (menuSel == 3) {
            System.exit(0);
        }else{
            switch (menuSel) {
                case 1:
                    System.out.println("Menú de Equipos");
                    do{
                        int menuSel2;
                        entrada = new Scanner(System.in);
                        System.out.println("-   -   -   -   -   -   -   -   -   -");
                        System.out.println("[1] Listar Equipos");
                        System.out.println("[2] Crear Nuevo Equipo");
                        System.out.println("[3] Administrar Equipos");
                        System.out.println("[4] Eliminar Equipo");
                        System.out.println("[5] Menú Principal");
                        System.out.print("\n¿Que desea hacer? - ");
                        menuSel2 = entrada.nextInt();
                        System.out.println("-   -   -   -   -   -   -   -   -   -");
                        
                        if (menuSel2 == 5) {
                            System.out.println("Saliendo...");
                            break;
                        }else{
                            switch (menuSel2) {
                                case 1:
                                    listarEquipos();
                                    break;
                                case 2:
                                    crearEquipo();
                                    break;
                                case 3:
                                    administrarEquipo();
                                    break;
                                case 4:
                                    eliminarEquipo();
                                    break;
                                default:
                                    System.out.println("[ERROR] Número de opción inválido.");
                                    break;
                            }
                        }
                    }while(true);
                    break;
                case 2:
                    System.out.println("Menú de Jugadores");
                    do{
                        int menuSel2;
                        entrada = new Scanner(System.in);
                        System.out.println("-   -   -   -   -   -   -   -   -   -");
                        System.out.println("[1] Listar Jugadores");
                        System.out.println("[2] Crear Nuevo Jugador");
                        System.out.println("[3] Modificar Jugador");
                        System.out.println("[4] Eliminar Jugador");
                        System.out.println("[5] Menú Principal");
                        System.out.print("\n¿Que desea hacer? - ");
                        menuSel2 = entrada.nextInt();
                        System.out.println("-   -   -   -   -   -   -   -   -   -");
                        
                        if (menuSel2 == 5) {
                            System.out.println("Saliendo...");
                            break;
                        }else{
                            switch (menuSel2) {
                                case 1:
                                    listarJugadores();
                                    break;
                                case 2:
                                    crearJugador();
                                    break;
                                case 3:
                                    modificarJugador();
                                    break;
                                case 4:
                                    eliminarJugador();
                                    break;
                                default:
                                    System.out.println("[ERROR] Número de opción inválido.");
                                    break;
                            }
                        }
                    }while(true);
                    break;
                default:
                    System.out.println("[ERROR] Número de opción inválido.");
            }
        }
    }
    
    public static void listarEquipos(){
        System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        for (Equipo e : equipos) {
            System.out.println(e);
        }
    }
    
    public static void crearEquipo(){
        Equipo eq = new Equipo();
        
        try{
            
            System.out.println("Creando Nuevo Equipo\nIngresar datos para el nuevo equipo.\n");
            System.out.print("Nombre: ");
            entrada = new Scanner(System.in);
            eq.setNombre(entrada.nextLine());
            entrada = new Scanner(System.in);
            
            System.out.print("Ciudad: ");
            entrada = new Scanner(System.in);
            eq.setCiudad(entrada.nextLine());
            entrada = new Scanner(System.in);
            
            System.out.print("Presupuesto ($): ");
            eq.setPresupuesto(entrada.nextFloat());
            
            System.out.print("Palmares: ");
            eq.setPalmares(entrada.nextInt());
            
            equipos.add(eq);
            System.out.println("\nEquipo creado exitosamente.");
            
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados.");
        }
        
    }
    
    public static void administrarEquipo(){
        boolean sel = true;
        Equipo eq = new Equipo();
        
        try{
            do{
                if (sel == true) {
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println("[" + (i+1) + "] " + equipos.get(i).getNombre());
                    }

                    System.out.print("\n¿Que equipo desea administrar? - ");
                    int eqSel = entrada.nextInt();
                    eqSel--;

                    if (eqSel < 0 || eqSel >= equipos.size()) {
                        System.out.println("[ERROR] El número ingresado no corresponde a ningún equipo.");
                        System.out.println("");
                    }else{
                        eq = equipos.get(eqSel);
                        sel = false;
                        System.out.println("Equipo [" + eq.getNombre() + "] seleccionado.");
                    }
                }else{
                    entrada = new Scanner(System.in);
                    System.out.println("-   -   -   -   -   -   -   -   -   -");
                    System.out.println("[1] Comprar Jugador");
                    System.out.println("[2] Listar Jugadores de Equipo");
                    System.out.println("[3] Organizar Equipo");
                    System.out.println("[4] Ver Formacion");
                    System.out.println("[5] Cambiar de Equipo");
                    System.out.println("[6] Regresar a Menú de Equipos");
                    System.out.print("\n¿Que desea hacer? - ");
                    int menuSel = entrada.nextInt();
                    System.out.println("-   -   -   -   -   -   -   -   -   -");

                    if (menuSel == 6) {
                        System.out.println("Saliendo...");
                        break;
                    }else{
                        switch (menuSel) {
                            case 1:
                                int contAv = 1;
                                ArrayList<Jugador> jugDisp = new ArrayList();

                                System.out.println("Jugadores Disponibles\n"
                                        + " | No. | Nombre | Apellido | Edad | País de Nacimiento | Pie Preferido | Precio | Rol | \n");
                                for (Jugador j : jugadores) {
                                    if(j.estado == false){
                                        System.out.println(" | " + contAv + j.toStringCont());
                                        jugDisp.add(j);
                                        contAv++;
                                    }
                                }

                                System.out.print("\n¿Que jugador desea contratar? (0 para abortar) - ");
                                int jugSel = entrada.nextInt();
                                System.out.println("");

                                if(jugSel == 0){
                                    System.out.println("Saliendo...");
                                    break;
                                }else{
                                    jugSel--;
                                    contAv--;
                                    if (jugSel < 0 || (jugSel != 0 && jugSel >= jugDisp.size())) {
                                        System.out.println("[ERROR] El número ingresado supera la lista.");
                                    }else{
                                        System.out.println("Ha seleccionado a " + jugDisp.get(jugSel).getNombre());
                                        System.out.println("Precio: " + jugDisp.get(jugSel).getPrecio());
                                        System.out.println("Presupuesto del Equipo: " + eq.getPresupuesto());
                                        System.out.println("");

                                        if (jugDisp.get(jugSel).getPrecio() > eq.getPresupuesto()) {
                                            System.out.println("[ERROR] Su equipo no tiene suficientes fondos para contratar a ese jugador.");
                                        }else{
                                            int numJug = -1;
                                            boolean cont;
                                            
                                            do{
                                                cont = true;
                                                System.out.print("Ingrese el número que el jugador portará en el equipo: ");
                                                numJug = entrada.nextInt();
                                                
                                                if (numJug <= 0) {
                                                    System.out.println("[ERROR] El número del jugador debe ser mayor a 0\n");
                                                    cont = false;
                                                }else{
                                                    for (Jugador jug : eq.getJugadores()) {
                                                        if (numJug == jug.getNumero()) {
                                                            System.out.println("[ERROR] Ese número ya le corresponde a un jugador en el equipo.");
                                                            cont = false;
                                                        }
                                                    }
                                                }
                                                
                                            }while(cont == false);

                                            eq.setPresupuesto(eq.getPresupuesto() - jugDisp.get(jugSel).getPrecio());
                                            jugDisp.get(jugSel).estado = true;
                                            jugDisp.get(jugSel).setEquipo(eq.getNombre());
                                            jugDisp.get(jugSel).setNumero(numJug);
                                            eq.getJugadores().add(jugDisp.get(jugSel));

                                            System.out.println("Jugador contratado exitosamente.");
                                        }

                                    }
                                }

                                break;
                            case 2:
                                System.out.println(" | Nombre | Apellido | Edad | País de Nacimiento | Pie Preferido | Precio | Rol | Equipo | \n");
            
                                for (Jugador j: eq.getJugadores()) {
                                    System.out.println(j);
                                }
                                break;
                            case 3:
                                int numDef, numDel, numMed;
                                if (eq.getJugadores().size() <= 0) {
                                    System.out.println("[ERROR] No hay jugadores en el equipo");
                                }else if(eq.hayPortero() == false){
                                    System.out.println("[ERROR] El equipo no tiene portero");
                                }else{
                                    int contDel = 0, contMed = 0, contDef = 0;
                                    for (Jugador j : eq.getJugadores()) {
                                            if (j instanceof Delantero) {
                                                contDel++;
                                            }else if(j instanceof Medio){
                                                contMed++;
                                            }else if(j instanceof Defensa){
                                                contDef++;
                                            }
                                    }
                                    System.out.println("Organizando Equipo");
                                    System.out.println("Elegir el numero de jugadores para cada línea\n");
                                    System.out.print("Delanteros (tiene " + contDel + "): ");
                                    numDel = entrada.nextInt();
                                    if (numDel < 0 || numDel > contDel) {
                                        System.out.println("[ERROR] No tiene ese número de delanteros");
                                        break;
                                    }

                                    System.out.print("Medios (tiene " + contMed + "): ");
                                    numMed = entrada.nextInt();
                                    if (numMed < 0 || numMed > contMed) {
                                        System.out.println("[ERROR] No tiene ese número de medios");
                                        break;
                                    }

                                    System.out.print("Defensas (tiene " + contDef + "): ");
                                    numDef = entrada.nextInt();
                                    if (numDef < 0 || numDef > contDef) {
                                        System.out.println("[ERROR] No tiene ese número de defensas");
                                        break;
                                    }
                                    
                                    if (numDef + numMed + numDel + 1 > 11) {
                                        System.out.println("[ERROR] La formación no puede tener mas de 11 jugadores.");
                                    }else{
                                        ArrayList<Jugador> jugs = new ArrayList();
                                        for (Jugador j : eq.getJugadores()) {
                                            if (j instanceof Delantero) {
                                                jugs.add(j);
                                            }
                                        }
                                        System.out.println("");
                                        
                                        for (int i = 0; i < numDel; i++) {
                                            System.out.println("Seleccionar Delantero [" + (i+1) + "]");
                                            for (int j = 0; j < jugs.size(); j++) {
                                                System.out.println(" | " + (j+1) + jugs.get(j));
                                            }
                                            
                                            System.out.print("\nSeleccione un Jugador - ");
                                            jugSel = entrada.nextInt();
                                            jugSel--;
                                            
                                            if (jugSel < 0 || jugSel >= jugs.size()) {
                                                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
                                                i--;
                                            }else{
                                                eq.getFormacion().add(jugs.get(jugSel));
                                                jugs.get(jugSel).setTitular(false);
                                                jugs.remove(jugSel);
                                            }
                                        }
                                        
                                        System.out.println("");
                                        
                                        jugs = new ArrayList();
                                        for (Jugador j : eq.getJugadores()) {
                                            if (j instanceof Medio) {
                                                jugs.add(j);
                                            }
                                        }
                                        
                                        for (int i = 0; i < numMed; i++) {
                                            System.out.println("Seleccionar Medio[" + (i+1) + "]");
                                            for (int j = 0; j < jugs.size(); j++) {
                                                System.out.println(" | " + (j+1) + jugs.get(j));
                                            }
                                            
                                            System.out.print("\nSeleccione un Jugador - ");
                                            jugSel = entrada.nextInt();
                                            jugSel--;
                                            
                                            if (jugSel < 0 || jugSel >= jugs.size()) {
                                                i--;
                                                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
                                            }else{
                                                eq.getFormacion().add(jugs.get(jugSel));
                                                jugs.get(jugSel).setTitular(false);
                                                jugs.remove(jugSel);
                                            }
                                        }
                                        System.out.println("");
                                        
                                        jugs = new ArrayList();
                                        for (Jugador j : eq.getJugadores()) {
                                            if (j instanceof Defensa) {
                                                jugs.add(j);
                                            }
                                        }
                                        
                                        for (int i = 0; i < numDef; i++) {
                                            System.out.println("Seleccionar Defensas [" + (i+1) + "]");
                                            for (int j = 0; j < jugs.size(); j++) {
                                                System.out.println(" | " + (j+1) + jugs.get(j));
                                            }
                                            
                                            System.out.print("\nSeleccione un Jugador - ");
                                            jugSel = entrada.nextInt();
                                            jugSel--;
                                            
                                            if (jugSel < 0 || jugSel >= jugs.size()) {
                                                i--;
                                                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
                                            }else{
                                                eq.getFormacion().add(jugs.get(jugSel));
                                                jugs.get(jugSel).setTitular(false);
                                                jugs.remove(jugSel);
                                            }
                                        }
                                        
                                        jugs = new ArrayList();
                                        for (Jugador j : eq.getJugadores()) {
                                            if (j instanceof Portero) {
                                                jugs.add(j);
                                            }
                                        }
                                        
                                        boolean rep;
                                        do{
                                            rep = false;
                                            System.out.println("Seleccionar Portero");
                                            for (int j = 0; j < jugs.size(); j++) {
                                                System.out.println(" | " + (j+1) + jugs.get(j));
                                            }
                                            
                                            System.out.print("\nSeleccione un Jugador - ");
                                            jugSel = entrada.nextInt();
                                            jugSel--;
                                            
                                            if (jugSel < 0 || jugSel >= jugs.size()) {
                                                rep = true;
                                                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
                                            }else{
                                                eq.getFormacion().add(jugs.get(jugSel));
                                                jugs.get(jugSel).setTitular(false);
                                                jugs.remove(jugSel);
                                            }
                                        }while(rep == true);
                                        System.out.println("\nEquipo organizado exitosamente");
                                    }
                                }

                                
                                break;
                            case 4:
                                System.out.println("Delanteros");
                                System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        
                                for (Jugador j : eq.getFormacion()) {
                                    if (j instanceof Delantero) {
                                        System.out.println(j);
                                    }
                                }
                                System.out.println("");
                                
                                System.out.println("Medios");
                                System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        
                                for (Jugador j : eq.getFormacion()) {
                                    if (j instanceof Medio) {
                                        System.out.println(j);
                                    }
                                }
                                System.out.println("");
                                
                                System.out.println("Defensas");
                                System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        
                                for (Jugador j : eq.getFormacion()) {
                                    if (j instanceof Defensa) {
                                        System.out.println(j);
                                    }
                                }
                                System.out.println("");
                                
                                System.out.println("Portero");
                                System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        
                                for (Jugador j : eq.getFormacion()) {
                                    if (j instanceof Portero) {
                                        System.out.println(j);
                                    }
                                }
                                System.out.println("");
                                System.out.println("Suplentes");
                                System.out.println(" | Nombre | Ciudad | Presupuesto | Palmares | \n");
        
                                for (Jugador j : eq.getFormacion()) {
                                    boolean imprimir = false;
                                    for (Jugador j2 : eq.getJugadores()) {
                                        if (j2.toString().equals(j.toString())) {
                                            imprimir = false;
                                        }
                                    }
                                    if (imprimir == true) {
                                        System.out.println(j);
                                    }
                                }
                                System.out.println("");
                                break;
                            case 5:
                                sel = true;
                                break;
                            default:
                                System.out.println("[ERROR] Número de opción inválido.");
                        }
                    }
                }
            }while(true);
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados");
        }
    }
    
    public static void eliminarEquipo(){
        try{
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println("[" + (i+1) + "] " + equipos.get(i).getNombre());
            }

            System.out.print("\n¿Que equipo desea administrar? - ");
            int eqSel = entrada.nextInt();
            eqSel--;
            System.out.println("");

            if (eqSel < 0 || eqSel >= equipos.size()) {
                System.out.println("[ERROR] El número ingresado no corresponde a ningún equipo.");
            }else{
                System.out.println("Seguro que desea eliminar al equipo [" + equipos.get(eqSel).getNombre() + "]?");
                System.out.print("Escriba [S/N]: ");

                char respElim = entrada.next().charAt(0);

                if (respElim == 's' || respElim == 'S') {
                    equipos.remove(eqSel);
                    System.out.println("Equipo removido exitosamente.");
                }else{
                    System.out.println("Operación Abortada");
                }
            }
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados");
        }
        
    }
    
    public static void listarJugadores(){
        try{
            System.out.println(" | Nombre | Apellido | Edad | País de Nacimiento | Pie Preferido | Precio | Rol | Equipo | \n");
            
            for (Jugador j : jugadores) {
                System.out.println(j);
            }
            
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados");
        }
    }
    
    public static void crearJugador(){
        String nombre, apellido, paisNacimiento;
        char piePreferido;
        int edad;
        float precio;
        
        try{
            System.out.println("Creando Jugador Nuevo");
            System.out.println("Ingresar datos para el nuevo jugador\n");

            System.out.print("Nombre: ");
            entrada = new Scanner(System.in);
            nombre = entrada.nextLine();
            entrada = new Scanner(System.in);
            
            System.out.print("Apellido: ");
            entrada = new Scanner(System.in);
            apellido = entrada.nextLine();
            entrada = new Scanner(System.in);
            
            System.out.print("Edad: ");
            edad = entrada.nextInt();
            
            System.out.print("País de Nacimiento: ");
            entrada = new Scanner(System.in);
            paisNacimiento = entrada.nextLine();
            entrada = new Scanner(System.in);
            
            do{
                System.out.print("Pie Preferido (I/D): ");
                piePreferido = entrada.next().charAt(0);
                
                if (piePreferido != 'I' && piePreferido != 'D') {
                    System.out.println("[ERROR] Debe ingresar I o D");
                }else{
                    break;
                }
            }while(true);
            
            System.out.print("Precio ($): ");
            precio = entrada.nextFloat();
            boolean rep;
            
            do {
                rep = false;
                System.out.println("");
                System.out.println("[1] Delantero");
                System.out.println("[2] Defensa");
                System.out.println("[3] Medio");
                System.out.println("[4] Portero");
                System.out.print("\nSeleccionar Rol - ");
                int rolSel = entrada.nextInt();
                System.out.println("");

                switch (rolSel) {
                    case 1:
                        System.out.print("Nivel de Definición: ");
                        float nivDef = entrada.nextFloat();
                        
                        System.out.print("Altura: ");
                        float altura = entrada.nextFloat();
                        
                        System.out.print("Velocidad (m/s): ");
                        float velocidad = entrada.nextFloat();
                        
                        System.out.print("Promedio de Goles: ");
                        float promGoles = entrada.nextFloat();
                        
                        Delantero d = new Delantero(nivDef, altura, velocidad, promGoles, nombre, apellido, paisNacimiento, piePreferido, edad, precio);
                        d.setTipo('D');
                        jugadores.add(d);
                        System.out.println("Jugador creado exitosamente.");
                        break;
                    case 2:
                        System.out.print("Nivel de Agresividad: ");
                        float nivAgres = entrada.nextFloat();
                        
                        System.out.print("Altura: ");
                        float alt = entrada.nextFloat();
                        
                        System.out.print("Peso: ");
                        float peso = entrada.nextFloat();
                        
                        System.out.print("Velocidad (m/s): ");
                        float vel = entrada.nextFloat();
                        
                        Defensa f = new Defensa(nivAgres, alt, peso, vel, nombre, apellido, paisNacimiento, piePreferido, edad, precio);
                        f.setTipo('F');
                        jugadores.add(f);
                        System.out.println("Jugador creado exitosamente.");
                        break;
                    case 3:
                        System.out.print("Nivel de Creatividad: ");
                        float nivCreat = entrada.nextFloat();
                        
                        System.out.print("Nivel de Dominio: ");
                        float nivDom = entrada.nextFloat();
                        
                        System.out.print("Promedio de Asistencias: ");
                        float promAsist = entrada.nextFloat();
                        
                        Medio m = new Medio(nivCreat, nivDom, promAsist, nombre, apellido, paisNacimiento, piePreferido, edad, precio);
                        m.setTipo('M');
                        jugadores.add(m);
                        System.out.println("Jugador creado exitosamente.");
                        break;
                    case 4:
                        System.out.print("Nivel de Juego Aéreo: ");
                        float nivJugAr = entrada.nextFloat();
                        
                        System.out.print("Nivel de Juego con los Pies: ");
                        float nivPies = entrada.nextFloat();
                        
                        Portero p = new Portero(nivJugAr, nivPies, nombre, apellido, paisNacimiento, piePreferido, edad, precio);
                        p.setTipo('P');
                        jugadores.add(p);
                        System.out.println("Jugador creado exitosamente.");
                        break;
                    default:
                        System.out.println("[ERROR] Número de opción inválido");
                        rep = true;
                }
            } while (rep == true);
            
            
            
            
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados.");
        }
    }
    
    public static void modificarJugador(){
        String nombre, apellido, paisNacimiento;
        char piePreferido;
        int edad;
        float precio;
        
        try{
            int cont = 1;
            System.out.println(" | No | Nombre | Apellido | Edad | País de Nacimiento | Pie Preferido | Precio | Rol | \n");
            
            for (Jugador j : jugadores) {
                System.out.println(" | " + cont + j);
                cont++;
            }
            System.out.print("\n¿Que jugador desea modificar? - ");
            int modSel = entrada.nextInt();
            modSel--;
            
            if (modSel < 0 || modSel >= jugadores.size()) {
                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
            }else{
                System.out.println("Modificando al jugador [" + jugadores.get(modSel).getNombre() + "]");
                System.out.println("Ingresar datos actualizados\n");

                System.out.print("Nombre: ");
                entrada = new Scanner(System.in);
                nombre = entrada.nextLine();
                entrada = new Scanner(System.in);

                System.out.print("Apellido: ");
                entrada = new Scanner(System.in);
                apellido = entrada.nextLine();
                entrada = new Scanner(System.in);

                System.out.print("Edad: ");
                edad = entrada.nextInt();

                System.out.print("País de Nacimiento: ");
                entrada = new Scanner(System.in);
                paisNacimiento = entrada.nextLine();
                entrada = new Scanner(System.in);

                do{
                    System.out.print("Pie Preferido (I/D): ");
                    piePreferido = entrada.next().charAt(0);

                    if (piePreferido != 'I' && piePreferido != 'D') {
                        System.out.println("[ERROR] Debe ingresar I o D");
                    }else{
                        break;
                    }
                }while(true);

                System.out.print("Precio ($): ");
                precio = entrada.nextFloat();
                boolean rep;

                do {
                    rep = false;
                    System.out.println("");
                    System.out.println("[1] Delantero");
                    System.out.println("[2] Defensa");
                    System.out.println("[3] Medio");
                    System.out.println("[4] Portero");
                    System.out.print("\nSeleccionar Rol - ");
                    int rolSel = entrada.nextInt();
                    System.out.println("");

                    switch (rolSel) {
                        case 1:
                            System.out.print("Nivel de Definición: ");
                            float nivDef = entrada.nextFloat();

                            System.out.print("Altura: ");
                            float altura = entrada.nextFloat();

                            System.out.print("Velocidad (m/s): ");
                            float velocidad = entrada.nextFloat();

                            System.out.print("Promedio de Goles: ");
                            float promGoles = entrada.nextFloat();

                            Delantero d = (Delantero) jugadores.get(modSel);
                            d.setNombre(nombre);
                            d.setApellido(apellido);
                            d.setEdad(edad);
                            d.setPaisNacimiento(paisNacimiento);
                            d.setPiePreferido(piePreferido);
                            d.setPrecio(precio);
                            
                            d.setNivelDefinicion(nivDef);
                            d.setAltura(altura);
                            d.setVelocidad(velocidad);
                            d.setPromedioGoles(promGoles);
                            d.setTipo('D');
                            jugadores.set(modSel, d);
                            System.out.println("Jugador modificado exitosamente.");
                            break;
                        case 2:
                            System.out.print("Nivel de Agresividad: ");
                            float nivAgres = entrada.nextFloat();

                            System.out.print("Altura: ");
                            float alt = entrada.nextFloat();

                            System.out.print("Peso: ");
                            float peso = entrada.nextFloat();

                            System.out.print("Velocidad (m/s): ");
                            float vel = entrada.nextFloat();

                            Defensa f = (Defensa) jugadores.get(modSel);
                            f.setNombre(nombre);
                            f.setApellido(apellido);
                            f.setEdad(edad);
                            f.setPaisNacimiento(paisNacimiento);
                            f.setPiePreferido(piePreferido);
                            f.setPrecio(precio);
                            
                            f.setNivelAgresividad(nivAgres);
                            f.setAltura(alt);
                            f.setPeso(peso);
                            f.setVelocidad(vel);
                            f.setTipo('F');
                            jugadores.set(modSel, f);
                            System.out.println("Jugador modificado exitosamente.");
                            break;
                        case 3:
                            System.out.print("Nivel de Creatividad: ");
                            float nivCreat = entrada.nextFloat();

                            System.out.print("Nivel de Dominio: ");
                            float nivDom = entrada.nextFloat();

                            System.out.print("Promedio de Asistencias: ");
                            float promAsist = entrada.nextFloat();

                            Medio m = (Medio) jugadores.get(modSel);
                            m.setNombre(nombre);
                            m.setApellido(apellido);
                            m.setEdad(edad);
                            m.setPaisNacimiento(paisNacimiento);
                            m.setPiePreferido(piePreferido);
                            m.setPrecio(precio);
                            
                            m.setNivelCreatividad(nivCreat);
                            m.setNivelDominio(nivDom);
                            m.setPromedioAsistencias(promAsist);
                            m.setTipo('M');
                            jugadores.set(modSel, m);
                            System.out.println("Jugador modificado exitosamente.");
                            break;
                        case 4:
                            System.out.print("Nivel de Juego Aéreo: ");
                            float nivJugAr = entrada.nextFloat();

                            System.out.print("Nivel de Juego con los Pies: ");
                            float nivPies = entrada.nextFloat();

                            Portero p = (Portero) jugadores.get(modSel);
                            p.setNombre(nombre);
                            p.setApellido(apellido);
                            p.setEdad(edad);
                            p.setPaisNacimiento(paisNacimiento);
                            p.setPiePreferido(piePreferido);
                            p.setPrecio(precio);
                            
                            p.setNivelJuegoAereo(nivJugAr);
                            p.setNivelJuegoPies(nivPies);
                            p.setTipo('P');
                            jugadores.set(modSel, p);
                            System.out.println("Jugador modificado exitosamente.");
                            break;
                        default:
                            System.out.println("[ERROR] Número de opción inválido");
                            rep = true;
                            break;
                    }
                } while (rep == true);
            }
            
            
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados.");
        }
    }
    
    public static void eliminarJugador(){
        try{
            int cont = 1;
            System.out.println(" | No | Nombre | Apellido | Edad | País de Nacimiento | Pie Preferido | Precio | Rol | \n");
            
            for (Jugador j : jugadores) {
                System.out.println(" | " + cont + j);
                cont++;
            }
            System.out.print("\n¿Que jugador desea eliminar? - ");
            int modSel = entrada.nextInt();
            modSel--;
            
            if (modSel < 0 || modSel >= jugadores.size()) {
                System.out.println("[ERROR] El número ingresado supera el tamaño de la lista");
            }else{
                System.out.println("Seguro que desea eliminar al jugador [" + jugadores.get(modSel).getNombre() + "]?");
                System.out.print("Escriba [S/N]: ");
                char respElim = entrada.next().charAt(0);
                
                if (respElim == 's' || respElim == 'S') {
                    equipos.remove(modSel);
                    System.out.println("Equipo removido exitosamente.");
                }else{
                    System.out.println("Operación Abortada");
                }
                
            }
        }catch(Exception ex){
            System.out.println("[ERROR] Datos inválidos ingresados.");
        }
    }
    
}
