public class ExceptionTest{
    public static void main(String[] args) {
        int[] numbers={1,2,3};
        try {
            System.out.println(numbers[3]);
        } catch ( e) {
            System.out.println("Exception Type: "+e.getMessage());
        }finally{
            System.out.println("Process Done");
        }

        
    }
}