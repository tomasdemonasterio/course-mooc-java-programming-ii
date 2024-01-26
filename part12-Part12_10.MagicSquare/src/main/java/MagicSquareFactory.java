
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int column = square.getWidth() / 2;
        for (int i = 0; i < size * size; i++) { 
            int oldColumn = column;
            int oldRow = row;
            
            if (row < 0) {
                row = size - 1;
            }

            if (column >= size) {
                column = 0;
            }
            
            int value = square.readValue(column, row);
             if (value != 0 ) {
                row = oldRow + 2;
                column = oldColumn - 1;
            }
             
            square.placeValue(column, row, i + 1);
            row--;
            column++;
        }
        

        square.placeValue(-1, square.getWidth() + 1, 2);
        return square;
    }

}
