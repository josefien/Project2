
import java.awt.Color;
import java.util.ArrayList;

public class Board {

    int counter1 = 0, counter2 = 0;
    Position[][] board = new Position[17][13];

    public Board() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = new Position(i, j);

                if (i == 0 || i == 16) {
                    if (j != 6) {
                        board[i][j] = null;
                    }
                }
                if (i == 1 || i == 15) {
                    if (j < 5 || j > 6) {
                        board[i][j] = null;
                    }
                }
                if (i == 2 || i == 14) {
                    if (j < 5 || j > 7) {
                        board[i][j] = null;
                    }
                }
                if (i == 3 || i == 13) {
                    if (j < 4 || j > 7) {
                        board[i][j] = null;
                    }
                }
                if (i == 5 || i == 11) {
                    if (j == 12) {
                        board[i][j] = null;
                    }
                }
                if (i == 6 || i == 10) {
                    if (j == 0 || j == 12) {
                        board[i][j] = null;
                    }
                }
                if (i == 7 || i == 9) {
                    if (j < 1 || j > 10) {
                        board[i][j] = null;
                    }
                }
                if (i == 8) {
                    if (j < 2 || j > 10) {
                        board[i][j] = null;

                    }

                }
            }
        }

    }

    public void setInitialPositions(Player... players) {
        // this method fills the board with the pieces of the players that play
        // the game.
        if (players.length == 2) {
            fillTriangle(1, players[0].getColor());
            fillTriangle(4, players[1].getColor());
        }
        if (players.length == 3) {
            fillTriangle(1, players[0].getColor());
            fillTriangle(3, players[1].getColor());
            fillTriangle(5, players[2].getColor());

        }
        if (players.length == 4) {
            fillTriangle(1, players[0].getColor());
            fillTriangle(2, players[2].getColor());
            fillTriangle(4, players[1].getColor());
            fillTriangle(5, players[3].getColor());

        }
        if (players.length == 6) {
            fillTriangle(1, players[0].getColor());
            fillTriangle(2, players[1].getColor());
            fillTriangle(3, players[2].getColor());
            fillTriangle(4, players[3].getColor());
            fillTriangle(5, players[4].getColor());
            fillTriangle(6, players[5].getColor());

        } else {
            System.out.println("fail");
        }
    }

    private void fillTriangle(int number, Colors color) {
        Piece piece = new Piece(color);
        if (number == 1) {
            for (int i = 0; i < 4; i++) {
                for (int j = 4; j < 8; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
        }
        if (number == 2) {
            for (int i = 4; i < 8; i++) {
                for (int j = 10; j < board[0].length; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
            board[4][9].setPiece(piece);
            board[5][9].setPiece(piece);
        }
        if (number == 3) {
            for (int i = 9; i < 13; i++) {
                for (int j = 10; j < board[0].length; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
            board[11][9].setPiece(piece);
            board[12][9].setPiece(piece);
        }
        if (number == 4) {
            for (int i = 13; i < board.length; i++) {
                for (int j = 4; j < 8; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
        }
        if (number == 5) {
            for (int i = 10; i < 13; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
            board[9][1].setPiece(piece);
            board[12][3].setPiece(piece);
        }
        if (number == 6) {
            for (int i = 4; i < 7; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != null) {
                        board[i][j].setPiece(piece);
                    }
                }
            }
            board[4][3].setPiece(piece);
            board[7][1].setPiece(piece);

        }

    }

    private ArrayList getPosition(Position from) {
        ArrayList positions = new ArrayList(6);
        // defining positions
        Position right = board[from.getY()][from.getX() + 1];
        Position rightJump = board[from.getY()][from.getX() + 2];
        Position left = board[from.getY()][from.getX() - 1];
        Position leftJump = board[from.getY()][from.getX() - 2];
        Position rightUp,rightUpJump, leftUp, leftUpJump, rightDown, rightDownJump, leftDown, leftJumpDown;       
        if (from.getY() % 2 == 1) {
            rightUp = board[from.getY() - 1][from.getX() + 1];
            rightUpJump = board[from.getY() - 2][from.getX() + 1];
            leftUp = board[from.getY() - 1][from.getX()];
            leftUpJump = board[from.getY() - 2][from.getX() - 1];
            rightDown = board[from.getY() + 1][from.getX() + 1];
            rightDownJump = board[from.getY() + 2][from.getX() + 1];
            leftDown = board[from.getY() + 1][from.getX()];
            leftJumpDown = board[from.getY() + 2][from.getX() - 1];
        } else {
            rightUp = board[from.getY() - 1][from.getX()];
            rightUpJump = board[from.getY() - 2][from.getX() + 1];
            leftUp = board[from.getY() -1][from.getX() - 1];
            leftUpJump = board[from.getY() -2][from.getX() - 1];
            rightDown = board[from.getY() + 1][from.getX()];
            rightDownJump = board[from.getY() + 2][from.getX() + 1];
            leftDown = board[from.getY() + 1][from.getX() - 1];
            leftJumpDown = board[from.getY() + 2][from.getX() - 1];
        }


        //if (to.isEmpty() && from != to) {
        //check the position on the left 
        if (left  != null ) {
            if (left.isEmpty()) {
                positions.add(left);
            } else if (leftJump != null && leftJump.isEmpty()) {
                positions.add(leftJump);
            }
        }
        //check the position on the right
        if (right != null) {
            if (right.isEmpty()) {
                positions.add(right);
            } else if (rightJump != null && rightJump.isEmpty()) {
                positions.add(rightJump);
            }
        }

        if (rightUp != null) {
            if (rightUp.isEmpty()) {
                positions.add(rightUp);
            } else if (rightUpJump != null && rightUpJump.isEmpty()) {
                positions.add(rightUpJump);
            }
        }

        if (leftUp != null) {
            if (leftUp.isEmpty()) {
                positions.add(leftUp);
            } else if (leftUpJump != null && leftUpJump.isEmpty()) {
                positions.add(leftUpJump);
            }
        }

        if (rightDown  != null) {
            if (rightDown.isEmpty()) {
                positions.add(rightDown);
            } else if (rightDownJump != null && rightDownJump.isEmpty()) {
                positions.add(rightDownJump);
            }
        }

        if (leftDown != null) {
            if (leftDown.isEmpty()) {
                positions.add(leftDown);
            } else if (leftJumpDown != null && leftJumpDown.isEmpty()) {
                positions.add(leftJumpDown);
            }
        }
        return positions;
    }

    public void movePiece(Position from, Position to) {

        // TODO add check whether it's a legitimate move in both ways (jumping
        // over someone or roll over) and whether it's the piece of the right
        // player
        if (to.isEmpty() && from != to) {
            to.setPiece(from.getPiece());
            from.setPiece(null);
            
        }

    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }
}