package binary_search;

public class Main {
    public static String binarySearch(Integer[] listNumber, Integer value){
        int low = 0;
        int high = listNumber.length - 1;

        while (low <= high) {
            int mid = (low + high) /2;
            int kick = listNumber[mid];

            if(kick == value){
                return "Value: " + kick + ". Index: " + mid + ".";
            }

            if(kick > value){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Integer[] arrNumber = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Result: " + binarySearch(arrNumber,2));
    }
}