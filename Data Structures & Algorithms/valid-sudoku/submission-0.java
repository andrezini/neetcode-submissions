
class Solution {

    public boolean isValidSudoku(char[][] board) {
        return validRows(board)
                && validColumns(board)
                && validBoxes(board);
    }

    private boolean validRows(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char value = board[row][col];

                if (value == '.') {
                    continue;
                }

                if (seen.contains(value)) {
                    return false;
                }

                seen.add(value);
            }
        }

        return true;
    }

    private boolean validColumns(char[][] board) {
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char value = board[row][col];

                if (value == '.') {
                    continue;
                }

                if (seen.contains(value)) {
                    return false;
                }

                seen.add(value);
            }
        }

        return true;
    }

    private boolean validBoxes(char[][] board) {
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                Set<Character> seen = new HashSet<>();

                for (int row = boxRow; row < boxRow + 3; row++) {
                    for (int col = boxCol; col < boxCol + 3; col++) {

                        char value = board[row][col];

                        if (value == '.') {
                            continue;
                        }

                        if (seen.contains(value)) {
                            return false;
                        }

                        seen.add(value);
                    }
                }
            }
        }

        return true;
    }
}