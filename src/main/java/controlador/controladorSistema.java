/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Elemento;
import model.PaginaActividad;
import model.PaginaInformativa;
import model.Preguntas;
import view.GUI_VistaInformacion;
import view.GUI_VistaMenu;

/**
 *
 * @author ggame
 */
public class controladorSistema implements ActionListener
{
   private GUI_VistaMenu  vistaMenu = new GUI_VistaMenu();
   
   public controladorSistema()
   {
       vistaMenu.addMenuListener(this);
   }
   
   public void inicio()
   {
       vistaMenu.setLocationRelativeTo(null);
       vistaMenu.setVisible(true);
   }
   
   @Override
   public void actionPerformed(ActionEvent e)
   {
       switch (e.getActionCommand())
       {
           case "INICIAR":
               abrirVentanaLectura();
               vistaMenu.dispose();
               break;
               
           case "SALIR":
               vistaMenu.dispose();
               break;
       }
   }
   
   public void abrirVentanaLectura()
   {
       //aqui es donde se tiene que crear el libro, la vista de la lectura y su controlador
       
       vistaMenu.setVisible(false);
       Elemento libro = new Elemento();
       //
       libro.agregarPag(new PaginaInformativa("Estructura if",
       "La estructura if ejecuta un bloque solo cuando una condicion es verdadera"
       + "Java evalua la condicion entre parentesis y, si es true,\n ejecuta las instrucciones dentro de las llave", 1,
       "int edad = 20;\n"
       +"if (edad >= 18)\n"
       +"{\n"
       +"   System.out.println(\"Es mayor de edad\");\n"
       +"}"));
       
       
       libro.agregarPag(new PaginaInformativa("Estructura if-else",
       "La estructura if-else ofrece dos caminos: uno si la condicion es verdadera(if) y otro si es falsa(else)", 2,
       "int edad = 15;\n"
       +"if (edad >=18)\n"
       +"{\n"
       +"   System.out.println(\"Es mayor de edad\");\n"
       +"}\n"
       +"else\n"
       +"{\n"
       +"   System.out.println(\"Es menor de edad\");\n"
       +"}"
       +"\n"
       +"\n"));
       
       
       libro.agregarPag(new PaginaInformativa("Estructura switch",
       "La estructura switch compara una variable contra varios casos y ejecuta el que coindice"
               + "\npara evitar respuestas que no aparecen, se usa el default", 3,
       "int dia = 3;\n"
       +"switch (dia)\n"
       +"{\n"
       +"   case 1:\n"
       +"       System.out.println(\"Lunes\");\n"
       +"       break;\n"
       +"   case 2:\n"
       +"       System.out.println(\"Martes\");\n"
       +"       break;\n"
       +"   case 3:\n"
       +"       System.out.println(\"Miercoles\");\n"
       +"       break;\n"
       +"   default:\n"
       +"       System.out.println(\"Dia no valido\");\n"
       +"}"
       +"\n"
       +"\n"));
       
       Preguntas[] preguntas = {
    new Preguntas("¿Cuándo se ejecuta el bloque de un if?",
        new String[]{"Siempre", "Cuando la condición es verdadera", "Cuando la condición es falsa"}),
    new Preguntas("¿Qué estructura ofrece dos caminos según la condición?",
        new String[]{"if-else", "switch", "while"}),
    new Preguntas("¿Qué palabra atiende los valores que no coinciden con ningún caso del switch?",
        new String[]{"break", "case", "default"})
        };
        libro.agregarPag(new PaginaActividad("Actividad", "Pon a prueba lo aprendido.", 4, preguntas));
       
       GUI_VistaInformacion vista = new GUI_VistaInformacion();
       controladorLibro controlador = new controladorLibro(libro, vista, this);
       
       vistaMenu.setVisible(false);
       vista.setLocationRelativeTo(null);
       vista.setVisible(true);
   }
   
   public void mostrarMenu()
   {
       vistaMenu.setVisible(true);
   }
   
   
   
   
    
    
}
