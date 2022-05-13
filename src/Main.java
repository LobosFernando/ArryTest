import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int CoorX = 0;
        int CoorY = 0;
        int Direccion = 0;
        char [] sopa = { 'S','O','P','A' };
        char [][] SopaLetras={
                {'C','A','S','A','A','A','A','A','A','A'},
                {'A','A','A','B','A','N','R','A','S','A'},
                {'C','A','L','A','B','A','Z','A','C','A'},
                {'A','A','A','C','A','A','A','A','O','R'},
                {'A','A','S','O','P','A','S','O','A','O'},//x,y 2-4
                {'R','E','C','E','T','A','A','A','A','P'},
                {'A','A','A','A','A','A','A','S','A','A'},
                {'P','E','R','C','H','E','R','O','A','A'},
                {'A','A','A','A','A','A','A','P','A','A'},
                {'Z','A','A','A','A','A','A','A','A','A'},
        };

        System.out.println("La palabra a buscar será SOPA");
        System.out.println("Ingrese la Coordenada X");
        CoorX=leer.nextInt();
        System.out.println("Ingrese la Coordenada Y");
        CoorY=leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese la Coordenada Dirección");
        System.out.println("Derecha = 1");
        System.out.println("Izquierda = 2");
        System.out.println("Arriba = 3");
        System.out.println("Abajo = 4");
        //Direccion=leer.nextInt();

        System.out.println("Mostrar " + SopaLetras[CoorY][CoorX]); // Imprimir

        char [] validar = new char[sopa.length];
        int flag = 0;

        for (int i = 0; i < sopa.length; i++) {
            System.out.print(SopaLetras[CoorY][CoorX+i]);
            validar[i] = SopaLetras[CoorY][CoorX+i];//Derecha
        }
        System.out.println(" ");
        for (int i = 0; i < sopa.length; i++) {
            if (validar[i] != sopa[i]){
                System.out.println("Incorrecto");
                break;
            }
            if(validar[i] == sopa[i]) {
                flag+=1;
            }
        }
        if (flag == sopa.length){
            System.out.println("Correcto");
        }



    }
}