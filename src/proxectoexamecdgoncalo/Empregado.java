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
    
    protected String nombre;
    protected String formacion;
    protected Double sueldo_base=10.0;
    protected Double complemento=10.0;

    public abstract Double sueldoBruto();
    
}
