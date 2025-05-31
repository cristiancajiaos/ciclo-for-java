package ciclo.pkgfor;

public class CicloFor {

    public static void main(String[] args) {
        
        // Primer ejemplo 
        /*
        for (int i = 1; i <= 10; i++) {
            // Instrucciones
            System.out.println("Número " + i);
        }
        */
        
        // Segundo ejemplo
        int numeroBase = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroBase + " * " + i + " = " + (numeroBase * i));
        }

    }

}
