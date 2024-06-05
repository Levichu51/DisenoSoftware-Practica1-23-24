package e2;

public class ImmutableMatrix {
    private final int[][] matrix;

    public ImmutableMatrix(int[][] matriz) {

        if(matriz == null){
            throw new IllegalArgumentException("Array nulo");

        }else if(matriz.length == 0){
            throw new IllegalArgumentException("Array vacío");

        }else{
            for(int i = 0; i < matriz.length; i++){
                if(matriz[i].length != matriz[0].length){
                    throw new IllegalArgumentException("Matriz irregular");
                }
            }
        }

        matrix = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matrix[i][j] = matriz[i][j]; //copia de la matriz
            }
            //System.arraycopy(arr[i], 0, matrix[i], 0, arr.length);
            //matrix[i][j] = arr[i][j];
        }
    }

    public ImmutableMatrix(int row, int column) {
        int num = 1;

        if(row <= 0 || column <= 0){
            throw new IllegalArgumentException("Los valores no son válidos");
        }

        matrix = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
    }

    public String toString(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < rows; i++){
            str.append("[");

            for(int j = 0; j < columns; j++){
                str.append(matrix[i][j]);

                if(j < columns - 1){
                    str.append(", ");
                }
            }
            str.append("]");
            if(i < rows - 1){
                str.append("\n");
            }
        }
        str.append("\n");

        return str.toString();

    }

    public int at(int row, int column){

        if(row <= 0 || matrix.length < row || matrix[0].length < column || column <= 0){
            throw new IllegalArgumentException("Los valores no son válidos");
        }
        return matrix[row][column];
    }

    public int rowCount(){
        if(matrix.length == 0){
            return 0;
        }
        return matrix.length;
    }

    public int columnCount(){
        if (matrix.length == 0){
            return 0;
        }else{
            return matrix[0].length;
        }
    }

    public int [][] toArray2D(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] copy = new int [rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                copy[i][j] = matrix[i][j]; //copia la matriz del constructor a una varaible copy que es un tipo int [][]
            }
        }
        return copy;

    }

    public ImmutableMatrix reverse(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] reversed = new int [rows][columns];

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                reversed[i][j] = matrix[i][columns - 1 - j];
            }
        }
        return new ImmutableMatrix(reversed);
    }

    public ImmutableMatrix transpose(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int [][] transposed = new int [columns][rows];


        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                transposed[j][i] = matrix[i][j];

            }
        }
        return new ImmutableMatrix(transposed);
    }


    public ImmutableMatrix reshape(int reColumns){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row2 = 0;
        int col2 = 0;

        if(rows * columns % reColumns != 0){
            throw new IllegalArgumentException("No es una matriz regular");
        }

        int reRows = rows * columns / reColumns;
        int[][] reshaped = new int [reRows][reColumns];


        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                reshaped[row2][col2] = matrix[i][j];
                col2++;

                if(col2 == reColumns){
                    col2 = 0;
                    row2++;
                }
            }
        }
        return new ImmutableMatrix(reshaped);
    }





}
