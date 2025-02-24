/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compiladores_2023b;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author Kike
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) throws Exception {
     
                     
        String ruta="C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/Lexer.flex";
        String ruta2="C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/LexerCup.flex";
        String[] rutastx={"-parser", "Sintax", "C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/Sintax.cup"};
        generarls(ruta, ruta2, rutastx);
    }
    public static void generarls(String ruta, String ruta2, String[] rutastx) throws IOException, Exception{
        File archivo;
        archivo=new File(ruta);
        JFlex.Main.generate(archivo);
        archivo=new File(ruta2);
        JFlex.Main.generate(archivo);       
        java_cup.Main.main(rutastx);
        
        //agregue una instruccion para cuando encuentre un nombre identico dentro del paquete lo modifique
        Path rutasym=Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/sym.java");
        
        if(Files.exists(rutasym)){
        
            Files.delete(rutasym);
        
        }
        
        //ruta del documento, ruta del destino
        Files.move(
                Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/sym.java"), 
                Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/sym.java")
        );
        
        Path rutasin=Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/Sintax.java");
        
        if(Files.exists(rutasin)){
        
            Files.delete(rutasin);
        
        }
        Files.move(
                Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/Sintax.java"), 
                Paths.get("C:/Users/Kike/Desktop/Undl_Compiladores_2023B/src/compiladores_2023b/Sintax.java")
        );  
    }
}