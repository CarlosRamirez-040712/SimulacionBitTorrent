package multiservers;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Tracker 
{        
    public static void main (String[] argumentos) throws Throwable
    {
        // Se crea el controlador de los hilos
        Multiservers controlThread=new Multiservers();
        // Se crea el auxiliar para el cliente
        ClientFullDuplex ClientTracker=new ClientFullDuplex();
        // Se inicia los hilos
        controlThread.start();
        // Variable para datos de la ventana de comandos
        String entradaTeclado;
        ArrayList <String> IPs = new ArrayList();
        int proceso=1;
        String estado;
        do
        {
            Scanner entradaEscaner = new Scanner (System.in); 
            entradaTeclado = entradaEscaner.nextLine ();  
            DB DataBase= new DB();
            ResultSet rs;
            //Comandos para el tracker
            if (entradaTeclado.equals("Estado"))
            {
                rs = DataBase.runSql("select * from registros");
                System.out.println("#Registro\tIP\t\tPorcentaje\tEstado\tArchivo");
                while(rs.next())
                {
                    System.out.println(rs.getString(1)+"\t\t"+rs.getString(2)+"\t"+rs.getString(4)+"\t\t"+rs.getString(5)+"\t"+rs.getString(3));
                }
                DataBase.finalize();
            }
            else if(entradaTeclado.equals("Busqueda"))
            {
                rs = DataBase.runSql("select *from registros where no_registro='1'");
                rs.next();
                estado = rs.getString(5); 
                if(estado.equals("on"))
                    DataBase.exe("update registros Set Estado='off' where no_registro='1'");
                else
                    DataBase.exe("update registros Set Estado='on' where no_registro='1'");
                System.out.println("Se ha cambiado el estado del servicio Busqueda");
                DataBase.finalize();
            }
            else if(entradaTeclado.equals("Registrar"))
            {
                rs = DataBase.runSql("select *from registros where no_registro='2'");
                rs.next();
                estado = rs.getString(5); 
                if(estado.equals("on"))
                    DataBase.exe("update registros Set Estado='off' where no_registro='2'");
                else
                    DataBase.exe("update registros Set Estado='on' where no_registro='2'");
                System.out.println("Se ha cambiado el estado del servicio Registrar");
                DataBase.finalize();
            }
            else if(entradaTeclado.equals("Descarga"))
            {
                rs = DataBase.runSql("select *from registros where no_registro='3'");
                rs.next();
                estado = rs.getString(5); 
                if(estado.equals("on"))
                    DataBase.exe("update registros Set Estado='off' where no_registro='3'");
                else
                    DataBase.exe("update registros Set Estado='on' where no_registro='3'");
                System.out.println("Se ha cambiado el estado del servicio Descargar");
                DataBase.finalize();
            }
            else if(entradaTeclado.equals("Disponibles"))
            {
                rs = DataBase.runSql("select *from registros where no_registro='4'");
                rs.next();
                estado = rs.getString(5); 
                if(estado.equals("on"))
                    DataBase.exe("update registros Set Estado='off' where no_registro='4'");
                else
                    DataBase.exe("update registros Set Estado='on' where no_registro='4'");
                System.out.println("Se ha cambiado el estado del servicio Disponibles");
                DataBase.finalize();
            }
        }while(proceso==1);
    } 
}