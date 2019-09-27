public class Ex5 {
    public static void main(String[] args) {
        String[][] chessBoard= new String[8][8];

        for(int i =0; i<8; i++){
            for(int j=0; j<8; j++){

                if(((j-i)%2) == 0){
                    chessBoard[i][j] = "|WW|";
                }
                else{
                    chessBoard[i][j] = "|BB|";
                }
            }
        }

        for(int i =0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
