
public class BinarySearch {
    public static void sort(int[] data){
        for(int i=0;i<data.length-1;i++)
        {  
            int minindex=i;
            for(int j=i+1;j<data.length;j++){
                if(data[j]<data[minindex]){
                    minindex=j;
                }
            }
            int temp=data[minindex];
            data[minindex]=data[i];
            data[i]=temp;

        }
    }
        


    public static void main(String[] args) {
        int[] numbers={15,3,2,8,14,1};
        sort(numbers);

        for(int num: numbers)
        System.out.print(num+ " ");

    }
}
