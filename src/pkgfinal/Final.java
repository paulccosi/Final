/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Wx8-PC
 */
public class Final {
    public static List<Medico> lista = new LinkedList<Medico>();
    public static List<Paciente> lista2 = new LinkedList<Paciente>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      lista.add(new Medico(73788334, "Paul", "Ccosi", "Sistemas"));
        
        lista2.add(new Paciente(73788334, "Gian", "Apaza", 18, "Masculino"));
      int opt=0;    
        
        
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE MEDICO \n"+
           "Historial Clinico----\n"+
              "1:MENU - MEDICO\n"+
              "2:MENU - PACIENTE\n"+
              "3:SALIR"));  
             switch(opt){
          case 1: {
              List<Medico> lista = new LinkedList<Medico>();
          } 
               do{
                   opt=Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n"+
              "1 - Agregar Medico\n"+
              "2 - Eliminar Medico\n"+
              "3-  Mostrar Medico\n"+
              "4 - salir"));
            
          switch(opt){
          case 1: agregar();break;
          case 2: eliminar();break;
          case 3: mostrar(); break;
          case 4: opt=0;break;
          default: JOptionPane.showMessageDialog(null, "la opcion no existe ");
          }
      }while(opt!=0);
          }}
         
    private static void mostrar() {
        for(int i=0;i<lista.size();i++){
        lista.get(i).verMedico();
    }   
        System.out.println("_____________________");
     } 
    private static void agregar() {
       int iden =   Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificacion"));
       String nom = JOptionPane.showInputDialog("Ingrese nombrre");
       String ape = JOptionPane.showInputDialog("Ingrese apellidos");
       String espe =JOptionPane.showInputDialog("Ingrese especialidad");
       lista.add(new Medico(iden, nom, ape, espe));
    }
     

    private static void eliminar() {
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento eliminar"));
        lista.remove(elemento);
    }

  
        
  
    {
             List<Paciente> lista2 = new LinkedList<Paciente>();
        int opt=0;
              do{
                  opt = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU PACIENTE\n+"
                          + "1: Agregar Paciente\n+"
                          + "2: Eliminar Paciente\n+"
                          + "3: Mostrar Paciente\n+"
                          + "4: Atras"));
                  switch(opt){
                      case 1: agregarP();break;
                      case 2: eliminarP();break;
                      case 3: mostrarP();break;
                      case 4: opt = 0;break;
                      default: JOptionPane.showMessageDialog(null, "la opcion no existe");
                  }
        }while(opt!=0);
  }
    private void mostrarP() {
        for(int i=0;i<lista2.size();i++){
        lista2.get(i).verPaciente();
    }   
        System.out.println("_____________________");
    }     
 private void agregarP() {
       int iden =   Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificacion"));
       String nom = JOptionPane.showInputDialog("Ingrese nombrre");
       String ape = JOptionPane.showInputDialog("Ingrese apellidos");
       int ed = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
       String gene = JOptionPane.showInputDialog("Ingrese genero");
       lista2.add(new Paciente(iden, nom, ape, ed, gene));
    }
    private void eliminarP() {
        int elemento=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento eliminar"));
        lista2.remove(elemento);
    }
    
    
}