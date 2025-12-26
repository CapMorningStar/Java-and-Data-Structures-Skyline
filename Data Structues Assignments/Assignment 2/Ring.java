//KYAW SOE LWIN
//30 January 2025
//Lab2
// The program is an interface for a ring ADT

/**
 
 * Interface for a Ring ADT
 * @param<E> The type of elemets stored in the ring
 */

 public interface Ring<E>
 {
    /**
     * Moves the current position to the next position
     * The ring is never empty, so there will always be a next position.
     */
     void advance();

    /**
     * Returns the current element at the cursor.
     * Since the ring cannot be empty, this method will never return null.
     *@return the current element
     */
      E getCurrent();

    /**
     * Adds a new element to the ring after the current position
     * @param element the element to be added
     */
        void add(E element);
    /**
     * Removes the current element from the ring and returns it.
     * Since the ring cannot be empty, this will always remove and return an element.
     *@return the removed element 
     */
     E remove();

 }