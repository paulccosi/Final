/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Wx8-PC
 */
public class Medico {
    private int identificacion;
    private String nombre;
    private String apellidos;
    private String especialidad;

    public Medico(int identificacion, String nombre, String apellidos, String especialidad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
    }
    
    public void verMedico(){
        JOptionPane.showMessageDialog(null , "La idenficaicon del medico: "+identificacion+"\nEl nombre del medioc: "+nombre+""
                + "\nEl apellido del medico: "+apellidos+"La especialidad del medico: "+especialidad);
    }
}
