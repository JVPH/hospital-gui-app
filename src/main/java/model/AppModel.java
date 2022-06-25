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
    
    public String getDatosIngresados(){
        String datosIngresados = "Nombre-Cedula-Edad-Ciudad-EPS-Enfermedad Diagnosticada\n";
        for(Paciente p:listaPacientes){
            datosIngresados += p.toString()+"\n";                    
        }
        return datosIngresados;        
    }
    
    public void agregarMedico(Medico medico){
        listaMedicos.add(medico);
    }
    
    public ArrayList getListaMedicos(){
        return listaMedicos;
    }
    
    public String getDatosProcesados(){
        ArrayList<String> enfermedades = new ArrayList<>();
        ArrayList<String> mEPS = new ArrayList<>();
        
        for(Paciente p:listaPacientes){
            enfermedades.add(p.getEnfermedadDiagnosticada());
            mEPS.add(p.getEPS());
        }
        
        String mayorFrecEnfermedad = enfermedades.get(getMayorFrec(numeroDeOcurrencias(enfermedades)));
        String menorFrecEnfermedad = enfermedades.get(getMenorFrec(numeroDeOcurrencias(enfermedades)));
        String mayorFrecEPS = mEPS.get(getMayorFrec(numeroDeOcurrencias(mEPS)));
        String pacientesAdultos = getPacientesAdultos();
        
        String datosProcesados = "Enfermedad mas encontrada: "+mayorFrecEnfermedad+"\nEnfermedad menos encontrada: "
                +menorFrecEnfermedad+"\nEPS mas encontrada: "+mayorFrecEPS+"\nPacientes Adultos:\n"+pacientesAdultos;
        
        return datosProcesados;
    }
    
    private int getMayorFrec(int[] array){
        int mayorCantidad = Integer.MIN_VALUE;        
        int mayorPosicion = -1;
        for(int i=0;i<array.length;i++){
           if(array[i]> mayorCantidad){
               mayorPosicion = i;
               mayorCantidad = array[i];
           }
        }
        return mayorPosicion;
    }
    
    private int getMenorFrec(int[] array){
        int menorCantidad = Integer.MAX_VALUE;
        int menorPosicion = -1;
        
        for(int i = 0; i<array.length;i++){
            if(array[i]<menorCantidad){
                menorPosicion = i;
                menorCantidad = array[i];
            }
        }
        return menorPosicion;
    }
    
    private int[] numeroDeOcurrencias(ArrayList <String> array){
        int[] nOcurrencias = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if(array.get(i).equalsIgnoreCase(array.get(j))){
                    nOcurrencias[i]++;
                }   
            }                       
        }
        return nOcurrencias;
        
    }  
    
    
    private String getPacientesAdultos(){
        String pacientesAdultos="";
        for(Paciente p:listaPacientes){
            if(p.clasificarEdad().equals("Adulto")){
                pacientesAdultos += p.getNombreCompleto() + " - "+p.getNumeroDeCedula()+"\n";
            }
        }
        return pacientesAdultos;
    }
    
}
