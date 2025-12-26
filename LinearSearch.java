
public class LinearSearch {
    
    public static void main(String[] args) {
        
        int[] numbers={51,60, 43, 72, 83,12};
        int searchkey=12;
        int result;
        for(int i=0;i<numbers.length;i++){
            if(searchkey == numbers[i]){
                result=i;
                System.out.println("Your number is in room "+result);

            }
        }
        
      
    }
}
