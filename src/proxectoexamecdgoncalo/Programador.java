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

    private String proyecto;
    private Double horas_extras;

    private static final int PRECIO_EXTRA = 160;


    public Programador(String proyecto, Double horas_extras) {
        this.proyecto = proyecto;
        this.horas_extras = horas_extras;
    }

    public String getProyecto() {
        return proyecto;
    }
    
    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public Double getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(Double horas_extras) {
        this.horas_extras = horas_extras;
    }

    @Override
    public Double sueldoBruto() {
        return sueldo_base + complemento + (horas_extras * sueldo_base / PRECIO_EXTRA);
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.proyecto);
        hash = 53 * hash + Objects.hashCode(this.horas_extras);
        return hash;
    }

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

    @Override
    public String toString() {
        return "Programador{" + "proyecto=" + proyecto + ", horas_extras=" + horas_extras + '}';
    }
    
    
    
}
