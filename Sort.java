public class Sort{
    public static void sort(int[] data)
    {
       
        for (int i = 0; i < data.length; i++) 
        {
            int minIndex=i;
            for(int j=i+1;j<data.length ;j++)
            {
                if(data[minIndex]>data[j]){
                    minIndex=j;
                }
            }

            int temp=data[minIndex];
            data[minIndex]=data[i];
            data[i]=temp;
        }
    }
}