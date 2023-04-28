
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import modelos.ModeloPersona;
import vistas.*;


public class controlador implements ActionListener{
    frmPersonas VistaPersonas;
    frmPrincipal VistaPrincipal;
    ModeloPersona modelPerson;
    
    public DefaultTableModel TablaUsuarios = new DefaultTableModel();
    
    public controlador(frmPrincipal VistaPrincipal, frmPersonas VistaPersonas,ModeloPersona modelPerson){
        this.VistaPrincipal = VistaPrincipal;
        this.VistaPersonas = VistaPersonas;
        this.modelPerson = modelPerson;
        
        
        this.VistaPrincipal.btnPrincipal.addActionListener(this);
        this.VistaPersonas.btnAgregar.addActionListener(this);
        this.VistaPersonas.btnListar.addActionListener(this);
                
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.TablaUsuarios.addColumn("Apellidos");
        this.TablaUsuarios.addColumn("Nombre");
        this.TablaUsuarios.addColumn("Telefono");
        
        this.VistaPersonas.jtUsuarios.setModel(TablaUsuarios);
        
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.VistaPrincipal.btnPrincipal){
           this.VistaPersonas.setLocationRelativeTo(null);
           this.VistaPersonas.setVisible(true);           
       }
        if(e.getSource()==this.VistaPersonas.btnAgregar){
            this.modelPerson.ModeloPersona(this.VistaPersonas.txtApellidos.getText(),
                   this.VistaPersonas.txtNombre.getText(), this.VistaPersonas.txtTelefono.getText());   
           
       }
        if(e.getSource()==this.VistaPersonas.btnListar){
           this.TablaUsuarios.addRow(new Object[]{this.modelPerson.ListaUsuarios.get(0).getApellidos(),
           this.modelPerson.ListaUsuarios.get(0).getNombre(), 
           this.modelPerson.ListaUsuarios.get(0).getTelefono()});
        }
    }
}