package lmao;

public class Contact
{
   public String name;
   public String number;

   // Contact constructor
   Contact( String n, String num )
   {
      name = n;
      number = num;
   }

   public static void main (String[] args)
   {
      // create and fill array of 5 Contact objects
      Contact[] contacts = new Contact[5];
      contacts[0] = new Contact( "George Washington", 
                                 "(800) 555-1234" ); 
      contacts[1] = new Contact( "John Adams", 
                                 "(800) 555-4567" );
      contacts[2] = new Contact( "Thomas Jefferson", 
                                 "(800) 555-7890" );
      contacts[3] = new Contact( "James Madison", 
                                 "(800) 555-3456" );
      contacts[4] = new Contact( "James Monroe", 
                                 "(800) 555-2345" );

      // try to find some names
      search(contacts,"George Washington");
      search(contacts,"James Monroe");
      search(contacts,"Andrew Jackson");
   }

   private static void search( Contact[] contacts, 
                               String targetName) 
   {
      // loop through array
      for (int i=0; i < contacts.length; i++)
      {
         // see if this contact name matches the target name
         if (contacts[i].name.equalsIgnoreCase(targetName))
         {
            // print out name and number
            System.out.println( contacts[i].name + ": " +
                                contacts[i].number );

            // all done searching, exit loop early
            return; 
         }
      }

      System.out.println( targetName + ": NOT FOUND");
   }
} 