/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materioa;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author salva
 */
public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias=new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if(materias.add(m)){
            JOptionPane.showMessageDialog(null,"Alumno Inscripto");
        }else{
            JOptionPane.showMessageDialog(null,"Alumno ya inscripto en la materia");
        };
    }
    
    public int cantidadDeMaterias(){
        return materias.size();
    }
    
    public String toString(){
        return apellido+", "+nombre;
    }

}
