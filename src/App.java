
import Models.Persona;
import Controllers.PersonaController;
import Views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
    };

        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD
        
        PersonaController pC = new PersonaController();
        ViewConsole vC = new ViewConsole();
        
        System.out.println("== Arreglo de personas ==");
        vC.printPersonasArrya(personas);
        System.out.println();
        System.out.println("== Arreglo ordenado por edad ==");
        pC.ordenarPorEdad(personas);
        vC.printPersonasArrya(personas);
        System.out.println();
        System.out.println("-".repeat(30));
        System.out.println("== Personas a buscar ==");
        //pC.buscarPorEdad(personas, 40);
        Persona indexPersona = pC.buscarPorEdad(personas, 40);
        Persona indexPersona2 = pC.buscarPorEdad(personas, 99);

        if (indexPersona == null) {
            System.out.println("No se encontro ninguna persona con esa edad");
        } else {
            System.out.println("Persona con edad 40: " + indexPersona);
        }
        
        if (indexPersona2 == null) {
            System.out.println("No se encontro ninguna persona con esa edad");
        } else {
            System.out.println("Persona con edad 99: " + indexPersona2);
        }
    }
}
