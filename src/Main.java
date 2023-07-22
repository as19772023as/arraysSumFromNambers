import java.util.Arrays;

public class Main {

    public static int [] arrey = {5, 1, 3, 2, 7};
    public  static int sum = 10;

    public static void main(String[] args) {
        Main main = new Main();
        main.findToSum( arrey, sum);
    }
    public  int [] findToSum (int [] arrey, int sum){
        System.out.println(Arrays.toString(arrey));
       // Arrays.sort(arrey);
       // System.out.println(Arrays.toString(arrey));
        int leftIndex = 0;
        int rightIndex = arrey.length - 1;
        while (leftIndex < rightIndex){
            int foundedSum = arrey[leftIndex] + arrey[rightIndex];
            if(foundedSum == sum) {
                System.out.println(Arrays.toString(new int[]{arrey[leftIndex], arrey[rightIndex]}));
                return new int[]{arrey[leftIndex], arrey[rightIndex]};
            }
            if(foundedSum > sum)
                rightIndex --;
            else leftIndex ++;
            //System.out.println(Arrays.toString(arrey));
            }
        return new int[0];
        }
    }
