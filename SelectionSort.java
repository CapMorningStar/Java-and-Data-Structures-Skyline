




public class SelectionSort{
    public static void main(String[] args) {
        int[] numbers={25,13,12,26,4,10,15};
        
        Sort.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}