/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxectoexamecdgoncalo;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Programador extends Empregado {

    /**
     * String valor de proyecto
     */
    private String proyecto;
    /**
     * Double valor de horas extras
     */
    private Double horas_extras;

    /**
     * Constante tipo int valor de precio extra
     */
    private static final int PRECIO_EXTRA = 160;


    /**
     * Constructor con 2 parametros
     * @param proyecto
     * @param horas_extras 
     */
    public Programador(String proyecto, Double horas_extras) {
        this.proyecto = proyecto;
        this.horas_extras = horas_extras;
    }

    /**
     * Devuelve el valor del proyecto
     * @return String - valor del proyecto
     */
    public String getProyecto() {
        return proyecto;
    }
    
    /**
     * Modifica el valor de proyecto
     * @param proyecto 
     */
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    /**
     * Devuelve el valor de horas extras
     * @return Tipo Double - valor de horas extras
     */
    public Double getHoras_extras() {
        return horas_extras;
    }

    /**
     * Modifica el valor de horas extras
     * @param horas_extras 
     */
    public void setHoras_extras(Double horas_extras) {
        this.horas_extras = horas_extras;
    }

    /**
     * Devuelve metodo suledoBruto() de la SuperClase Empregado
     * @return tipo Double - valor de sueldo bruto 
     */
    @Override
    public Double sueldoBruto() {
        return sueldo_base + complemento + (horas_extras * sueldo_base / PRECIO_EXTRA);
    }
    /**
     * Devuelve el hashCode de la clase 
     * @return tipo int - valor del hashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.proyecto);
        hash = 53 * hash + Objects.hashCode(this.horas_extras);
        return hash;
    }

    /**
     * Devuelve un booleano
     * @param obj
     * @return Tipo boolean - valor del equals
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Programador other = (Programador) obj;
        if (!Objects.equals(this.proyecto, other.proyecto)) {
            return false;
        }
        if (!Objects.equals(this.horas_extras, other.horas_extras)) {
            return false;
        }
        return true;
    }

    /**
     * Devuelve valor del toString() de la clase
     * @return Tipo String - valor del toString()
     */
    @Override
    public String toString() {
        return "Programador{" + "proyecto=" + proyecto + ", horas_extras=" + horas_extras + '}';
    }
    
    
    
}
