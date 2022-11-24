import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Main
{
    static Scanner lectura = new Scanner (System.in);

    static int longitud = 10;
    static StringBuffer cadena = cadenaRandom(longitud);




    public static void main(String[] args)
    {
        System.out.println("Ingrese el tipo: (TipoA) o (TipoB)");
        String condicion = lectura.next();
        System.out.println(entrada(cadena.toString()));


        List<String> ListadeCarteres = new ArrayList<>();

        ListadeCarteres.add("Juan");
        ListadeCarteres.add("Pedro");
        ListadeCarteres.add("Jorge");
        ListadeCarteres.add("Daniela");
        ListadeCarteres.add("Gladys");

        System.out.println("Ingrese un nombre");
        String entradaNombre = lectura.next();
        System.out.println(PuntoB(entradaNombre, ListadeCarteres));
    }

    public static String entrada(String condicion)
    {

        if (condicion.equals("TipoA")||condicion.equals("TipoB"))
        {
            if (condicion.equals("TipoA")) {
                cadena.setCharAt(0, '5');
                cadena.setCharAt(1, '4');
            }

            if (condicion.equals("TipoB")) {
                cadena.setCharAt(0, '0');
                cadena.setCharAt(1, '8');
            }
        }
        return cadena.toString();
    }

    public static StringBuffer cadenaRandom(int longitud)
    {
        StringBuffer banco = new StringBuffer("0123456789");
        StringBuffer cadena = new StringBuffer ("");

        for (int x = 0; x < longitud; x++)
        {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena.append(caracterAleatorio);
        }

        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo)
    {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static boolean PuntoB(String entradaNombre,List<String> ListadeCarteres)
    {

        if (ListadeCarteres.contains(entradaNombre))
        {
            return false;
        }
        else
        {
            return true;
        }
    }


}