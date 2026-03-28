package thread.generic;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("=== 泛型链表测试 ===\n");

        GenericLinkedList<Integer> list = new GenericLinkedList<>();
        System.out.println("1. 添加节点:");
        GenericNode<Integer> node1 = new GenericNode<>(10);
        GenericNode<Integer> node2 = new GenericNode<>(20);
        GenericNode<Integer> node3 = new GenericNode<>(30);
        GenericNode<Integer> node4 = new GenericNode<>(40);

        list.addList(node1);
        list.addList(node2);
        list.addList(node3);
        list.addList(node4);
        list.printList();
        System.out.println("链表长度: " + list.getSize());
        System.out.println();

        System.out.println("2. 查找节点:");
        int index1 = list.find(20);
        System.out.println("值为 20 的节点下标: " + index1);

        int index2 = list.find(100);
        System.out.println("值为 100 的节点下标: " + index2);
        System.out.println();

        System.out.println("3. 根据值删除:");
        list.removelistByValue(20);
        list.printList();
        System.out.println("链表长度: " + list.getSize());
        System.out.println();

        System.out.println("4. 删除尾节点:");
        list.removeList0();
        list.printList();
        System.out.println("链表长度: " + list.getSize());
        System.out.println();

        System.out.println("5. 删除不存在的值:");
        list.removelistByValue(100);
        list.printList();
        System.out.println();

        System.out.println("6. 字符串链表测试:");
        GenericLinkedList<String> strList = new GenericLinkedList<>();
        strList.addList(new GenericNode<>("A"));
        strList.addList(new GenericNode<>("B"));
        strList.addList(new GenericNode<>("C"));
        strList.printList();

        int strIndex = strList.find("B");
        System.out.println("值为 'B' 的节点下标: " + strIndex);

        strList.removelistByValue("B");
        strList.printList();
        System.out.println();

        System.out.println("7. 清空链表:");
        strList.clear();
        System.out.println("清空后链表是否为空: " + strList.isEmpty());
        strList.printList();
    }
}