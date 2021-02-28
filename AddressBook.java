import java.util.ArrayList;

public class AddressBook {
    //Instance variable
    private ArrayList<AddressEntry> addressEntryList=new ArrayList<>();
    //list metod print the details of addressEntryList
    public void list() {
        for(AddressEntry addressEntry:addressEntryList) {
            System.out.println(addressEntry);
        }
    }
    /**
     *
     * @param addressEntry add to addressEntryList
     */
    public void add(AddressEntry addressEntry) {
        addressEntryList.add(addressEntry);
    }
    public void initAddressBookExercise() {
        //Create an object of AddressEntry
        AddressEntry addressEntry1=new AddressEntry("Ghazi", "Noseir", "leona creek", "ca", 94621, "55555555", "ga@hhh@gmail.com");
        addressEntry1.setCity("Oakland");
        AddressEntry addressEntry2=new AddressEntry("meh", "Meh", "meh", "meh", 94601, "4444444", "66666@gmail.com");
        addressEntry2.setCity("Hayward");
        //Call add method
        add(addressEntry1);
        add(addressEntry2);
        //Call list method
        list();
    }
}