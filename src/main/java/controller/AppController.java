/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;
import view.AppView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author jvela
 */
public class AppController {
    private AppView theView;
    private AppModel theModel;
    
    
    public AppController(AppView theView, AppModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addIngresarPacienteListener(new IngresarPacienteListener());
        this.theView.addObtenerDatosListener(new ObtenerDatosListener());
        this.theView.addIngresarMedicoListener(new IngresarMedicoListener());
        this.theView.addProcesarDatosListener(new ProcesarDatosListener());        
        
    }
    
    class IngresarPacienteListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{                
                String nombre = theView.getTextFieldNombrePaciente();
                Long cedula = theView.getTextFieldCedulaPaciente();
                int edad = theView.getTextFieldEdadPaciente();
                String ciudad = theView.getTextFieldCiudadPaciente();
                String eps = theView.getTextFieldEPSPaciente();
                String enfermedadDiagnosticada = theView.getTextFieldEnfermedadDiagnosticadaPaciente();
                theModel.agregarPaciente(new Paciente(nombre,cedula,edad,ciudad,eps,enfermedadDiagnosticada));
                theView.displayMessage("Paciente ingresado exitosamente!");
                theView.limpiarTextFieldsPanelIngresarDatosPaciente();           
          
            } catch(Exception ex){
                theView.displayMessage("Por favor ingresar los datos correctamente.\nError: "+ex);
            }
            
        }
        
    }
    
    class ObtenerDatosListener implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            try{                
                theView.setTextAreaDatosIngresados(theModel.getDatosIngresados());                
            } catch (Exception ex){
                theView.displayMessage("Error en la obtencion de datos.\nError: "+ex);
            }
        }
        
    }
    
    class IngresarMedicoListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String nombre = theView.getTextFieldNombreMedico();
                Long cedula = theView.getTextFieldCedulaMedico();
                int edad = theView.getTextFieldEdadMedico();
                String ciudad = theView.getTextFieldCiudadMedico();
                theModel.agregarMedico(new Medico(nombre,cedula,edad,ciudad));
                theView.displayMessage("Medico ingresado exitosamente!");
                theView.limpiarTextFieldsPanelIngresarDatosMedico();
                
                
            }catch (Exception ex){
                theView.displayMessage("Por favor ingresar los datos correctamente.\nError: "+ex);
            }            
        }
    }
    
    class ProcesarDatosListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            try{
                String datosProcesados = theModel.getDatosProcesados();
                theView.setTextAreaDatosProcesados(datosProcesados);               
                
            }catch(Exception ex){
                theView.displayMessage("Aun no hay datos que procesar.");
            }
        }
    }
    
}
