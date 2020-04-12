package list;

import java.util.LinkedList;

public class UserLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList =new LinkedList<>();
        linkedList.add("qqqqqq");
        linkedList.add("wwwww");
        linkedList.add("eeeee");
        linkedList.addLast("ZZZZZ");
        System.out.println(linkedList);

        linkedList.addFirst("AAAAA");
        linkedList.push("aaaaa");
        System.out.println(linkedList);
       // linkedList.clear();
        if (!linkedList.isEmpty()){
            System.out.println(linkedList.getFirst());
            System.out.println(linkedList.getLast());
        } else {
            System.out.println("linkedList is noll");
        }


        System.out.println(linkedList.pop());
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

    }
}
