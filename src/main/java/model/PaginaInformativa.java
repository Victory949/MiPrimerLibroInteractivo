/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aaron
 */
public class PaginaInformativa extends Pagina{
    
    private String ejemplo;

    public PaginaInformativa(String titulo, String contenido, int numPagina, String ejemplo) {
        super(titulo, contenido, numPagina);
        this.ejemplo = ejemplo;
    }
    
    
    @Override
    public String mostrarContenido() {
        return getContenido()+ "\n(Página "+getNumPagina()+")";
        
    }
    
    @Override
    public String getEjemplo()
    {
        return ejemplo;
    }
    
    
  
}
