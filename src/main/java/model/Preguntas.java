/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author aaron
 */
public class Preguntas {
    private String enunciado;
    private String[] opciones;
    
    //CONSTRUCTOR
    public Preguntas(String enunciado, String[] opciones) {
        this.enunciado = enunciado;
        this.opciones = opciones;
    }
    
    //GETS
    public String getEnunciado() {
        return enunciado;
    }

    public String[] getOpciones() {
        return opciones;
    }
    
    
}
