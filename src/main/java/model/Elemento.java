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
    
    //MOSTRAR PAGINA
    public void mostrarPagina(int posicion)
    {
        JOptionPane.showMessageDialog(null, paginas.get(posicion));
    }
    
    //CANTITDAD PAGINAS
    public void mostrarCantidad()
    {
        JOptionPane.showMessageDialog(null,paginas.size());
    }
    
    //ADMINISTRAR PAGINAS
    public void recorrerPaginas()
    {
        String indice = "";
        for (Pagina p : paginas)
        {
            indice= indice+" - "+p.getTitulo()+"\n";
        }
        JOptionPane.showMessageDialog(null,indice);
    }

}
