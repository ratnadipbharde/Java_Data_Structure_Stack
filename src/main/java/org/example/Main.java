package org.example;


public class Main {

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printMyStack();
        INode a=myStack.peak();
        System.out.println("Peak: "+a);
        myStack.printMyStack();
        myStack.pop();
        System.out.println("after pop() method...");
        myStack.printMyStack();
    }
}
