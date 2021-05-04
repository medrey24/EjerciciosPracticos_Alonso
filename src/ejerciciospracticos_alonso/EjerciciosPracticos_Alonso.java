/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospracticos_alonso;
import java.util.Scanner;

/**
 *
 * @author acs
 */
public class EjerciciosPracticos_Alonso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner numEntrada = new Scanner(System.in);
        
    System.out.println("--------------------------------------------------------\n");
    System.out.println("            Universidad Autónoma de Campeche            \n");
    System.out.println("                  Alonso Medina Reyes                   \n");
    System.out.println("                       I.S.C 2 A                        \n");
    System.out.println("             Docente: Ing. Edgar Caamal Dzul            \n");
    System.out.println("               Lenguaje de programación I               \n");
    System.out.println("                 Ejercicios Prácticos                   \n");
    System.out.println("                      04/05/2021                        \n");
    System.out.println("--------------------------------------------------------\n");
    
    System.out.println("Actividades que conforman el trabajo:\n");
    System.out.println("Código Morse.........................................(1)");
    System.out.println("Personajes de Star Wars..............................(2)");
    System.out.println("Quizz de Java........................................(3)");
    System.out.println("--------------------------------------------------------\n");
 
    System.out.print("Introduzca un número de actividad para realizar: ");
        int numero = numEntrada.nextInt();
        System.out.println();
        actividades(numero);
    System.out.println("--------------------------------------------------------\n");
    
      
       

    }
    
   
    public static void actividades(int numEntr){
        
        Scanner entrada = new Scanner(System.in);
        
        switch(numEntr){
            case 1:
                
            System.out.println("--------------------------------------------------------\n");
            System.out.println("                       Código Morse                     \n");
            System.out.println("--------------------------------------------------------\n");
                
                System.out.println("Introduzca la frase que se convertirá código morse: ");
                String fraseEntra = entrada.nextLine().toUpperCase();
               
                char carFrase[] = fraseEntra.toCharArray();
                morseCode();
                
                bucleImpresion(fraseEntra, carFrase);
                System.out.println(totalPagar(fraseEntra, carFrase));
                break;
                
            case 2:
                
                System.out.println("--------------------------------------------------------\n");
                System.out.println("                  Personajes de Star Wars               \n");
                System.out.println("--------------------------------------------------------\n");
                
                System.out.println("Introduzca un género para mostrar los personajes");
                System.out.println("male, female, n/a, hermaphrodite");
                String generoPers = entrada.nextLine();
              
                personajesStarWars();
                datosPersonajes(generoPers);
                break;
                
            case 3:
                
                System.out.println("--------------------------------------------------------\n");
                System.out.println("                       Quizz de Java                    \n");
                System.out.println("--------------------------------------------------------\n");
                
                QuizzPreguntas();
                QuizzIncisos();
                pregYResp();
                System.out.println();
                System.out.println("Su calificación obtenida en el Quizz es " + Contador);
                break;
                
            default:
                System.out.println("Favor de introducir un número válido");
        
        }
    }
    
    
    static String[][] aPersonajes; 
    static String sexo;
    
    public static void personajesStarWars(){
        
        aPersonajes = new String[16][3];
            
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male"; 
    }
    
    public static void datosPersonajes(String genero){
        sexo = genero;
        for (int i = 0; i < aPersonajes.length; i++) {

            if(aPersonajes[i][2].equals(sexo)){
                System.out.println(aPersonajes[i][0]);
                System.out.println(aPersonajes[i][1]);
                System.out.println(aPersonajes[i][2]);
                System.out.println();
            }
        }
    }
    

    public static String[][] Preguntas;
    public static String[][] Incisos;
    
    public static int Contador;

    public static void QuizzPreguntas() {
        Preguntas = new String[10][2];
        Preguntas[0][0] = "¿Cuál es la sintaxis correcta para generar Hello World en Java?";
        Preguntas[0][1] = "0";
        Preguntas[1][0] = "¿Cómo se insertan comentarios de una línea en Java?";
        Preguntas[1][1] = "1";
        Preguntas[2][0] = "¿Qué tipo de datos se utiliza para crear una variable que almacene texto?";
        Preguntas[2][1] = "2";
        Preguntas[3][0] = "¿Cómo se crea una variable numérica que asigne el valor 5?";
        Preguntas[3][1] = "0";
        Preguntas[4][0] = "¿Qué operador se utiliza para comparar dos valores?";
        Preguntas[4][1] = "1";
        Preguntas[5][0] = "¿Para declarar un arreglo, la variable se define como tipo?";
        Preguntas[5][1] = "2";
        Preguntas[6][0] = "¿Qué instrucción se usa para crear una clase en Java?";
        Preguntas[6][1] = "0";
        Preguntas[7][0] = "¿Cuál es la sentencia correcta para crear un objeto llamado myObj de MyClass? ";
        Preguntas[7][1] = "1";
        Preguntas[8][0] = "¿Cuál es el operador que se utiliza para multiplicar números?";
        Preguntas[8][1] = "2";
        Preguntas[9][0] = "¿Cómo se inicia la sentencia if en Java?";
        Preguntas[9][1] = "0";
    }

    public static void QuizzIncisos() {
        Incisos = new String[10][3];
        Incisos[0][0] = "System.out.println( Hello World );";
        Incisos[0][1] = "echo( Hello World );";
        Incisos[0][2] = "print ( Hello World );";
        Incisos[1][0] = "/* This is a comment";
        Incisos[1][1] = "// This is a comment";
        Incisos[1][2] = "# This is a comment";
        Incisos[2][0] = "myString";
        Incisos[2][1] = "string";
        Incisos[2][2] = "String";
        Incisos[3][0] = "int x = 5;";
        Incisos[3][1] = "num x = 5";
        Incisos[3][2] = "x = 5;";
        Incisos[4][0] = "><";
        Incisos[4][1] = "==";
        Incisos[4][2] = "<>";
        Incisos[5][0] = "{}";
        Incisos[5][1] = "()";
        Incisos[5][2] = "[]";
        Incisos[6][0] = "class";
        Incisos[6][1] = "MyClass";
        Incisos[6][2] = "class()";
        Incisos[7][0] = "class MyClass = new myObj();";
        Incisos[7][1] = "MyClass myObj = new MyClass();";
        Incisos[7][2] = "new myObj = MyClass();";
        Incisos[8][0] = "%";
        Incisos[8][1] = "X";
        Incisos[8][2] = "*";
        Incisos[9][0] = "if (x > y)";
        Incisos[9][1] = "if x > y;";
        Incisos[9][2] = "if x > y then;";
    }

    public static void pregYResp(){
        
        String respuestaInciso;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < Preguntas.length; i++) {
            
            System.out.println();
            System.out.println("Pregunta " + (i + 1));
            System.out.println(Preguntas[i][0]);
            System.out.println("0.- " + Incisos[i][0]);
            System.out.println("1.- " + Incisos[i][1]);
            System.out.println("2.- " + Incisos[i][2]);
            System.out.println();
            System.out.print("Favor de escribir su respuesta: ");
            respuestaInciso = entrada.nextLine();
            
            
            if(Preguntas[i][1].equals(respuestaInciso)){
                Contador++;
            }
        }
    }
    
    public static int contador(){
        return Contador;
    }
    
    
    public static String[][] aCodigo;
    public static void morseCode(){
        aCodigo = new String[26][2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
        // Arreglo con representación del Alfabeto
        // En código Morse
        
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
    }

    public static String conversion_caracter(char caracter) {
        
        int numCa = (int) caracter;
        return aCodigo[numCa - 65][0] + " " + aCodigo[numCa - 65][1];
    }
    
    public static void bucleImpresion(String frase, char carFrase[]){
        
        for (int i = 0; i < frase.length(); i++) {
            
            if(String.valueOf(carFrase[i]).equals(" ")){
                System.out.println("");
            } else {
                System.out.println(conversion_caracter(carFrase[i]));
            }
        }
    }
    
    public static String totalPagar(String frase, char carFrase[]){
        
        int contador = 1;
        int pago = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(carFrase[i]).equals(" ")){
                contador++;
            }
        }
        
        
        if(contador <= 5){
            pago = 10;
        
        } else{
            pago = ((contador - 5) * 3) + 10;
        }
        return "Número de palabras en la frase: " + contador + "\n" + "El total a pagar son $" + pago + " pesos";
    }
    
   
}
