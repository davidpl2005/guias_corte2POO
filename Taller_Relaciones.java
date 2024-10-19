import java.util.ArrayList;
import java.util.List;
 

// primer ejemplo:

class Coche { 

    private List<Rueda> ruedas;
    
    public Coche() {
       this.ruedas = new ArrayList<>();
    }
    
    public Coche(List<Rueda> ruedas) {
        this.ruedas = ruedas;
    }
    
    public void agregarRueda(Rueda rueda) {
        ruedas.add(rueda);
    }
    
    public Rueda buscarRueda(String marca) {
        return ruedas.stream()
                .filter(rueda-> rueda.getMarca().equals(marca))
                .findFirst()
                .orElse(null);
    }
 
    public boolean eliminarRueda(Rueda rueda) {
        return ruedas.remove(rueda);
    }
    
    public void eliminarTodasLasRuedas() {
        ruedas.clear();

    }
}

class Rueda {

    private String marca;
    
    public Rueda(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
       return marca;
    }
}

// Ejercicio 1:
// 1. CreaunaclaseEquipoquetengaunalistadeJugador. Implementamétodosparaagregar,buscar,eliminaryeliminartodoslos Jugadores.


 class Equipo {

    private List<Jugador> jugadores;
    
    public Equipo(){
        this.jugadores = new ArrayList<>();
    }
    
    public Equipo(List<Jugador> jugadores){
        this.jugadores = jugadores;
    }
    
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public Jugador buscarJugador(String Nombre){
        return jugadores.stream()
                        .filter(jugador -> jugador.getNombre().equals(Nombre))
                        .findFirst()
                        .orElse(null);
    }
        
    public boolean eliminarJugador(Jugador jugador){
        return jugadores.remove(jugador);
    }
    
    public void eliminarTodosLosJugadores(){
        jugadores.clear();
    }
}

class Jugador {

    public String Nombre;
    
    public Jugador(String Nombre){
        this.Nombre=Nombre;
    }
    
    public String getNombre(){
        return Nombre;
    }
}

//segundo ejemplo:

class Computadora {
    private Procesador procesador;
    
    public Computadora(Procesador procesador) {
       if (procesador == null) {
       throw new IllegalArgumentException("Una computadora no puede existir sin un procesador.");
    }
       this.procesador = procesador;
    }
    

    public void cambiarProcesador(Procesador nuevoProcesador) {
        if (nuevoProcesador == null) {
            throw new IllegalArgumentException("El procesador no puede ser nulo.");
        }
        this.procesador = nuevoProcesador;
    }
    
    
    public Procesador obtenerProcesador() {
        return this.procesador;
    }
    
    public void eliminarProcesador() {
        throw new UnsupportedOperationException("No se puede eliminar el procesador. La computadora dejaríade existir.");
    }
}

class Procesador {
    private String modelo;
    
    public Procesador(String modelo) {
       this.modelo = modelo;
    }
    
    public String getModelo() {
        return modelo;
    }
}

// ejercicio 2:
//Crea una clase Casa que se componga de una Puerta. Implementa los métodos para agregar,buscar,y eliminar la Puerta. Asegúrate de que eliminar la Puerta lance una excepción.

class Casa { 
    private Puerta puerta;
    
    public Casa(Puerta puerta){
        if (puerta == null){
            throw new IllegalArgumentException("Una casa no puede estar o existir sin una puerta");
        }
        this.puerta = puerta;
    }
    
    
    public void cambiarPuerta(Puerta nuevaPuerta){
        if (nuevaPuerta == null) {
           throw new IllegalArgumentException("la puerta nu púede ser nula.");
        }
        this.puerta = nuevaPuerta;
    }
    
    
    public Puerta obtenerPuerta(){
        return this.puerta;
    }
    
    
    public void eliminarPuerta(){
        throw new UnsupportedOperationException("No se puede eliminar la puerta o la casa dejaria de existir");
    }
}

class Puerta {
    private String color;
    
    public Puerta(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}

//tercer ejemplo:

class Proyecto {

    private String nombre;
    public Proyecto(String nombre) {
    this.nombre = nombre;
}

    public String getNombre() {
    return nombre;
}
}

class Empleado {

    private String nombre;
    public Empleado(String nombre) {
    this.nombre = nombre;
}

    public String getNombre() {
    return nombre;
    }
}
    
    class Asignacion {
            
        private Empleado empleado;
        private Proyecto proyecto;
            
        public Asignacion(Empleado empleado, Proyecto proyecto) {
        this.empleado = empleado;
        this.proyecto = proyecto;
    }
}

// ejercicio 3:
// 1. Implementa una clase Matrimonio que modele una relación de muchos a muchos entre Persona y Evento. Asegúrate de que
// las clases respeten las relaciones establecidas.

class Matrimonio {
    
    private Persona persona;
    private Evento evento;
   
    public Matrimonio(Persona persona, Evento evento) {
        this.persona = persona;
        this.evento = evento;
    }

    public void mostrarInvitacion() {
        System.out.println(persona.getNombre() + " está invitado(a) al evento " + evento.getNombre());
    }
}

class Persona {
    private String nombre;
   
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}

class Evento {
    
    private String nombre;
    
    public Evento(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}
            
                      