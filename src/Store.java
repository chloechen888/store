import java.lang.reflect.Array;
import java.util.ArrayList;
public class Store {
    ArrayList<CISItem> items = new ArrayList<CISItem>();

    public void addBook(Book n)
    {
        items.add(n);

    }
    public void addPhone(Phone p)
    {
        items.add(p);
    }
    public void updatePhonesLocation(String location)
    {
        for(int i=0; i<items.size();i++)
        {
            if(items.get(i) instanceof Phone)
            {
                items.get(i).setLocation(location);
            }
        }
    }
    public ArrayList<Phone> getAllPhones()
    {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for(int i=0; i<items.size();i++)
        {
            if(items.get(i) instanceof Phone)
            {
                phones.add((Phone) items.get(i));
            }
        }
        return phones;
    }
    public ArrayList<Book> getBooks()
    {
        ArrayList<Book> books = new ArrayList<>();
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i) instanceof Book)
            {
                books.add((Book) items.get(i));
            }
        }
        return books;
    }

    public ArrayList<CISItem> getItems(String itemType)
    {
        ArrayList<CISItem> getItems = new ArrayList<>();
        for(int i=0; i<items.size();i++)
        {
            if(items.get(i).getClass().equals(itemType))
            {
                getItems.add(items.get(i));
            }
        }
        return getItems;
    }
    public void updateItems(String itemType, String property,String value)
    {
//       if(itemType.equals("phone"))
//       {
//           for(int i=0; i<items.size();i++)
//           {
//               if(items.get(i).getClass().equals(itemType))
//               {
//                   if(property.equals("location"))
//                   {
//                       items.get(i).setLocation(value);
//                   }
//                   if(property.equals("price"))
//                   {
//                       items.get(i).setPrice(Integer.parseInt(value));
//                   }
//                   if(property.equals("name"))
//                   {
//                       items.get(i).setName(value);
//                   }
//
//               }
//           }
//       }
//       if(itemType.equals("book"))
//       {
//           for(int i=0;i<items.size();i++)
//           {
//               if(items.get(i).getClass().equals("Book"))
//               {
//                   if(property.equals("location"))
//                   {
//                       items.get(i).setLocation(value);
//                   }
//                   if(property.equals("price"))
//                   {
//                       items.get(i).setPrice(Integer.parseInt(value));
//                   }
//                   if(property.equals("name"))
//                   {
//                       items.get(i).setName(value);
//                   }
//               }
//           }
//       }
//       if(itemType.equals("Magazine"))
//       {
//           for(int i =0; i< items.size();i++)
//           {
//               if(items.get(i).getClass().equals("Magazine"))
//               {
//                   if(property.equals("coverStoryTitle"))
//                   {
//                       items.get(i).
//                   }
//
//                       String ;
//                   String printDate;
//               }
//           }
        String p = property.toLowerCase();
        ArrayList<CISItem>updateItems= new ArrayList<>();
        for(int i =0;i< items.size();i++)
        {
            if(items.get(i).getClass().equals(itemType))
            {
                if(p.equals("location"))
                {
                    items.get(i).setLocation(value);
                }
                if(p.equals("name"))
                {
                    items.get(i).setName(value);
                }
                if(p.equals("price"))
                {
                    items.get(i).setPrice(Integer.parseInt(value));
                }
                if(p.equals("description"))
                {
                    items.get(i).setDescpription(value);
                }
            }
        }

    }



}
