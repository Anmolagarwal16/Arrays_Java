public class Array_largest_Number {
    public static int largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[]={1,4,2,9,3,97,2,6,79};
        System.out.println(largest(number));
    }
}
