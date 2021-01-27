package clientpeer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcesoDesc extends Thread
{
    private Socket socket = null;
    Socket cliente = null; 
    PrintWriter escritor = null; 
    String DatosEnviados = null; 
    BufferedReader entrada=null;
   
    public ProcesoDesc(Socket socket) 
    {
        super("ProcesoDesc");
        this.socket = socket;
        Multiservers.NoClients++;
    }
    
    public void run() 
    {
        try 
        {
            DataOutputStream output;
            BufferedInputStream bis;
            BufferedOutputStream bos;
            
            byte[] receivedData;
            int in;
            String file;
            receivedData = new byte[8192];
            bis = new BufferedInputStream(socket.getInputStream());
            DataInputStream dis=new DataInputStream(socket.getInputStream());
            //Recibimos el nombre del fichero
            file = dis.readUTF();
            file = file.substring(file.indexOf('\\')+1,file.length());
            String TamA = dis.readUTF();
            float Tam = Integer.parseInt(TamA);
            System.out.println("*****El Tamaño del archivo es: " + Tam + " *****");
            float porcent = (8192*100)/Tam;
            int por;
            //Para guardar fichero recibido
            System.out.println(file);
            bos = new BufferedOutputStream(new FileOutputStream(file));
            int y=0;
            while ((in = bis.read(receivedData)) != -1)
            {
                y++;
                bos.write(receivedData,0,in);
                por=(int) (y*porcent);
                System.out.println(por + "%");
                ClientPeer.Archivos.replace(file, por);
            }
            ClientPeer.Archivos.replace(file, 100);
            bos.close();
            dis.close();
        } catch (IOException ex) 
        {
            Logger.getLogger(ProcesoDesc.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e ) 
        {
            System.err.println(e);
        }
    }
}
