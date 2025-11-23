package Activity;

public class SumArray {
    public static void main (String[] args){
        int[] myArr = {10,20,20};
        sumOfArraynAvg(myArr);

        int[][] grid = {
                {5, 2, 3,7},  // 17
                {1, 4, 6,0},  // 11
                {7, 8, 2,23}   // 40
                // 13,14,11
        };
        findMaxSums(grid);
    }

    public static void findMaxSums(int[][] grid){
        int maxRow = Integer.MIN_VALUE;
        int maxColumn = Integer.MIN_VALUE;
        for(int i =0; i < grid.length; i++){
            int sum = 0;
            for(int j =0; j < grid[i].length; j++) {
                sum += grid[i][j];
//                System.out.println("inside loop"+sum);
            }
            if(sum > maxRow){
                maxRow = sum;
            }


            int sumColumn = 0;
            // another loop with var k
            // start at 0, go till the length of the grid
            for(var k = 0; k < grid.length; k++) {
                sumColumn += grid[k][i];
            }
            if(maxColumn < sumColumn) {
                maxColumn = sumColumn;
            }

        }
        System.out.println("maxRow "+maxRow);
        System.out.println("maxColumn "+ maxColumn);

    }

    public static void sumOfArraynAvg(int[] arr){
        int sum = 0;
        double avg = 0;
        for(var i =0; i < arr.length; i++){
            sum += arr[i];
        }
        avg = (double) sum / arr.length;

        System.out.println("Sum is ="+sum);
        System.out.println("Avg is ="+avg);
    }
}
