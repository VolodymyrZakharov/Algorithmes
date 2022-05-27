public interface INode {

    /**
     * The method puts the value to collection. If the value is already exists, return false
     *
     * @param value
     * @return true
     */
    boolean add(long value);

    /**
     * removes the value or returns false, if there is no such a value.
     *
     * @param value
     * @return true
     */
    boolean remove(long value);

    /**
     * randomly return one element of the collection
     *
     * @return value
     */
    long getRandom();

}
