/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admoncitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
/**
 *
 * @author jesusantoniosanchezcaro
 */
public class Usuario {
   

        String Id;
        String contraseña;
        private Connection conexion;
        private Scanner scanner = new Scanner(System.in);


        public void DatosAdmin() {
            ResultSet dato = null;

           
        }

        // Métodos getters.
        public String getId() {
            return this.Id;
        }

        public String getContraseña() {
            return this.contraseña;
        }

    }


