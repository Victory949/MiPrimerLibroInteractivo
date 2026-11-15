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
    private Preguntas[] preguntas;
    

    public PaginaActividad(String titulo, String contenido, int numPagina) {
        super(titulo, contenido, numPagina);
        this.preguntas=preguntas;
    }
    
    public Preguntas[] getPreguntas()
    {
        return preguntas;
    }

    @Override
    public String mostrarContenido() {
        return getContenido()+" Preguntas: "+preguntas.length;
    }
    
}
