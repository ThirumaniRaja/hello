import java.util.LinkedList;

public class Demo {
    public static void main(String[] args){

        int secret = (int) (Math.random() * 100) + 1;
        System.out.println("secret number is "+secret);
        LinkedList<Integer> myList= new LinkedList<>();


        int [][] myarray = new int[3][5];
        for (int i = 0; i < myarray.length; i++) {         // rows
            for (int j = 0; j < myarray[i].length; j++) {  // columns
                myarray[i][j] = i + j;
                System.out.print(myarray[i][j] + " ");
            }
            System.out.println();
        }

//      for(int i = 0; i <= 100; i++){
//           if(i == secret){
//               System.out.println("success");
//               return;
//           } else if( i > secret){
//               System.out.println("Higher");
//           } else if( i < secret){
//               System.out.println("Smaller");
//           } else {
//               System.out.println("else");
//           }
//
//
//       }

    }
}
