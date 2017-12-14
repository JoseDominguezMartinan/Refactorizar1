/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

/**
 *
 * @author jdominguezmartinan
 * @version 1.0
 */
public class Calculos
{

    
    String nombre;
    String edad;
    int meses;
    int dias;
    int horas;
    int años;
    
    /**
     * Constructor por defecto 
     */

    public Calculos()
    {
    }
    /**
     * Constructor por parametros 
     *
     * @param nombre nombre del usuario
     * @param edad edad del usuario, introducido con un String por eso vamos a tener que convertirlo 
     * @param meses dará los meses que ha vivido el usuario desde que nació
     * @param dias nos devolverá los dias que ha vivido el usuario desde que
     * nació
     * @param horas Devolvera las horas que ha vivido el usuario desde que
     * nació
     * @param años se utilizara para devolver los años que ha vivido el usuario
     * desde que nació
     *
     */

    public Calculos(String nombre,String edad,int meses,int dias,int horas,int años)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.meses = meses;
        this.dias = dias;
        this.horas = horas;
        this.años = años;
    }
    
    

    /**
     * metodo que pide los datos al usuario del programa
     * @param n nombre de la persona
     * @param e edad de la persona 
     */
    public void pedirDatos(String n,String e)
    {
        nombre=n;
        edad=e;
    }

    /**
     * metodo que calcula el tiempo vivido por el usuario en años,meses,dias y
     * horas
     *
     * 
     */
    public void calcularvalores()
    {
        años = Integer.parseInt(edad);
        meses = (años*12);
        dias = (años*365);
        horas = (dias*24);
    }
    /**
     * Get
     * @return meses
     */

    public int getMeses()
    {
        return meses;
    }
    /**
     * Set
     * @param meses 
     */

    public void setMeses(int meses)
    {
        this.meses = meses;
    }
    /**
     * Get
     * @return dias 
     */

    public int getDias()
    {
        return dias;
    }
    /**
     * Set
     * @param dias 
     */

    public void setDias(int dias)
    {
        this.dias = dias;
    }
    /**
     * Get
     * @return horas
     */

    public int getHoras()
    {
        return horas;
    }
    /**
     * Set
     * @param horas 
     */

    public void setHoras(int horas)
    {
        this.horas = horas;
    }
    /**
     * Get
     * @return nombre
     */

    public String getNombre()
    {
        return nombre;
    }
    
    
    

}
