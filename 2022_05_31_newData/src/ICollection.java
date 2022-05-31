public interface ICollection<T> {
    /**
     * The method puts the value to collection. If the value is already exists, return false
     *
     * @param value
     * @return true
     */
    boolean add(T value);

    /**
     * removes the value or returns false, if there is no such a value.
     *
     * @param value
     * @return true
     */
    boolean remove(T value);

    /**
     * randomly return one element of the collection
     *
     * @return value
     */
    T getRandom();
}
