public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int i = 0; i < array2d[0].length; i++){
            sum += array2d[0][i];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);
        for (int i = 0; i < array2d.length; i++){
            int sum = 0;
            for (int j = 0; j < array2d[i].length; j++){
                sum += array2d[i][j];
            }
            if (sum != checkSum){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);
        for (int j = 0; j < array2d[0].length; j++){
            int sum = 0;
            for (int i = 0; i < array2d.length; i++){
                sum += array2d[i][j];
            }
            if (sum != checkSum){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        checkSum = calculateCheckSum(array2d);
        int sum = 0;
        for (int i = 0; i < array2d.length; i++){
            sum += array2d[i][i];
        }
        if (sum != checkSum){
            return false;
        }
        sum = 0;
        for (int i = array2d.length - 1; i >= 0; i--){
            sum += array2d[i][i];
        }
        if (sum != checkSum){
            return false;
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int checkSum = calculateCheckSum(array2d);
        if (magicRows(array2d, checkSum) && magicColumns(array2d, checkSum) && magicDiagonals(array2d, checkSum)){
            return true;
        }
        return false;
    }

}
