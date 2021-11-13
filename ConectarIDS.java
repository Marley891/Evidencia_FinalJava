/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admoncitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author jesusantoniosanchezcaro
 */
public class ConectarIDS {
  


        // Atributos.
        private int idDoc;
        private int idPaciente;
        private int idCita;
        private Connection conexion;
        private Scanner scanner = new Scanner(System.in);


        public void pedirDatos() {
            System.out.println("Ingrese el ID del doctor: ");
            this.idDoc = scanner.nextInt();
            System.out.println("Ingrese el ID del paciente: ");
            this.idPaciente = scanner.nextInt();
            System.out.println("Ingrese el ID de la cita: ");
            this.idCita = scanner.nextInt();
        }


        public void relacionarInformacion() {
            
        }

        public void mostrarRelacionesInformacion() {
            ResultSet dato = null;

          
        }

      
}
