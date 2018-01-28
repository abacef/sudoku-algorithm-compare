public class Semihuman {

    int row;

    int col;
    
    int[][] board;

    int[][] boardCpy;

    LinkedList<Integer>[][] posi;

    public Semihuman(int[][] s) {
        board = s;
        for (int i = 0; i < 9; i++) {
            System.arraycopy(board[i], 0, boardCpy[i], 0, 9);
        }
        
    }
    public static void main(String[] args) {
        int[] s10 = {0, 0, 7, 0, 5, 0, 0, 9, 3};
        int[] s11 = {5, 8, 0, 7, 0, 0, 1, 6, 0};
        int[] s12 = {9, 0, 6, 8, 0, 3, 0, 2, 0};
        int[] s13 = {1, 0, 0, 0, 0, 0, 6, 0, 0};
        int[] s14 = {8, 6, 0, 0, 0, 0, 0, 7, 2};
        int[] s15 = {0, 0, 2, 0, 0, 0, 0, 0, 1};
        int[] s16 = {0, 5, 0, 3, 0, 9, 7, 0, 8};
        int[] s17 = {0, 2, 8, 0, 0, 4, 0, 1, 9};
        int[] s18 = {3, 9, 0, 0, 7, 0, 2, 0, 0};
        int[][] s1 = {s10, s11, s12, s13, s14, s15, s16, s17, s18};
        Semihuman semi1 = new Semihuman(s1);
    }
}
