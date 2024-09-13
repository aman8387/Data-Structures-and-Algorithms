class Solution {
    public int[][] transpose(int[][] Mat) {
        int [][] newMat = new int [Mat[0].length][Mat.length];
        for(int i = 0 ; i< Mat.length ; i++){
            for(int j = 0 ; j<Mat[0].length ; j++){
                newMat[j][i] = Mat[i][j];
            }
        }
    return newMat;
    }
}