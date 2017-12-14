/*
 * Examen Refactorizacion
 * 
 */
package lovivido;

import javax.swing.JOptionPane;

public class LoVivido
{

    public static void main(String[] args)
    {
       String nombre;
        String edad;
        /**
         * creamos objeto de tipo Calculos
         */
        Calculos persona1=new Calculos();
        /**
         * pedimos el nombre y la edad de la persona 
         */
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        /**
         * llamamos a los metodos para calcular el tiempo vivido por las personas
         */
        persona1.pedirDatos(nombre,edad);
        persona1.calcularvalores();
        /**
         * mostramos el resultado
         */

        JOptionPane.showMessageDialog(null,"Meses: "+persona1.meses,"Numero de meses vividos de "+persona1.getNombre(),JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Días: "+persona1.getDias(),"Numero de días vividos de "+persona1.getNombre(),JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null,"Horas: "+persona1.getHoras(),"Numero de horas vividos de "+persona1.getNombre(),JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
