/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admoncitas;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author jesusantoniosanchezcaro
 */
public class Doctor {


        private String nombre;
        private String especialidad;
        //private int id=0;
        private Scanner scanner = new Scanner(System.in);


        public void Datos() {
            System.out.println("Ingresa el nombre del doctor: ");
            this.nombre = scanner.nextLine();
            System.out.println("Ingresa su especialidad: ");
            this.especialidad = scanner.nextLine();
            //this.id=1;
        }


        public void darAltaDoctor() {
            
             String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Doctor.csv";
              String[] arrayUsuario; 
              Boolean registrado = false;
              
       
             BufferedWriter bufferedWriterr=null;
             BufferedWriter bufferedWriter=null;
             
             try {
                bufferedWriter = new BufferedWriter (new FileWriter(inputFilename));
                
                
                String Linea = this.nombre + ','+ this.especialidad;
                bufferedWriter.write(Linea);
                bufferedWriter.close();
                
             }catch (IOException e) {
                  System.out.println("ocurrio un error");
               
                        
                        
                        }
      
        }


        public void mostrarDoctores() {
                  String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Admoncitas/src/admoncitas/Doctor.csv";
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
