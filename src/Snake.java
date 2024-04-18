public class Snake {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] field = new int[n][m];

        int[][] obstacles = {{0, 2}};

        int x = 0;
        int y = 0;
        int direction = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int num = 1;

        while (num <= n * m) {
            field[x][y] = num;


            int nx = x + dx[direction];
            int ny = y + dy[direction];


            if (nx < 0 || nx == n || ny < 0 || ny == m || field[nx][ny] != 0) {

                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            boolean isObstacle = false;
            for (int[] obstacle : obstacles) {
                if (nx == obstacle[0] && ny == obstacle[1]) {
                    isObstacle = true;
                    break;
                }
            }

            if (isObstacle) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            x = nx;
            y = ny;
            num++;
        }


        for (int[] row : field) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}