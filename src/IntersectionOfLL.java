public class IntersectionOfLL {
    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static Node getIntersectionNode(Node headA, Node headB ){
        if (headA == null || headB == null)
            return null;

        Node a = headA;
        Node b = headB;

        while (a != b){
            a = (a== null) ? headB : a.next;
            b = (b== null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Node newNode = new Node(8);
        newNode.next = new Node(10);

        Node headA = new Node(3);
        headA.next = new Node(7);
        headA.next.next = newNode;

        Node headB = new Node(99);
        headB.next = newNode;

         Node intersection = getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
