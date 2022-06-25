/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author jvela
 */
public class AppModel {
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedicos;
    
    
    public AppModel(){
        this.listaPacientes = new ArrayList<>();
        this.listaMedicos = new ArrayList<>();
    }
    
    public void agregarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }
    
    public ArrayList getListaPacientes(){
        return listaPacientes;
    }
    
    public void agregarMedico(Medico medico){
        listaMedicos.add(medico);
    }
    
    public ArrayList getListaMedicos(){
        return listaMedicos;
    }
    
}
