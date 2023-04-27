
import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

import org.junit.Test;

public class StoreTester {
//
//    public static void main(String[]args) {
//
//    }

    @Test
   public void testAddBook()
    {
        System.out.println("hello");
        Store test = new Store();
        Book book = new Book("H", "Hk", 100, "wnfnwefkjn",10132834, "10/1/2031", "chloe", "wugw", "3");
        test.addBook(book);
        assertTrue("Hello",test.items.size() ==1);

    }

    @Test
    public void testAddBookAndPhone()
    {
        Store test = new Store();
        Book book = new Book("H", "Hk", 100,"wnfnwefkjn", 10132834, "10/1/2031", "chloe", "wugw", "3");
        Phone phone = new Phone("chloe phone", "hk", 1000000000, "wnfnwefkjn",1294328505, "Th best model", "idk", "chloe", "the best network", 10000);
        test.addBook(book);
        test.addPhone(phone);
    }

    public void updatePhonesLocation() {
        Store s = new Store();
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone one = new Phone("chloe's phone", "Room 413", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone two = new Phone("chloe's phone", "Room 321", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone three = new Phone("chloe's phone", "Room 555", 90,"wnfnwefkjn", 900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        String room = "Room 514";
        s.updatePhonesLocation(room);
        phoneArrayList = s.getAllPhones();
        for (int i = 0; i < phoneArrayList.size(); i++) {
            assertEquals(phoneArrayList.get(i).getLocation(), "Room 514");
        }
    }

    public void getItemsTester()
    {
        Store s = new Store();
        Phone one = new Phone("chloe's phone", "Room 413", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone two = new Phone("chloe's phone", "Room 321", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone three = new Phone("chloe's phone", "Room 555", 90,"wnfnwefkjn", 900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Book book = new Book("H", "Hk", 100, "wnfnwefkjn",10132834,"10/1/2031", "chloe", "wugw", "3");
        Book bookone = new Book("The story of one direction","Library",100,"wnfnwefkjn",1000,"10/6/2005","Chloe Hen","12394","5th");

        ArrayList<CISItem> bookArrayList = s.getItems("Book");
        ArrayList<CISItem> phoneArrayList = s.getItems("Phone");
        for (int i = 0; i < phoneArrayList.size(); i++) {
            assertEquals(phoneArrayList.get(i).getClass(), one.getClass());
        }
        for (int i = 0; i < bookArrayList.size(); i++) {
            assertEquals(bookArrayList.get(i).getClass(),book.getClass());
        }


    }

    public void updateItem()
    {
        Store s = new Store();
        Phone one = new Phone("chloe's phone", "Room 413", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone two = new Phone("chloe's phone", "Room 321", 90, "wnfnwefkjn",900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Phone three = new Phone("chloe's phone", "Room 555", 90,"wnfnwefkjn", 900, "the best", "a cool one", "chloe chen", "A strong network yes", 100);
        Book book = new Book("H", "Hk", 100, "wnfnwefkjn",10132834,"10/1/2031", "chloe", "wugw", "3");
        Book bookone = new Book("The story of one direction","Library",100,"wnfnwefkjn",1000,"10/6/2005","Chloe Hen","12394","5th");

        s.addPhone(one);
        s.addPhone(two);
        s.addPhone(three);
        s.addBook(book);
        s.addBook(bookone);

        ArrayList<Book> BookItem = s.getBooks();
        ArrayList<Phone> phoneItem = s.getAllPhones();

        s.updateItems("Book","location","Room Comptuer Science");
        s.updateItems("Phone","name","Chloe's mega phone");

        for(int i =0;i <BookItem.size();i++)
        {
            assertEquals(BookItem.get(i).getLocation(),"Room Comptuer Science");
        }
        for(int i =0;i <phoneItem.size();i++)
        {
            assertEquals(phoneItem.get(i).getName(),"Chloe's mega phone");
        }
    }










}
