
public class AutoRickshaFareCalc {
    public static void main(String[] args) {
        int distance = 15;
        int fare = calculateFare(distance);
        int[] arr = {14, 12, 16};
        int maxVal = maxValue(arr);

        System.out.println("Distance: " + distance);
        System.out.println("Fare" + fare);
        System.out.println("maxValue" + maxVal);


    }


    public static int calculateFare(int km) {
        int fare = 0;

        if (km <= 2) {
            fare = 30;
        } else if (km <= 10) {
            fare = 30 + (km - 2) * 13;
        } else {
            fare = 30 + (8 * 13) + (km - 10) * 15;
        }

        return fare;
    }

    public static int maxValue(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        int avg;
        for(int i = 1; i < arr.length; i++){
//            if(max <  arr[i] ){
                max += arr[i];
//            }
        }
        avg = max/arr.length;
        return avg;
    }

}
