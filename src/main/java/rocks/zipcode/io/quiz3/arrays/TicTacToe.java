package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][]board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        List<String> column = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            column.add(board[i][value]);
        }
        return column.toArray(new String[0]);
    }


    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (*arr[i] == arr[i][1] && arr[i][1] == arr[i][2])
        if ((ret = *arr[i]) != 'T')
        return ret;
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }
}
