import java.util.Scanner;
/**
 * Created by жека on 09.11.2014.
 */
public class addressuser {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    addressbook adrBook = new addressbook();
    list();
    int com, ind;
    String name, phone, email;

    name = "Джесика";
    phone = "89053564396";
    email = "Jeci@gmail.com";
    address adr = new address(name, phone, email);
    adrBook.add(adr);
    name = "Смит";
    phone = "89999999999";
    email = "Smit@yandex.ru";
    adr = new address(name, phone, email);
    adrBook.add(adr);

    while (true) {
        com = sc.nextInt();
        switch (com) {
            case 1:
                System.out.print("Введите имя: ");
                name = sc.next();
                System.out.print("Введите номер телефона: ");
                phone = sc.next();
                System.out.print("Введите E-mail: ");
                email = sc.next();
                adr = new address(name, phone, email);
                adrBook.add(adr);
                break;
            case 2:
                System.out.print("Введите имя: ");
                name = sc.next();
                int[] find = adrBook.find(name);
                System.out.print("Индексы ячеек с указанными именами: ");
                if (find != null) for (int i = 0; i < find.length; i++) {System.out.print(find[i] + " ");}
                System.out.println();
                break;
            case 3:
                adrBook.print();
                break;
            case 4:
                System.out.print("Введите индекс удаляемой записи: ");
                ind = sc.nextInt();
                adrBook.delete(ind);
                break;
            case 5:
                System.out.print("Введите индекс изменяемой записи: ");
                ind = sc.nextInt();
                System.out.print("Введите новое имя: ");
                name = sc.next();
                System.out.print("Введите новый номер телеона: ");
                phone = sc.next();
                System.out.print("Введите новый Email: ");
                email = sc.next();
                adrBook.change(ind, name, phone, email);
                break;
            case 6:
                System.out.print("Введите индекс записи: ");
                ind = sc.nextInt();
                adrBook.get(ind);
                break;
            case 7:
                System.out.println("Количество записей в книге: " + adrBook.getCount());
                break;
            case 8:
                list();
                break;
            case 9:
                return;
            default:
                System.out.print("Введите корректную команду: ");
        }
    }
}
    public static void list(){
        System.out.println("Введите номер команды для ее выполнения: \n" +
                "1 - добавить запись\n" +
                "2 - поиск записей\n" +
                "3 - вывод всех записей\n" +
                "4 - удаление записи\n" +
                "5 - изменение записи\n" +
                "6 - вывести запись по индексу\n" +
                "7 - вывести количество записей в книге\n" +
                "8 - вывести меню пользователя\n" +
                "6 - выход из программы\n");
    }
}
