package entities;

public interface ContractStack<T> {

    T pop(); // Remove element on Stack
    T push(T object); // Add element on Stack
    T top(); // Return element on top
    Boolean isEmpty(); // Return boolean value
    Integer size(); // Return size of Stack
    void clear(); // Clean Stack (Remove all elements)
}
