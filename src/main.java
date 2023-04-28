
import controladores.controlador;
import modelos.ModeloPersona;
import vistas.frmPersonas;
import vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmPersonas VistaPersonas = new frmPersonas(VistaPrincipal, true);
        ModeloPersona modelPerson = new ModeloPersona();
        
        controlador controladorGOD = new controlador(VistaPrincipal, VistaPersonas, modelPerson);
    }
    
}
