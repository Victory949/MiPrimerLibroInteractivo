/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class PaginaActividad extends Pagina{
    
    //Arreglos unidimensionales
    
    

    public PaginaActividad(String titulo, String contenido, int numPagina) {
        super(titulo, contenido, numPagina);
    }
    
    

    @Override
    public void mostrarContenido() {
        JOptionPane.showMessageDialog(null,"---Información página---"
                + "Titulo de la página: "+getTitulo()
                + "Número de página: "+getNumPagina()
                + "Contenido de página: "+getContenido()
                + "-------------------");
    }
    
}
