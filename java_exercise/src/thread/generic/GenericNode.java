// src/thread/generic/GenericNode.java
package thread.generic;

/**
 * 泛型节点类
 */
public class GenericNode<T> {
    private T data;           // 存储的数据
    private GenericNode<T> next;  // 指向下一个节点

    public GenericNode(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}