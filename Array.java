public class Array{
    public static void main(String[] args){
        int rows = 5;
        int columns = 3;
        
        int[][] array = new int[rows][columns];
        
        for(int i = 0; i<rows; i++)
            for(int j = 0; j<columns; j++)
                array[i][j] = 0;
        
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}

