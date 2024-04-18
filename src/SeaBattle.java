




public class SeaBattle {
    private static final int[][] field = new int[][]{
            {0, 0, 0, 1, 1, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0, 0}};

    private static final int[][] moves = {{2, 1}, {1, 3}}; // Примеры ходов

    public static void main(String[] args) {
        int hits = 0;
        int totalShips = 2 + 3 + 4;
        while (hits < totalShips) {
            for (int[] move : moves) {
                int result = attack(move[0], move[1]);
                if (result == 1) {
                    hits++;
                } else if (result == 2) {
                    totalShips--;
                }
            }
        }
        System.out.println("Все корабли подбиты!");
    }

    private static int attack(int x, int y) {
        if (field[x][y] == 0) {
            System.out.println("Промах");
            return 0;
        } else if (field[x][y] == 1) {
            field[x][y] = 2; // Помечаем корабль как подбитый
            System.out.println("Попадание");
            return 1;
        } else {
            System.out.println("Корабль уже подбит");
            return 0;
        }
    }
}