public class Main {
    public static void main(String[] args) {

        int arreglo[][] = new int[4][5];


        //Carga

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                arreglo[i][j] = i + j;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(" "+arreglo[i][j]);

            }
            System.out.println();

        }
        



    }
}