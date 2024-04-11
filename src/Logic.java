public class Logic {
    private int [][] board = {{0,0,0},{0,0,0},{0,0,0}};

    public void insert(int type, int x, int y){
        board[x][y] = type;
    }

    public int getBoardLength(){return board[0].length;}

    public int getBoardHeight(){return board.length;}

    public int[][] getBoard(){
        return board;
    }

}
