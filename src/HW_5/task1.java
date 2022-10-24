// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HW_5;

public class task1 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван Иванович", "89258888875");
        phoneBook.add("Иванов Иван Иванович", "89253338875");
        phoneBook.add("Смирнов Дмитрий Дмитриевич", "89258288875");
        phoneBook.printPerson();
    }
}
