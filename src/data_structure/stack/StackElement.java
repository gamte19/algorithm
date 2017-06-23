package data_structure;

public class StackElement <T> {
    private Object data;
    private StackElement prev;
    private StackElement next;


    public StackElement(T data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }


    public StackElement getPrev() {
        return prev;
    }

    public void setPrev(StackElement prev) {
        this.prev = prev;
    }

    public StackElement getNext() {
        return next;
    }

    public void setNext(StackElement next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "StackElement{" +
                "data=" + data +
                ", prev=" + prev +
                ", next=" + next +
                '}';
    }
}
