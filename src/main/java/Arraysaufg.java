public class Arraysaufg {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        int sum = 0;
        int sum1 = 0;
        int biggestNumber = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {   // hier kann <=numbers.length - 1 oder < numbers.length
            numbers[i] = i + 1;
            sum = numbers[i] + sum;

        }
        //System.out.println(sum);
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (biggestNumber < numbers[i]) {
                biggestNumber = numbers[i];
            }
        }
        //System.out.println(biggestNumber);
        int[] zahlen2 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};


        int[] test = new int[10];
        int position = 0;
        for (int i = 11; i < 21; i++) {
            test[position] = i;
            System.out.println(test[position]);
            position++;
        }

        for (int i = 0 ;i < zahlen2.length; i ++ ){
           sum1 += numbers[i] + zahlen2[i];

        }

        int[] sum3 = new int[10];
        for (int i = 0; i < sum3.length; i++){
            sum3[i] = numbers[i] + zahlen2[i];
            // System.out.println(sum3[i]);
        }
    }
}