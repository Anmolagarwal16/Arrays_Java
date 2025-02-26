public class Array_smallest_Number {
    public static int smallest(int number[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i] < smallest) {
                smallest = number[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int number[]={1,4,2,9,3,97,2,6,79,-89};
        System.out.println(smallest(number));
    }
}
