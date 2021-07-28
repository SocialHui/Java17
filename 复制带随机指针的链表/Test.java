class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        for (; cur != null; cur = cur.next) {
            Node newNode = new Node(cur.val);
            map.put(cur,newNode);
        }

        cur = head;
        for (; cur != null; cur = cur.next) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
        }
        cur = head;
        return map.get(cur);
    }
}