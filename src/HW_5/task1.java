// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HW_5;

public class task1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("89258888875", "Иванов Иван Иванович");
        phoneBook.add("89258888875", "Петров Петр Петрович");
        phoneBook.add("89258288875", "Смирнов Дмитрий Дмитриевич");
        phoneBook.printPerson();
    }
}
