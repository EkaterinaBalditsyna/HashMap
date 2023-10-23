public class PhoneBook{
    private static HashMap<String, ArrayList> contacts = new HashMap();
}

public static void addContacts(String name, String phoneNumber){
    if (contacts.containsKey(name)){
        ArrayList phoneNumbers = contacts.get(name);
        phoneNumber.add(phoneNumber);
        contacts.put(name, phoneNumber);
    }
}

public static void printContacts(){
    ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList(contacts.entrySet());
    Collections.sort(list, new Comparator <Map.Entry<String, ArrayList>>(){
        @Override
        public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2){
            return o2.getValue().size() - o1.getValue().size();
        }
    });
    for (Map.Entry<String, ArrayList> entry : list){
        System.out.println(entry.getKey() + ": " + entry.getValue());
    }

}

public static void main(String[] args){
    addContact("Trys", "756-93-74");
    addContact("Balbes", "645-98-11");
    addContact("Balbes", "123-00-44");
    addContact("Byvalyi", "857-99-22");
    addContact("Byvalyi", "386-91-67");
    addContact("Byvalyi", "385-88-22");

printContacts();
}