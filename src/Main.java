import java.util.HashSet;

public class Main {
    public static boolean hasDuplicates(int[] arr){
        //hasduplicates is a method where we give integers as input and gets boolean as output
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println("Hello world");
        Sum sum1 = new Sum();
        int[] arr3 = {6,7,8,9};
        System.out.println("Array-x has sum:"+sum1.arraySum(arr3));
        int[] arr1 = {1,2,3,2,4,5,1};
        int[] arr2 = {1,2,3,4};
        System.out.println("Array1 has duplicates:"+hasDuplicates(arr1));
        System.out.println("Array2 has duplicates:"+hasDuplicates(arr2));
    }
}