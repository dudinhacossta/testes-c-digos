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
    }
           
        public static void matrizNumero(int [][] numeros) {
            for (int i = 0; i <= numeros.length; i++){
                for (int n = 0; n <= numeros.length; n++){
                    System.out.printf("%4d", numeros [i][n] );
        }  
                {
                    System.out.println(" ");
                }
    }
}
        public static void alfabeto (String[][] alfabeto01){
            for (int p = 0; p < alfabeto01.length; p++){
                for (int q = 0; q < alfabeto01.length; q++){
                    System.out.printf("%4s", alfabeto01 [p][q] );
                }
                {
                    System.out.println(" ");
                }
            }
        }

}