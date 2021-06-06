
/**

 */
public class Matriz
{
    private int[][] matriz;
    public Matriz(int filas, int columnas){
        matriz = new int[filas][columnas];
        
    }

    public void imprimirMatriz(){
          for(int fil = 0; fil < matriz.length ;fil++ ){
            for(int col = 0; col < matriz[0].length; col++){
                System.out.print(matriz[fil][col] + "\t");
            }
             System.out.println();
        }
    }
    
    public void recorridoCaracol(){
         int filInicio = 0;
         int filFin = matriz.length - 1;
         int colInicio = 0;
         int colFin = matriz[0].length - 1;
         int contador = 1;
         
         while(filInicio<=filFin && colInicio<=colFin){
             //Izquierda - Derecha
             for(int col = colInicio ; col<= colFin; col++){
                 matriz[filInicio][col] = contador;
                 contador++;
             }
             //Arriba - Abajo
             for(int fil = filInicio+1; fil<= filFin; fil++){
                 matriz[fil][colFin] = contador;
                 contador++;
             }
             //Derecha - Izquierda
             for(int col = colFin - 1; col>=colInicio; col--){
                 matriz[filFin][col] = contador;
                 contador++;
             }
             //Abajo - Arriba
             for(int fil = filFin - 1; fil>=filInicio+1; fil--){
                 matriz[fil][colInicio] = contador;
                 contador++;
             }
             filInicio++;
             filFin--;
             colInicio++;
             colFin--;
             
         }
         imprimirMatriz();
         System.out.println("\n");
    }
    
    public void diagonalPrincipalYSecundaria(){
        int dato = 1;
        int n= 0 ,m =matriz[0].length -1 ;
        for(int fil = 0; fil<matriz.length; fil++){
            for(int col = 0; col<matriz[0].length; col++){
                if(fil == col){
                    matriz[fil][col] = dato;
                  }
                if(fil == n && col == m){
                      matriz[fil][col] = dato;
                      n++;
                      m--;
                }

                
            }
        }
        imprimirMatriz();
         System.out.println("\n");
    }
}
