package atividadeMatriz;

public class Questão01 {
     public static void main(String[] args) {

        int [][] numeros = {
            {19, 25, 100, 99,}, 
            {10, 7, 25, 14,}, 
            { 35, 2, 47, 74,}    
        };
            matrizNumero (numeros);

        String[][] alfabeto01 = {
            {"a", "b", "c", "d", "e",}, 
            {"f", "g", "h", "i", "j",} 

        };
             alfabeto (alfabeto01);

        double [][] imprimirNumero = {
            {1.9, 2.5, 10.0,},
            {1.0, 7.8, 2.5,},
            {3.5, 2.2, 4.7,}
        };
            numerosDouble (imprimirNumero);
    }
           
        public static void matrizNumero(int [][] numeros) {
            for (int i = 0; i < numeros.length; i++){
                for (int n = 0; n < numeros[i].length; n++){
                    System.out.printf("%4d", numeros [i][n] );
        }  
                {
                    System.out.println(" ");
                }
    }
}
        public static void alfabeto (String[][] alfabeto01){
            for (int p = 0; p < alfabeto01.length; p++){
                for (int q = 0; q < alfabeto01[p].length; q++){
                    System.out.printf("%4s", alfabeto01 [p][q] );
                }
                {
                    System.out.println(" ");
                }
            }
        }

        public static void numerosDouble (double[][] imprimirNumero){
            for (int s = 0; s < imprimirNumero.length; s++){
                for (int t = 0; t < imprimirNumero[s].length; t++){
                    System.out.printf("%6.1f", imprimirNumero [s][t] );
                }
                {
                    System.out.println(" ");
                }
            }
        }

}