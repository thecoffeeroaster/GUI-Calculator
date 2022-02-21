/************************************************************************************************
 * CLASS: Queue (Queue.java)
 *
 * DESCRIPTION
 * This class file represents the queue data structure which uses FIFO to order/access
 * the data elements.
 *
 * COURSE AND PROJECT INFORMATION
 * CSE 205 Object-Oriented Programming and Data Structures, Spring A 2022
 * Project Number: project-4
 *
 * AUTHORS: Joshua McKenzie, ASU ID: 1209056897, jsmckenz@asu.edu
 *        | Sean Loehr, ASU ID: 1222435526, smloehr@asu.edu
 ************************************************************************************************/

/**
 * Implements a generic queue data structure using a DList to store the elements.
 */
public class Queue<E> {

    private DList<E> mList;

    /**
     * Creates a new empty Queue by creating a new empty DList.
     */
    public Queue() {
        setList(new DList<>());
    }

    /**
     * Removes all of the elements from this Queue. After clear() returns this Queue is empty.
     */
    public void clear() {
        getList().clear();
    }

    /**
     * Removes and returns the element that is at the front of this Queue.
     */
    public E dequeue() {
        E front = getList().remove(0);
        return front;
    }

    /**
     * Adds pData to the rear of this Queue.
     */
    public void enqueue(E pData) {
        getList().append(pData);
    }

    /**
     * Accessor method for mList.
     */
    protected DList<E> getList() {
        return mList;
    }

    /**
     * Returns true if this Queue is empty.
     */
    public boolean isEmpty() {
        return getList().isEmpty();
    }

    /**
     * Returns the front element of this Queue without removing it.
     */
    public E peek() {
        return getList().get(0);
    }

    /**
     * Mutator method for mList.
     */
    protected void setList(DList<E> pList) {
        mList = pList;
    }

    /**
     * Overrides toString() inherited from Object. Returns a String representation of the elements
     * of this Queue by calling the DList.toString() method.
     */
    @Override
    public String toString() {
        return getList().toString();
    }

}
