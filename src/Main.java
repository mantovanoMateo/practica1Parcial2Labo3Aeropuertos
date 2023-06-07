import Excepcoines.menorQueParametroException;
import Models.Aeropuerto;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws menorQueParametroException {
        ObjectMapper mapper = new ObjectMapper();
        Scanner entrada=new Scanner(System.in);

        File archivo = new File("G6UyHYt7.json");
        try {
            Aeropuerto[] aeropuertos = mapper.readValue(archivo, Aeropuerto[].class);
            for (Aeropuerto aeropuerto : aeropuertos) {
                System.out.println("Aeropuerto: " + aeropuerto.toString());
            }
            int capacidadMinima=0;
            System.out.println("Ingrese la capacidad minima deseada por favor");
            capacidadMinima=entrada.nextInt();
            entrada.nextLine();
            ArrayList<Aeropuerto> aeropuertosConCapacidadMayor=new ArrayList<>();
            for (Aeropuerto aeropuerto: aeropuertos){
                try {
                    if(aeropuerto.getCapacidad()<=capacidadMinima){
                        throw new menorQueParametroException();
                    }else {
                        aeropuertosConCapacidadMayor.add(aeropuerto);
                    }
                } catch (menorQueParametroException e) {
                    System.out.println("La capacidad del aeropuerto "+aeropuerto.get_id()+" es menor a la solicitada, la misma es "+ aeropuerto.getCapacidad());
                }
            }

            for (Aeropuerto aeropuerto : aeropuertosConCapacidadMayor) {
                System.out.println("Aeropuerto: " + aeropuerto.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }




}