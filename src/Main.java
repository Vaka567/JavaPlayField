import java.util.HashSet;
//importing the utility function HashSet
class DuplicateCheckers{
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
        int[] arr1 = {1,2,3,2,4,5,1};
        int[] arr2 = {1,2,3,4};
        System.out.println("Array1 has duplicates:"+hasDuplicates(arr1));
        System.out.println("Array2 has duplicates:"+hasDuplicates(arr2));


    }
}

