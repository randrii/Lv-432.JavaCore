public class practice {
    public static void main(String[] args) {
        int[] arr = {-23,1,2,3,4};
        int max = arr[0];
        int sum = 0;
        int pcount = 0;
        int ncount = 0;
        for (int i : arr){
            if (max<i){
                max = i;
            }
            if(i>0){
                sum+=i;
                pcount++;
            }
            if (i<0){
                ncount++;
            }
        }

        System.out.println("Max item is "+max);

        System.out.println("Sum of positive numbers is "+sum);
        System.out.println("Amount of negative numbers is "+ncount);
        System.out.println(""+(pcount > ncount? pcount: ncount));
    }
}
