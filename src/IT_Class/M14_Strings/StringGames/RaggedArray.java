package IT_Class.M14_Strings.StringGames;

import java.util.Arrays;

public class RaggedArray {
    public static void main(String[] args) {
        //int[][] arr={{1,2,3},{1,2},{1}};
        //System.out.println(Arrays.deepToString(arr));

        String s = "JaggedEdge";
        //{J}; {J,a}; {J,a,g}
        char[][] arr = new char[s.length()][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new char[i+1];
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
