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
public class Personal {
 private String nombre;
 private String formacion;
 private Double sueldo_base;
 private String proyecto;
 private Double complemento;
 private Double horas_extras;

 public Double sueldoBruto(){
 return sueldo_base + complemento + (horas_extras *
sueldo_base / 160);
 }
} 