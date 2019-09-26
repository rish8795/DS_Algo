package linkedList;

import node.SingleDemo;

public class SingleLL {
    private SingleDemo head;
    private SingleDemo tail;
    private int size;

    private SingleDemo createLL(int nodeValue){
        head = new SingleDemo();
        SingleNode node = new SingleDemo();
        node.setValue(nodeValue);
        node.setNode(null);
        head = node;
        tail = node;
        size = 1;// size =1
        return head;
    }

    public SingleDemo getHead() {
        return head;
    }

    public void setHead(SingleDemo head) {
        this.head = head;
    }

    public SingleDemo getTail() {
        return tail;
    }

    public void setTail(SingleDemo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insertLL(SingleDemo head, int nodeValue, SingleDemo location){
        SingleDemo node = new SingleDemo();
        node.setValue(nodeValue);

        if(!existLL(getHead())){
            System.out.println("Error in the code LL doesn't exist");
            return;
        }else if(location == getHead()){
            node.node = head;
            head = node;
        }else if (location == getTail()){
            tail.node = node;
            node.node = null;
            tail = node;
        }
        else {
            for (tmpNode:)
        }
    }



}