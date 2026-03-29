// src/thread/generic/GenericLinkedList.java
package thread.generic;
public class GenericLinkedList<T> {
    private GenericNode<T> head;  // 头节点
    private int size;              // 链表长度

    public GenericLinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 添加节点到链表尾部
     * @param node 要添加的节点
     * @return true-添加成功
     */
    public boolean addList(GenericNode<T> node) {
        if (node == null) {
            return false;
        }

        if (head == null) {
            head = node;
        } else {
            GenericNode<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
        return true;
    }
    public void removeList0() {
        if (head == null) {
            System.out.println("链表为空，无法删除");
            return;
        }

        // 只有一个节点
        if (head.getNext() == null) {
            head = null;
        } else {
            GenericNode<T> current = head;
            GenericNode<T> prev = null;

            // 找到最后一个节点
            while (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }

            // 删除最后一个节点
            prev.setNext(null);
        }
        size--;
    }

    /**
     * 根据值删除节点（删除第一个匹配的节点）
     * @param value 要删除的值
     */
    public void removelistByValue(T value) {
        if (head == null) {
            System.out.println("链表为空，无法删除");
            return;
        }

        // 如果头节点就是要删除的节点
        if (head.getData().equals(value)) {
            head = head.getNext();
            size--;
            return;
        }
        GenericNode<T> current = head;
        GenericNode<T> prev = null;

        while (current != null && !current.getData().equals(value)) {
            prev = current;
            current = current.getNext();
        }
        if (current != null) {
            prev.setNext(current.getNext());
            size--;
        } else {
            System.out.println("未找到值为 " + value + " 的节点");
        }
    }
    public int find(T value) {
        GenericNode<T> current = head;
        int index = 0;

        while (current != null) {
            if (current.getData().equals(value)) {
                return index;
            }
            current = current.getNext();
            index++;
        }

        return -1; // 未找到
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void printList() {
        if (head == null) {
            System.out.println("链表为空");
            return;
        }

        GenericNode<T> current = head;
        System.out.print("链表内容: ");
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    public void clear() {
        head = null;
        size = 0;
    }
}