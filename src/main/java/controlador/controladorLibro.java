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
import model.PaginaActividad;
import model.Preguntas;
import model.Actividades;

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
    private Preguntas[]preguntas;
    private int[] respuestasUsuario = new int[3];
    private int preguntaActual = 0;
    private boolean intentoEnCurso = false;
    private Actividades actividad = new Actividades();

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
                
            case "OPCION1":
                    responder(1);
                    break;
                    
            case "OPCION2":
                responder(2);
                break;
                
            case "OPCION3":
                responder(3);
                break;
                
            case "ACTIVIDAD":
                irAPagina(libro.mostrarCantidad() -1);
                break;
                
            case "RESULTADOS":
                mostrarResultados();
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
            
            if (pagina instanceof PaginaActividad)
            {
                preguntas = ((PaginaActividad)pagina).getPreguntas();
                IniciarIntento();
            }
            else
            {
                intentoEnCurso = false;
                vista.mostrarPagina(pagina.getTitulo(), pagina.mostrarContenido(), pagina.getEjemplo());
            }
        }
        catch (IndexOutOfBoundsException ex)
        {
            vista.mostrarMensaje("No hay mas paginas en esa direccion");
        }
            
    }
    
    private void IniciarIntento()
    {
        if(!actividad.intentos())
        {
            intentoEnCurso = false;
            vista.mostrarTexto("Actividad",
                    "Ya realizaste los 3 intentos permitidos. Pulsa 'Resultados' para ver tu historial");
            return;
        }
        respuestasUsuario = new int[3];
        preguntaActual = 0;
        intentoEnCurso = true;
        mostrarPreguntaActual();
    }
    
    private void mostrarPreguntaActual()
    {
        Preguntas pregunta = preguntas[preguntaActual];
        vista.mostrarPregunta("Pregunta "+(preguntaActual + 1)+ " de "+preguntas.length,
                pregunta.getEnunciado(), pregunta.getOpciones());
    }
    
    private void responder(int opcion)
    {
        if (!intentoEnCurso)
        {
            return;
        }
        
        if (opcion < 1 || opcion > 3)
        {
            vista.mostrarMensaje("Respuesta no valida");
            return;
        }
        
        respuestasUsuario[preguntaActual] = opcion;
        preguntaActual++;
        
        if (preguntaActual < preguntas.length)
        {
            mostrarPreguntaActual();
        }
        else
        {
            terminarIntento();
        }
    }
    
    private void terminarIntento()
    {
        intentoEnCurso = false;
        int aciertos = actividad.finIntento(respuestasUsuario);
        
        vista.mostrarTexto("Resultado del intento "+ actividad.getIntentosRealizados(),
                "Respuestas correctas "+aciertos + " de "+preguntas.length+".\n\n"
        + "Pulsa 'Actividades' para otro intento (maximo 3"
        +" o 'Resultados' para ver tu historial.");
    }
    
    private void mostrarResultados()
    {
        intentoEnCurso = false;
        String texto = "";
        
        try
        {
            for (int i = 0; i < actividad.getIntentosRealizados(); i++)
            {
                int[] intento = actividad.obtenerIntento(i);
                texto += "intento "+(i+1)+" respuestas "+intento[0]+", "
                        + intento[1]+", "+intento[2]
                        +" -> aciertos -> "+actividad.calcRespuestasCorrectas(intento)+"\n";
            }
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            texto = "El intento consultado no existe";
        }
        
        if(texto.isEmpty())
        {
            texto = "Todavia no has realizado intentos";
        }
        vista.mostrarTexto("Resultados", texto);
    }
        
    
    
    
}
