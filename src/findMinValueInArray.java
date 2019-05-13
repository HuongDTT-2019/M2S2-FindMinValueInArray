public class findMinValueInArray {
    public static void main(String[] args) {
        int []arr={1,4,9,8,7,0};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValue(int []array){
        int index = 0;
        int min =array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }
}
