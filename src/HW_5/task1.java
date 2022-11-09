// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HW_5;

public class task1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", "89258888875");
        phoneBook.add("Петров Петр Петрович", "89258888875");
        phoneBook.add("Иванов Иван Иванович", "89258288875");
        phoneBook.add("Иванов Иван Иванович", "89110000075");
        phoneBook.add("Романов Дмитрий Николаевич", "8903545075");
        phoneBook.printPerson();
    }
}
