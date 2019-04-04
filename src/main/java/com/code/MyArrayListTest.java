package com.code;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        //List
        list.addElement("Hai");
        list.addElement("Chinh");
        list.addElement("Duc");
        list.add(6,"Duc");
//        list.add(5,"Dinh");
        //Pre-List
        System.out.println("Pre-List:");
        printList(list);

        list.remove(2);
        //After-List
        System.out.println("After-List:");
        printList(list);
    }

    private static void printList(MyList list){
        System.out.println("--------List items----------");
        for (int i = 0; i < list.lastIndexOf(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.lastIndexOf())+".");
        System.out.println();
    }
}
