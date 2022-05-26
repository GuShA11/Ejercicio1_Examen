/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoexamecdgoncalo;

/**
 *
 * @author alumno
 */
public abstract class Empregado {
    /**
     * String valor del nombre
     */
    protected String nombre;
    /**
     * String valor de la formacion
     */
    protected String formacion;
    /**
     * Double valor de sueldo_base
     */
    protected Double sueldo_base=10.0;
    /**
     * Double valor de complemento
     */
    protected Double complemento=10.0;

    /**
     * Devuleve el valor del Sueldo Bruto
     * @return Tipo Double - Valor del Sueldo Bruto
     */
    public abstract Double sueldoBruto();
    
}
