public class Sum {
    public int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public Sum() {
        int[] arr1 = {1,2,3,2,4,5,1};
        int[] arr2 = {1,2,3,4};
        System.out.println("Array1 has sum:"+arraySum(arr1));
        System.out.println("Array2 has sum:"+arraySum(arr2));
    }
}
