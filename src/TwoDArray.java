public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = {
                {12,45,71},
                {190,343,291},
                {180,873}};
        int firstElement = arr[0][0];

        int firstRow = arr.length -1;
        int lastRow = arr[firstRow].length - 1;
        System.out.println(firstRow);

        System.out.println(lastRow);

        int lastElement = arr[firstRow][lastRow];

//        System.out.println(firstElement);

        System.out.println(lastElement);
    }
}
