/**
 * Created by жека on 09.11.2014.
 */
public class addressbook {
    public address[] book = new address[3];
    public static void add(addressbook abook, address newEntry){
        address[] book = abook.book;
        if (book[book.length - 1] != null) {
            System.out.println(book[book.length - 1].name);
            address[] book2 = new address[book.length + 10];
            for (int i = 0; i < book.length; i++) {book2[i] = book[i];}
            abook.book = book2;
            book = book2;
        }
        for (int i = 0; i < book.length; i++){
            if (book[i] == null){
                book[i] = newEntry;
                break;
            }
        }
    }
    public static int[] find(addressbook abook,String name){
        address[] book = abook.book;
        int mas = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null && book[i].name.equals(name)) mas++;
        }
        int[] newmas = new int[mas];
        for (int i = 0, j= 0; i < book.length; i++) {
            if (book[i] != null && book[i].name.equals(name)) {
                newmas[j] = i;
                j++;
            }
        }
        return newmas;
    }
    public static void get(addressbook abook, int index){
        address[] book = abook.book;
        System.out.println("имя: " + book[index].name);
        System.out.println("номер телефона: " + book[index].phone);
        System.out.println("E-mail: " + book[index].email);
    }
    public static void print(addressbook abook){
        address[] book = abook.book;
        System.out.println("Индекс / Имя / Телефон / Email");
        for (int i = 0; i < book.length; i++){
            if (book[i] != null) {
                System.out.println(i + " / " + book[i].name + " / " + book[i].phone + " / " + book[i].email);
            }
        }
    }
    public static void delete(addressbook abook, int index){
        address[] book = abook.book;
        book[index] = null;
    }
    public static int getCount(addressbook abook){
        address[] book = abook.book;
        int mas = 0;
        for (int i = 0; i < book.length; i++){
            if (book[i] != null) mas++;
        }
        return mas;
    }
    public static void change(addressbook abook, int index, String name, String phone, String email){
        address[] book = abook.book;
        book[index] = new address(name, phone, email);
    }
}