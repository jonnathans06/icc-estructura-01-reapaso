package Controllers;

import Models.Persona;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Persona.
 */
public class PersonaController {
    /**
     * Método para ordenar un arreglo de Persona por edad utilizando el algoritmo de
     * inserscion .
     * 
     * @param personas Array de Persona a ordenar.
     */
    public void ordenarPorEdad(Persona[] personas) {
        int n = personas.length;

        for (int i = 1; i < n; i++) {
            Persona aux = personas[i];
            int pos = i;

            while ((pos > 0) && (personas[pos - 1].getEdad() > aux.getEdad())) {
                personas [pos] = personas[pos - 1];
                pos --;
            }
            personas[pos] = aux;
        }
    }

    /**
     * Método para buscar la primera persona con una edad específica en un array de
     * Persona.
     * 
     * @param personas Array de Persona donde buscar.
     * @param edad     Edad a buscar.
     * @return La primera Persona con la edad especificada, o null si no se
     *         encuentra.
     */
    public Persona buscarPorEdad(Persona[] personas, int edad) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) /2;
            int edadCentral = personas[central].getEdad();
            if (edadCentral == edad) { //si es igual
                return personas[central];
            }

            if (personas[central].getEdad() < edad) {
                bajo = central + 1;                
            } else {
                alto = central - 1;
            }
        }
        return null;
    }
}
