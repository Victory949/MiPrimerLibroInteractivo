/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aaron
 */
public abstract class Pagina {
    
    //Definir variables
    private String titulo,contenido;
    private int numPagina;
    
    //Constructores
    public Pagina() {
    }

    public Pagina(String titulo, String contenido, int numPagina) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.numPagina = numPagina;
    }
    
    //GETS & SETS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
    
    //METODOS
    public abstract void mostrarContenido();
     
}
