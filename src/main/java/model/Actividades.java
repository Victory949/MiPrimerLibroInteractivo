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
public class Actividades {
    //Definir variables y arreglos
    private int[] rCorrectas={2,1,3};
    private int[][] historial = new int[3][3];
    private int intentosRealizados=0;
    
    //METODOS
    //VERIFICAR MAX DE INTENTOS
    public boolean intentos()
    {
        if(intentosRealizados<3)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    //FIN INTENTO
    public void finIntento(int[] respuestas)
    {
        for(int i =0; i<3;i++)
        {
            historial[intentosRealizados][i] = respuestas[i];
        }
        
        intentosRealizados++;
        JOptionPane.showMessageDialog(null,calcRespuestasCorrectas(respuestas));
    }
    
    //CALCULO DE PREGUNTAS CORRECTAS
    public int calcRespuestasCorrectas(int[] respuestas)
    {
        int correctas=0;
        for(int i=0;i<rCorrectas.length;i++)
        {
            if(respuestas[i] == rCorrectas[i])
            {
                correctas++;
            }
        }
        return correctas;
    }
    
    //OBTENER INTENTO
    public void obtenerIntento(int numIntento)
    {
        JOptionPane.showMessageDialog(null, historial[numIntento]);
    }
    
    //GET
    public int getIntentosRealizados() {
        return intentosRealizados;
    }
}
