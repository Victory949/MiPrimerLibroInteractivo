/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Elemento;
import model.Pagina;
import view.GUI_VistaInformacion;

/**
 *
 * @author ggame
 */
public class controladorLibro implements ActionListener
{
    private Elemento libro;
    private GUI_VistaInformacion vista;
    private controladorSistema sistema;
    private int posicionActual = 0;

    public controladorLibro(Elemento libro, GUI_VistaInformacion vista, controladorSistema sistema) {
        this.libro = libro;
        this.vista = vista;
        this.sistema = sistema;
        
        vista.addLecturaListener(this);
        irAPagina(0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        switch (e.getActionCommand())
        {
            case "SIGUIENTE":
                irAPagina(posicionActual + 1);
                break;
                
            case "ANTERIOR":
                irAPagina(posicionActual - 1);
                break;
                
            case "MENU":
                vista.dispose();
                sistema.mostrarMenu();
                break;
        }
    }
    
    private void irAPagina(int nuevaPosicion)
    {
        try
        {
            Pagina pagina = libro.mostrarPagina(nuevaPosicion);
            posicionActual = nuevaPosicion;
            vista.mostrarPagina(pagina.getTitulo(), pagina.mostrarContenido());
            
        }
        catch(IndexOutOfBoundsException ex)//atrapa el error
        {
            vista.mostrarMensaje("No hay mas paginas en esa direccion");
        }
    }
    
    
    
}
