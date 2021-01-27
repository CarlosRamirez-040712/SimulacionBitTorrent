package clientpeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class ClientPeer 
{
    static HashMap <String, Integer> Archivos = new HashMap();
    static String IP;
    static String IP2;
    static String nombre_usuario;
    public static void main(String[] args) throws IOException 
    {
            Scanner entradaEscaner = new Scanner (System.in); 
            System.out.println("Ingrese su nombre: ");
            nombre_usuario = entradaEscaner.nextLine();  
            System.out.println("Ingrese su IP: ");
            IP = entradaEscaner.nextLine();
            System.out.println("Ingrese la IP del tracker: ");
            IP2 = entradaEscaner.nextLine();
            Socket cliente = null; 
            PrintWriter escritor = null; 
            String DatosEnviados = null; 
            BufferedReader entrada=null;
		
            String maquina; 
            int puerto; 
            BufferedReader DatosTeclado = new BufferedReader ( new InputStreamReader (System.in)); 
            maquina = IP2; 
            puerto=12345;
            try
            { 
                cliente = new Socket (maquina,puerto); 
            }catch (Exception e)
            { 
		System.out.println ("Fallo 2: "+ e.toString()); 
		System.exit (0); 
            }
            try
            { 
                escritor = new PrintWriter(cliente.getOutputStream(), true);
		entrada=new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            }catch (Exception e)
            { 
                System.out.println ("Fallo : "+ e.toString()); 
		cliente.close(); 
		System.exit (0); 
            } 
            String line;
            String reg= "Registro/" + IP + "/" + nombre_usuario;
            escritor.println (reg);
            line = entrada.readLine();
	    //System.out.println(line);
            //escritor.println ("FIN");
            Multiservers ClientServ = new Multiservers();
            ServerDes Srd= new ServerDes();
            Srd.start();
            ClientServ.start();
            Interfaz Inter = new Interfaz();
            Inter.show();
    }
}
