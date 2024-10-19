import java.util.ArrayList;
import java.util.List;

//primer ejemplo
class Vehiculo{   
    public void mover(){
        System.out.println("El vehiculo se esta moviendo");
    }
}
class Coche extends Vehiculo{
    public void tocarBocina(){
        System.out.println("El coche toca la bocina");
    }
}

//segundo ejemplo
class Animal{

    public void mirarFeo(){
System.out.println("Te mira maluco");
    }
    public void miar(){
System.out.println("Se orina dentro de la casa");
    }
}
class Perro extends Animal{
@Override
public void miar() {
    super.miar();
}
@Override
public void mirarFeo() {
    super.mirarFeo();
}
}

//tercer ejemplo
interface Volador {
    void volar();
    }
    class Avion implements Volador {
    @Override
    public void volar() {
    System.out.println("El avión está volando.");
    
    }
}

//cuarto ejemplo
interface Nadador{
    void nadar();
   class Delfin implements Nadador{
    @Override
    public void nadar() {
        System.out.println("El delfin esta nadando");
    }
   }
    
}

//quinto ejemplo
class Motor {
    public void encender() {
    System.out.println("El motor se enciende.");
    }
}   
    class Auto {
    public void arrancar() {
    Motor motor = new Motor(); 
    motor. encender();
    System.out.println("El auto esta en marcha.");
    }
}

//sexto ejemplo
class Impresora{
    public void imprimir(){
        System.out.println("En espera de archivos");
    }
}
class Documento{
   public void imprimiendo(){
    Impresora impresora=new Impresora();
    impresora.imprimir();
    System.out.println("Imprimiendo archivos");
   } 
}

//septimo ejemplo
class Rueda {
    public void girar() {
    System.out.println("La rueda gira.");
    
    }
}   
    // Clase Bicicleta que tiene una o más Ruedas
    class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera) {
    this.ruedaDelantera = ruedaDelantera;
    this.ruedaTrasera = ruedaTrasera;
    }
    public void mover() {
    ruedaDelantera.girar();
    ruedaTrasera.girar();
    System.out.println("La bicicleta se mueve.");
    }
}

//octavo ejemplo
class Aula{
public void agregar(){
    System.out.println("Agregar estudiantes");
}
}
class Estudiante{
private Aula estudiante1;
private Aula estudiante2;

public Estudiante(Aula estudiante1, Aula Estudiante2){
    this.estudiante1=estudiante1;
    this.estudiante2=estudiante2;
}
public void agg(){
estudiante1.agregar();
estudiante2.agregar();
System.out.println("Estudiantes agregados");
}
}

//noveno ejemplo
class Habitacion {
    public void limpiar() {
    System.out.println("La habitación se está limpiando.");
    
    }
}
    class Casa {
    private Habitacion habitacion;
    
    public Casa() {
    this.habitacion = new Habitacion(); 
    }  
    public void mantener() {
    habitacion.limpiar();
    System.out.println("La casa está siendo mantenida.");
    
    }
    
    }

//decimo ejemplo
class Computadora{
public void crear(){
    System.out.println("Creando Procesador");
}
public void eliminar(){
    System.out.println("Eliminando Procesador");
}
}
class Procesador{
private Computadora computadora;
public Procesador(){
    this.computadora= new Computadora();
}
public void creado(){
    computadora.crear();
    System.out.println("Se ha creado el Procesador");
}
public void Eliminado(){
    System.out.println("Se ha eliminado el Procesador");
}
}

//decimo primer ejemplo
class Profesor {
    private String nombre;
    private Curso curso; 
    
    public Profesor(String nombre) {
    this.nombre = nombre;
    }
    public void setCurso(Curso curso) {
    this.curso = curso;
   
    }
}
class Curso {
    private String nombre;
    private Profesor profesor; 
    
    public Curso(String nombre) {
    this.nombre = nombre;
    }  
    public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
    }
    }

//decimo segundo ejemplo    
class Jugador{
private String Nombre;
private Equipo numero;
public Jugador(String nombre){
    this.Nombre=nombre;

}
public void setNumero(Equipo numero){
    this.numero=numero;
}
}
class Equipo{
private String nombre;
private Jugador jugador;
public Equipo(String nombre){
    this.nombre=nombre;
}
public void setJugador(Jugador jugador){
    this.jugador=jugador;
}
}


//decimo tercer ejemplo
class Curso1 {
    private String nombre;
    
    public Curso1(String nombre) {
    this.nombre = nombre;
    }
    public String getNombre() {
    return nombre;
    }
}
    class Estudiante1 {
    private String nombre;
    
    public Estudiante1(String nombre) {
    this. nombre = nombre;
    
    }
  
    public String getNombre() {
    return nombre;
    
    }
} 

    class Registro {
    private Estudiante1 estudiante1;
    private Curso1 curso1;
    public Registro(Estudiante estudiante, Curso curso) {
        this.estudiante1 = estudiante1;
        this.curso1 = curso1;
        
     }
      public void mostrarRegistro() {
        System.out.println(estudiante1. getNombre() + " esta inscrito en " + curso1.getNombre());
        
        }
    }


    //decimo cuarto ejemplo
    class Empleado{
        private String nombre;
        public Empleado(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
        return nombre;
        }

    }
    class Proyecto{
    private String nombre;
    public Proyecto(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    }
    class Asignacion{
    private Empleado empleado;
    private Proyecto proyecto;
    public Asignacion(Empleado empleado,Proyecto proyecto){
        this.empleado=empleado;
        this.proyecto=proyecto;
    }
    public void mostrarAsignacion(){
        System.out.println(empleado.getNombre()+ " esta asignado en "+ proyecto.getNombre());
    }
    }
   

    //decimo quinto ejemplo
    class Empresa {
        private List<Empleado2> empleados = new ArrayList<>();
        
        public void contratar(Empleado2 empleado) {
        empleados.add(empleado);
        } 
        public void mostrarEmpleados() {
        for (Empleado2 empleado : empleados) {
        System.out.println(empleado.getNombre());
        }
    }
}
        class Empleado2 {
        private String nombre;
        
        public Empleado2(String nombre) {
        this.nombre = nombre;
        
        }
        
        public String getNombre() {
        return nombre;
        }
    }


    //decimo sexto ejemplo
    class Biblioteca{
        private List<Libro> libros= new ArrayList<>();
        public void agregarLibros(Libro libro){
            libros.add(libro);
        }
        public void mostrarLibros(){
            for(Libro libro: libros){
            System.out.println(libro.getNombre());
            }
        }
    }
    class Libro{
        private String nombre;
        public Libro(String nombre){
            this.nombre=nombre;
        }
        public String getNombre(){
            return nombre;
        }
    }
