import java.util.ArrayList;
import java.util.List;


//ejemplo 1
class Vehiculo {
    public void mover() {
    System.out.println("El vehículo se está moviendo.");
    }
    }
    // Clase derivada Coche que hereda de Vehiculo
    class Coche extends Vehiculo {
    public void tocarBocina() {
    System.out.println("El coche toca la bocina.");
    }
}

// Ejercicio 1:
//1. Crea una clase Animal y una clase Perro que herede de Animal. Añade métodos relevantes y llama a estos desde la clase Perro

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
} 

class Perro extends Animal {
    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.hacerSonido();  
        miPerro.ladrar();  
    }
}

//ejemplo 2
interface Volador {
    void volar();
    }
    
    class Avion implements Volador {
    @Override
    public void volar() {
    System.out.println("El avión está volando.");
    }
    }
   
// Ejercicio 2: 
//Crea una interfaz Nadador con un método nadar(), y una clase Delfin que implemente Nadador.

interface Nadador {
    void nadar();
}
 
class Delfin implements Nadador {
    @Override
    public void nadar() {
        System.out.println("El delfín está nadando.");
    }

    public static void main(String[] args) {
        Delfin miDelfin = new Delfin();
        miDelfin.nadar();
    }
}

//ejemplo 3

class Motor {
    public void encender() {
    System.out.println("El motor se enciende.");
    }
    }

    class Auto {

    public void arrancar() {
    Motor motor = new Motor(); 
    motor.encender();
    System.out.println("El auto está en marcha.");
    }
 }

// Ejercicio 3:
// Crea una clase Impresora y una clase Documento. Simula que Impresora tiene un método imprimir(Documentodoc)
// que usa Documento.

class Documento {
    private String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}

class Impresora {
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo documento: " + doc.getContenido());
    }

    public static void main(String[] args) {
        Documento miDocumento = new Documento("Este es el contenido del documento.");
        Impresora miImpresora = new Impresora();
        miImpresora.imprimir(miDocumento);
    }
}

//ejemplo 4

class Rueda {
    
public void girar() {
System.out.println("La rueda gira.");
   }
 }
   
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

//Ejercicio 4:
// 1. Crea una clase Aula y una clase Estudiante. Implementa una relación de agregación donde Aula tiene múltiples Estudiantes

class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Aula {
    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre());
        }
    }

    public static void main(String[] args) {
        Aula miAula = new Aula();
        miAula.agregarEstudiante(new Estudiante("Juan"));
        miAula.agregarEstudiante(new Estudiante("Maria"));
        miAula.mostrarEstudiantes();
    }
}

//ejemplo 5

class Habitacion {
    
public void limpiar() {
System.out.println("La habitación se está limpiando.");
    
}
 }

class Casa {
    
private Habitacion habitacion;
public Casa() {
    
this.habitacion = new Habitacion(); // Casa controla la vida de Habitacion
}
    
public void mantener() {
habitacion.limpiar();
    
System.out.println("La casa está siendo mantenida.");
   }
 }

//Ejercicio 5:

//Crea una clase Computadora y una clase Procesador. Simula que Computadora controla la creación y destrucción de Procesador

class Procesador {
    public void procesar() {
        System.out.println("El procesador está procesando.");
    }
}

class Computadora {
    private Procesador procesador;

    public Computadora() {
        this.procesador = new Procesador();
    }

    public void ejecutar() {
        procesador.procesar();
        System.out.println("La computadora está ejecutando.");
    }

    public static void main(String[] args) {
        Computadora miComputadora = new Computadora();
        miComputadora.ejecutar();
    }
}

//ejepmlo 6

class Profesor {
    private String nombre;
    private Curso curso; // Asociación bidireccional
    public Profesor(String nombre) {
    this.nombre = nombre;
    }
    public void setCurso(Curso curso) {
    this.curso = curso;
    }
}   

class Curso {
    private String nombre;
    private Profesor profesor; // Asociación bidireccional
    public Curso(String nombre) {
    this.nombre = nombre;
    }
    public void setProfesor(Profesor profesor) {
    this.profesor = profesor;
    }
    }

// Ejercicio 6:
// 1. Crea una clase Jugador y una clase Equipo. Implementa una asociación bidireccional entre ambas.

class Jugador {
    private String nombre;
    private Equipo equipo;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}

class Equipo {
    private String nombre;
    private Jugador jugador;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public static void main(String[] args) {
        Jugador jugador = new Jugador("Lionel Messi");
        Equipo equipo = new Equipo("Paris Saint-Germain");

        jugador.setEquipo(equipo);
        equipo.setJugador(jugador);

        System.out.println(jugador.getNombre() + " juega en " + jugador.getEquipo().getNombre());
    }
}

//ejemplo 7

class Curso { 
    
    private String nombre;
    
    public Curso(String nombre) { 
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
}

class Estudiante { 
        
    private String nombre;
        
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
        
    public String getNombre() {
        return nombre;
    }
}

class Registro {
            
    private Estudiante estudiante;
    private Curso curso;
            
    public Registro(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public void mostrarRegistro() {   
        System.out.println(estudiante.getNombre() + " está inscrito en " + curso.getNombre());
    }
}


// Ejercicio 7:
// Crea una clase Empleado y una clase Proyecto. Implementa una clase intermedia Asignacion que permita relacionar varios
//empleados a varios proyectos


class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Proyecto {
    private String nombre;

    public Proyecto(String nombre) {
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

    public void mostrarAsignacion() {
        System.out.println(empleado.getNombre() + " está asignado al proyecto " + proyecto.getNombre());
    }

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana");
        Empleado emp2 = new Empleado("Carlos");

        Proyecto proy1 = new Proyecto("Proyecto A");
        Proyecto proy2 = new Proyecto("Proyecto B");

        Asignacion asignacion1 = new Asignacion(emp1, proy1);
        Asignacion asignacion2 = new Asignacion(emp2, proy2);

        asignacion1.mostrarAsignacion();
        asignacion2.mostrarAsignacion();
    }
}

//ejemplo 8

class Empresa {
    
private List<Empleado> empleados = new ArrayList<>();
    
public void contratar(Empleado empleado) {
    
empleados.add(empleado);
}
    
public void mostrarEmpleados() {
    
for (Empleado empleado : empleados) {
System.out.println(empleado.getNombre());
 }
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

//Ejercicio 8:
//Crea una clase Biblioteca que pueda contener múltiples Libros. Implementa los métodos para añadir libros y mostrar la lista de libros.
 
class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}


class Biblioteca {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        miBiblioteca.agregarLibro(new Libro("Don Quijote"));
        miBiblioteca.agregarLibro(new Libro("Cien años de soledad"));

        miBiblioteca.mostrarLibros();
    }
}
