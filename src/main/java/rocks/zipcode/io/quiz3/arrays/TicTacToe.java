package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;
    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {

        return this.board[value];
    }

    public String[] getColumn(Integer value) {
        String[] strings = new String[3];
        for(int i = 0; i < 3; i++) {
            strings[i] = board[i][value];
        }
        return strings;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        if(row[0].equals(row[1]) && row[1].equals(row[2])) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String[] coloumn = getColumn(columnIndex);
        if(coloumn[0].equals(coloumn[1]) && coloumn[1].equals(coloumn[2])) {
            return true;
        }
        return false;
    }

    public String getWinner() {

        // Diagonal
        boolean isDiagonal = (board[0][0] == board[1][1]) && (board[0][0] == board[2][2]);
        isDiagonal = isDiagonal || (board[0][2] == board[1][1] && board[0][2] == board[2][0]);
        if (isDiagonal) {
            return board[1][1];
        }

        for (int i=0; i<3; i++) {
            if(isRowHomogenous(i)) {
                return board[i][0];
            }
            if(isColumnHomogeneous(i)) {
                return board[0][i];
            }
        }

        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
