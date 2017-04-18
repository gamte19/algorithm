package data_structure;

/**
 * Created by Mate on 2017. 04. 13..
 */
public class Stack<T> {
    private StackElement last;


    public void put(T object) {
        StackElement stackElement = new StackElement(object);
        if (last != null) {
            last.setNext(stackElement);
            stackElement.setPrev(last);
        }
        this.last = stackElement;

    }

    public Object pop() {
        Object returnData = last.getData();
        last.setNext(null);
        last = last.getPrev();

        return returnData;
    }


}
