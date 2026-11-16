/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Elemento {
    //creación ArrayList
    private ArrayList<Pagina> paginas =new ArrayList<>();
    
    //METODOS
    //AGREGAR
    public void agregarPag(Pagina p)
    {
        paginas.add(p);
    }
    
    
    //quite el JOption y el void de los metodos ya que tiraban error
    //MOSTRAR PAGINA
    public Pagina mostrarPagina(int posicion)
    {
        return paginas.get(posicion);
    }
    
    //CANTITDAD PAGINAS
    public int mostrarCantidad()
    {
        return paginas.size();
    }
    
    //ADMINISTRAR PAGINAS
    public String recorrerPaginas()
    {
        String indice = "";
        for (Pagina p : paginas)
        {
            indice= indice+" - "+p.getTitulo()+"\n";
        }
        return indice;
    }

}
