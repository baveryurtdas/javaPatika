package MyListGeneric;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("List of : " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List of : " + (list.isEmpty() ? "Empty" : "Full"));
        System.out.println("Indeks : " + list.indexOf(20));
        System.out.println("Indeks : " + list.indexOf(100));
        System.out.println("Indeks : " + list.lastIndexOf(20));
        Object[] arr = list.toArray();
        System.out.println("Object arrays first element : " + arr[0]);
        MyList<Integer> mySubList = list.subList(0, 3);
        System.out.println(mySubList.toString());
        System.out.println("Value 20 in the list : " + list.contains(20));
        System.out.println("Value 120 in the list : " + list.contains(120));
        list.clear();
        System.out.println("List emptied : ");
        System.out.println(list.toString());

    }
}
