import collections.linkedList.MyLinkedListIterator;
import collections.linkedList.MyLinkedList;
import collections.linkedList.Node;

import java.io.IOException;
import java.util.Iterator;


public class main {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
//        OOP.Dispersion.Example example = new OOP.Dispersion.Example1();
//        OOP.Inheritance.Figure figure1 = new OOP.Inheritance.Triangle(4);
//        OOP.Inheritance.Figure figure2 = new OOP.Inheritance.Rectangle(2, 3);
//        figure2.printParameters();

//        OOP.Incapsulation.Author author = new OOP.Incapsulation.Author("Lilit", "Adamyan", "06-02-1997");
//
//
//        OOP.Incapsulation.Book book = new OOP.Incapsulation.Book("My book1 title", author, 34, "MyPubliser");
//        ArrayList

//       Object [] aaaaa = {1};
//        Object [] newArray = Arrays.copyOf(aaaaa, 10);
//        System.out.println(book.getAuthor().getName());
//        Collections.arrayList.MyArrayList myArrayList = new Collections.arrayList.MyArrayList(4);
//        Integer[] array = {5, 6, 7, 7, 8, 9};
//        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(array);

//        ArrayList<Integer> aaaa = new ArrayList<Integer>();
//        aaaa.get


//        System.out.println(myArrayList.getSize());
//        myArrayList.add(12);
//        Integer [] bbb  = {1,2,6};
//
//        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(bbb);
//
//
////        myArrayList.addElementAtIndex(0, 10);
//        System.out.println(myArrayList.getSize());
//        System.out.println(myArrayList.elementAt(0));
//
//
//


//        System.out.println(myArrayList.indexOf(7));
//        System.out.println(myArrayList.lastIndexOf(7));
//        System.out.println(myArrayList.getSize());
//        myArrayList.print();
//        myArrayList.addElementAtIndex(3, 1);
//        myArrayList.print();
//        myArrayList.deleteAtIndex(3);
//        myArrayList.print();
//        myArrayList.deleteFirst(7);
//        myArrayList.print();
//        myArrayList.add(7);
//        myArrayList.print();
//        myArrayList.deleteLast(7);
//        myArrayList.print();
//        Integer[] array1 = {2, 4, 2, 4};
//        myArrayList.add(array1);
//        myArrayList.print();
//        myArrayList.set(4, 11);
//        myArrayList.print();
//        myArrayList.removeRange(3, 5);
//        myArrayList.print();



//
//        int[] array = new int[4];
//        int[] array1 = Arrays.copyOf(array, 4);


        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.linkFirst(1);
        myLinkedList.linkLast(2);
        Node<Integer> node = myLinkedList.getLast();
        myLinkedList.linkBefore(3, node);
//        System.out.println(myLinkedList.getFirstElement());
//        System.out.println(myLinkedList.getLastElement());
//        System.out.println(myLinkedList.getSize());
        myLinkedList.print();
//        System.out.println(myLinkedList.getLastElement());
//        myLinkedList.unLinkFirst();
//        myLinkedList.unLinkFirst();
//        myLinkedList.unLinkLast();
//        myLinkedList.unlink(node);
//        myLinkedList.removeFirst();
        System.out.println();
//        System.out.println(myLinkedList.getFirstElement());
        myLinkedList.addFirst(4);
        myLinkedList.addLast(10);
        myLinkedList.print();
        System.out.println();
        System.out.println(myLinkedList.get(9));
        myLinkedList.set(1, 7);
        myLinkedList.print();
        System.out.println();

        MyLinkedListIterator it = new MyLinkedListIterator(myLinkedList);
//        Iterator<Integer> it = myLinkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        MyHashMap<Integer, Integer> myHashMap = new MyHashMap<Integer, Integer>();
//        myHashMap.put(1,1);
//        myHashMap.put(16,1);
//        myHashMap.put(31,1);
//        myHashMap.remove(16);
//        myHashMap.remove(31);
//        myHashMap.remove(1);
//        myHashMap.put(31,1);
//        myHashMap.put(1,1);
//        myHashMap.put(3,1);
//        myHashMap.put(5,5);
//        myHashMap.put(1,7);
//        myHashMap.put(3,2);
//        System.out.println(myHashMap.get(3));
//        myHashMap.put(11,1);
//        myHashMap.put(12,1);
//        myHashMap.put(13,5);
//        myHashMap.put(14,7);
//        myHashMap.put(15,2);
//        myHashMap.put(16,1);
//        myHashMap.put(17,1);
//        myHashMap.put(18,5);
//        myHashMap.put(19,7);
//        myHashMap.put(20,2);
//        myHashMap.put(21,1);
//        myHashMap.put(22,1);
//        myHashMap.put(23,5);
//        myHashMap.put(24,7);
//        myHashMap.put(25,2);
//        System.out.println(myHashMap.getSize());
//        System.out.println(myHashMap.get(25));
//        System.out.println(myHashMap.containsKey(23));
//        System.out.println(myHashMap.containsKey(0));
//        myHashMap.printKeys();
//        System.out.println(myHashMap.get(3));
//        myHashMap.printValues();


//        MyStack myStack = new MyStack(7);
//        myStack.push(5);
//        myStack.push(1);
//        myStack.push(3);
//        myStack.push(2);
//        myStack.push(5);
//        myStack.push(4);
//        myStack.push(2);
//        myStack.push(8);
//        myStack.print();
//        System.out.println();
//        myStack.removeAt(3);
//        System.out.println();
//        myStack.print();
//        System.out.println();
//        System.out.println(myStack.peek());
//        System.out.println();
//        System.out.println(myStack.pop());
//        System.out.println();
//        myStack.print();

//        int[] array = {1, 3, 9, 7, 2};
//        InsertionSort insertionSort = new InsertionSort(array);
//        insertionSort.print();
//        insertionSort.sort();
//        insertionSort.print();

//        int[] array = {1, 3, 9, 7, 2, 3 , 2, 4, 11, 15, 0};
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(array);
//        for (int i : array) {
//            System.out.println(i);
//        }

//        int[] array = {1, 3, 9, 7, 2, 3 , 2, 4, 11, 15, 0};
//        QuickSort quickSort = new QuickSort();
//        quickSort.sort(array, 0, array.length-1);
//        for (int i : array) {
//            System.out.println(i);
//        }
//
//        ReadAndWrite readAndWrite = new ReadAndWrite("D:\\Projects\\initial\\src\\main\\java\\io\\input.txt",
//                "D:\\Projects\\initial\\src\\main\\java\\io\\output.txt");
//
//        ScanData scanData = new ScanData();

//
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Shape shape = shapeFactory.getShape("Circle");
//        shape.draw();


//        SingleObject.getInstance().showMessage();

//        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("RoundedShape");
//        roundedShapeFactory.getShape("Rectangle").draw();



//        ShapeCach.loadCache();
//
//        Shape clonedShape = (Shape) ShapeCach.getShape("1");
//        System.out.println(clonedShape.getType());


//
//        BankAccount bankAccount = new BankAccount.Builder(1)
//                .addBalance(17.0)
//                .addOwner("me")
//                .addBranch("myBranch")
//                .addInterestRate(0.4)
//                .build();
//        System.out.println(bankAccount.getId());
//
//
//
//        JDBCConnectionPool pool = new JDBCConnectionPool(
//                "org.mysql.jdbcDriver", "jdbc:mysql://localhost:3306/egsians",
//                "root", "password");
//
//        // Get a connection:
//        Connection con = pool.checkOut();
//
//        // Use the connection
//
//        // Return the connection:
//        pool.checkIn(con);



//        Internet internet = new ProxyInternet();
//        try
//        {
//            internet.connectTo("geeksforgeeks.org");
//            internet.connectTo("abc.com");
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }



//        Car sportsCar = new SportsCar(new BasicCar());
//        sportsCar.assemble();
//        System.out.println();
//
//        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
//        sportsLuxuryCar.assemble();


//        DispenseChain c1 = new Dollar50Dispenser();
//        DispenseChain c2 = new Dollar20Dispenser();
//        DispenseChain c3 = new Dollar10Dispenser();
//        c1.setNextChain(c2);
//        c2.setNextChain(c3);
//        int amount = 90;
//        c1.dispense(new Currency(amount));


//        Dot dot = new Dot(1, 10, 55);
//        Circle circle = new Circle(2, 23, 15, 10);
//        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);
//
//        CompoundShape compoundShape = new CompoundShape(3);
//        compoundShape.add(dot);
//        compoundShape.add(circle);
//        compoundShape.add(rectangle);
//
//        XMLExportVisitor exportVisitor = new XMLExportVisitor();
//        System.out.println(exportVisitor.export(compoundShape));


    }
}
