public class SequentialSearch
{
    public int search (int [] theArray, int searchValue)
    {
        int foundPosn = -1;
        boolean found = false;
        int i = 0;
        while (!found  &&  i < theArray.length)
        {
            if (theArray [i] == searchValue)
            {
                found = true;
                foundPosn = i;
            }
            else
               i++;
        }
        return foundPosn;
    }
}

