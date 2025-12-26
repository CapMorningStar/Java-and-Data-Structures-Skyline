/**
    A class of bags whose entries are stored in a fixed-size array.
    no security checks
    @author Frank M. Carrano
 @version 4.0
*/
public class ArrayBag<T> implements BagInterface<T>
{
   private final T[] bag;
   private int numberOfEntries;
   private static final int DEFAULT_CAPACITY = 25;


   /** Creates an empty bag whose capacity is 25. */
   public ArrayBag() 
   {
      this(DEFAULT_CAPACITY);
   } // end default constructor



   /** Creates an empty bag having a given capacity.
   @param capacity  The integer capacity desired. */
   public ArrayBag(int desiredCapacity)
   {

      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
         T[] tempBag = (T[])new Object[desiredCapacity]; // Unchecked cast
      bag = tempBag;
      numberOfEntries = 0;
   } // end default constructor



   /** Gets the current number of entries in this bag.
         @return  The integer number of entries currently in the bag. */
   public int getCurrentSize()
   {
      return numberOfEntries;
   } // end getCurrentSize



   /** Sees whether this bag is empty.
       @return  True if the bag is empty, or false if not. */
   public boolean isEmpty()
   {
      return numberOfEntries == 0;
   } // end add



   /** Adds a new entry to this bag.
      @param newEntry  The object to be added as a new entry.
      @return  True if the addition is successful, or false if not. */
   public boolean add(T newEntry)
   {
      boolean result = true;
      if (isArrayFull())
      {
         result = false;
      }
      else
      {
         bag[numberOfEntries] = newEntry;
         numberOfEntries++;
      } // end if

      return result;
   } // end add



    /** Removes one unspecified entry from this bag, if possible.
       @return  The removed entry if the removal was successful, or null. */
    public T remove()
    {
        T result = null;
        if (numberOfEntries > 0)
        {
           result = bag[numberOfEntries - 1]; // Entry to remove
           bag[numberOfEntries - 1] = null;   // Remove reference to last entry
           numberOfEntries--;
        } // end if

        return result;
    } // end remove



   /** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  True if the removal was successful, or false if not. */
   public boolean remove (T anEntry)
   {
      int index = getIndexOf (anEntry);
      T result = removeEntry (index);
      return anEntry.equals (result);
   }



   /** Removes all entries from this bag. */
   public void clear()
   {
      while (!isEmpty()) 
         remove();
      numberOfEntries = 0;
   } // end clear



   /** Counts the number of times a given entry appears in this bag.
       @param anEntry  The entry to be counted.
       @return  The number of times anEntry appears in the bag. */
   public int getFrequencyOf(T anEntry)
   {
      int counter = 0;
      for (int index = 0; index < numberOfEntries; index++) 
      {
         if (anEntry.equals(bag[index]))
         {
            counter++;
         } // end if
      } // end for

      return counter;
   } // end getFrequencyOf



   /** Tests whether this bag contains a given entry.
       @param anEntry  The entry to locate.
       @return  True if the bag contains anEntry, or false if not. */
   public boolean contains(T anEntry)
   {
      int index = getIndexOf(anEntry);
      boolean contained = false;
      if (index != -1) 
      {
         contained = true;
      }
      return contained;
   } // end contains


   /** Retrieves all entries that are in this bag.
       @return  A newly allocated array of all the entries in this bag. */
   public T[] toArray()
   {
      // The cast is safe because the new array contains null entries.
      @SuppressWarnings("unchecked")
         T [] result = (T[]) new Object [numberOfEntries];
         for (int index=0;  index<numberOfEntries;  ++index)
         {
            result[index] = bag [index];
         }
      return result;
   } // end toArray



   /** Returns true if the array bag is full, or false if not.
       @return  True if the bag is full, or false if not. */
   private boolean isArrayFull()
   {
      return numberOfEntries >= bag.length;
   } // end isArrayFull




   /** Removes one occurrence of a given entry from this bag.
       @param anEntry  The entry to be removed.
       @return  The entry that was removed or null if hte bag was empty */
   private T removeEntry(int givenIndex)
   {
      T result = null;
      if (!isEmpty() && (givenIndex >= 0))
      {
         result = bag[givenIndex];                   // Entry to remove
         bag[givenIndex] = bag[numberOfEntries - 1]; // Replace entry with last entry
         bag[numberOfEntries - 1] = null;            // Remove last entry
         numberOfEntries--;
      } // end if
      
      return result;
     } // end removeEntry   
    


   /**  Gets the index of an item in the bag.
        @param anEntry  The item to find
        @return  The index into bag where anEntry was found. */
   private int getIndexOf (T anEntry)
   {
      int where = -1;
      boolean stillLooking = true;
      int index = 0;
      while (stillLooking  &&  (index < numberOfEntries))
         {
            if (anEntry.equals (bag [index]))
               {
               where = index;
               stillLooking = false;
               }
         ++index;
         }
      return where;
   }

} // end ArrayBag
