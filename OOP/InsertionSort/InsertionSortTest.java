public class InsertionSortTest
{
    public static void main(String[] args) 
    {
        int[] array={5,2,15,8,1,7};
        InsertionSort structure=new InsertionSort();
        structure.sort(array);

        for(int a: array)
        {
            System.out.println(a);
        }

    }
}