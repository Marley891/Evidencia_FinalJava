/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admoncitas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author jesusantoniosanchezcaro
 */
public class Citas {

    private int idDoc;
    private int idPaciente;
    private int idCita;
    private String fecha;
    private String hora;
    private String motivo;
    private final Scanner scanner = new Scanner(System.in);


    public void DatosCita() {
        
        System.out.println("Ingresa la id_Cita: ");
        this.idDoc = scanner.nextInt();
        System.out.println("Ingresa la id Paciente: ");
        this.idPaciente = scanner.nextInt();
        System.out.println("Ingresa la id Doctor: ");
        this.idCita = scanner.nextInt();
        
        
        System.out.println("Ingresa la fecha de la cita (dd/mm/yyyy): ");
        this.fecha = scanner.nextLine();
        System.out.println("Ingresa la hora de la cita: ");
        this.hora = scanner.nextLine();
        System.out.println("Ingresa el motivo de la cita: ");
        this.motivo = scanner.nextLine();
    }

    public void crearCita() {
        String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Citas.csv";
              String[] arrayUsuario; 
              Boolean registrado = false;
              
       
             BufferedWriter bufferedWriterr=null;
             BufferedWriter bufferedWriter=null;
             
             try {
                bufferedWriter = new BufferedWriter (new FileWriter(inputFilename));
                
                String IdCita = Integer.toString(this.idCita);
                String IdPaciente = Integer.toString(this.idPaciente);
                String IdDoc = Integer.toString(this.idDoc);
                
                String Linea = IdCita + ','+ IdPaciente + ',' + IdDoc + ',' + this.fecha + ',' + this.hora + ',' + this.motivo;
                bufferedWriter.write(Linea);
                bufferedWriter.close();
                
             }catch (IOException e) {
                  System.out.println("ocurrio un error");
               
                        
                        
                        }
                
    }

    public void mostrarCitas() {
         String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Citas.csv";
              String[] arrayUsuario; 
              Boolean registrado = false;
              
       
             BufferedWriter bufferedWriterr=null;
             BufferedWriter bufferedWriter=null;
             BufferedReader bufferedReader=null;
             
             try {
                bufferedReader = new BufferedReader (new FileReader(inputFilename));
                
                
               String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                    //arrayUsuario= line.split(",");
                    //myUsuario.put (arrayUsuario[0], arrayUsuario[1]);
                    //System.out.println( arrayUsuario[0].equals(user)  );
                    
                 
                 
                          }
                
                
                
                
                bufferedReader.close();
                
             }catch (IOException e) {
                  System.out.println("ocurrio un error");
               
                        
                        
                        }

          
        }


    void DatosCitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void crearCitas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
