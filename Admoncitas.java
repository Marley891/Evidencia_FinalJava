/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package admoncitas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jesusantoniosanchezcaro
 */
public class Admoncitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        String opcion;
        String res = "";
        String user, contraseña;
        Usuario admin = new Usuario();
        admin.DatosAdmin();

        do {

            System.out.println("Login.");
            System.out.println("---------------------");
            System.out.println("Id: ");
            user = scanner.next();
            System.out.println("Contraseña: ");
            contraseña = scanner.next();

              String inputFilename = "/Users/jesusantoniosanchezcaro/NetBeansProjects/Administracion de Citas/src/administracion/de/citas/USUARIOS.csv";
              String[] arrayUsuario; 
              Boolean registrado = false;
              
       
             BufferedReader bufferedReader=null;
             BufferedWriter bufferedWriter=null;
             
             try {
                bufferedReader = new BufferedReader (new FileReader(inputFilename));
                
                
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    //System.out.println(line);
                    arrayUsuario= line.split(",");
                    //myUsuario.put (arrayUsuario[0], arrayUsuario[1]);
                    //System.out.println( arrayUsuario[0].equals(user)  );
                    
                 if ( arrayUsuario[0].equals(user) && arrayUsuario[1].equals(contraseña) ) { registrado = true;}
                 
                          }
                
             }
             
         catch(IOException e) {
             System.out.println("IOException catched while reading: " + e.getMessage());
                    
                }
             
            
            
            
            
            
            if (registrado) {
                System.out.println("Hospital Antonio");
                System.out.println("Menú");
                System.out.println("------------------------");
                System.out.println("Elige una opción: ");
                System.out.println();
                System.out.println("1. Alta de doctores");
                System.out.println("2. Alta pacientes");
                System.out.println("3. Crear una cita");
                System.out.println("4. Realizar conexion");
                System.out.println("5. Lista de doctores");
                System.out.println("6. Lista de pacientes");
                System.out.println("7. Lista de citas");
                System.out.println("8. Mostrar conexion");
                System.out.println();

                opcion = scanner.next();

                switch (opcion) {
                    case "1":
                        Doctor doctor = new Doctor();
                        doctor.Datos();
                        doctor.darAltaDoctor();
                        break;

                    case "2":
                        Paciente paciente = new Paciente();
                        paciente.pedirDatos();
                        paciente.darAltaPaciente();
                        break;

                    case "3":
                        Citas citas = new Citas();
                        citas.DatosCita();
                        citas.crearCita();
                        break;

                    case "4":
                        ConectarIDS conexion = new ConectarIDS();
                        conexion.pedirDatos();
                        conexion.relacionarInformacion();
                        break;

                    case "5":
                        doctor = new Doctor();
                        doctor.mostrarDoctores();
                        break;

                    case "6":
                        paciente = new Paciente();
                        paciente.mostrarPacientes();
                        break;

                    case "7":
                    citas = new Citas();
                        citas.mostrarCitas();
                        break;


                    case "8":
                        conexion = new ConectarIDS();
                        conexion.mostrarRelacionesInformacion();
                        break;

                    default:
                        System.out.println("Elige una opcion correcta");

                }
            } else {
                System.out.println("Usuario o Contraseña incorrectos");
            }

            do {
                System.out.println("¿Deseas repetir la aplicacion?");
                System.out.println("si o no: ");
                scanner.nextLine();
                res = scanner.next();
                res = res.toLowerCase();

                if (!res.equals("si") && !res.equals("no")) {
                    System.out.println("Ingresa una opcion valida.");
                }

            } while (!res.equals("si") && !res.equals("no"));

            System.out.println();

        } while (res.equals("si"));

    }



}  // TODO code application logic here
  