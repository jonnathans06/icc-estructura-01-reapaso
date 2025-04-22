package Views;

import Models.Persona;

public class ViewConsole {
    
    public void printPersonasArrya(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            System.out.print(personas[i] + " || ");
        }
    }
    public void printMensaje(String mensaje) {
        
    }
}
