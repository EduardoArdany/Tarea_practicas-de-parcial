
package modelos;

import java.util.ArrayList;


public class ModeloPersona {
    public ArrayList<ClasePersona> ListaUsuarios = new ArrayList<ClasePersona>();
    
    public void ModeloPersona(String apellidos, String nombre, String telefono){
        ClasePersona nuevaPersona = new ClasePersona(apellidos, nombre, telefono);
        this.ListaUsuarios.add(nuevaPersona);
    }
    public ArrayList ListarPersonas(){
    return ListaUsuarios;
}
}
