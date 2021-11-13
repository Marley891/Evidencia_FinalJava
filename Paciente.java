/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admoncitas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 *
 * @author jesusantoniosanchezcaro
 */
public class Paciente {
  

        private String nombre;
        private String apellidos;
        private Connection conexion;
        //private int id = 0;
        private Scanner scanner = new Scanner(System.in);



        public void pedirDatos() {
            System.out.println("Ingresa el nombre del paciente: ");
            this.nombre = scanner.nextLine();
           System.out.println("Ingresa el apellido del paciente: ");
            this.apellidos = scanner.nextLine();
        }


        public void darAltaPaciente() {
             String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Pacientes.csv";
              String[] arrayUsuario; 
              Boolean registrado = false;
              
       
             BufferedWriter bufferedWriterr=null;
             BufferedWriter bufferedWriter=null;
             
             try {
                bufferedWriter = new BufferedWriter (new FileWriter(inputFilename));
                
                
                String Linea = this.nombre + ','+ this.apellidos;
                bufferedWriter.write(Linea);
                bufferedWriter.close();
                
             }catch (IOException e) {
                  System.out.println("ocurrio un error");
               
                        
                        
                        }
      
        }
        

        public void mostrarPacientes() {
            ResultSet dato = null;
 String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Pacientes.csv";
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

          
        }
     

