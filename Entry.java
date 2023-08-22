public class Entry {
    private String name;
    private String address;
    private String phone_number;

    public void setName(String pname) {
        name = pname;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String paddress) {
        address = paddress;
    }

    public String getAddress() {
        return address;
    }

    public void setPhoneNumber(String pnumber) {
        phone_number = pnumber;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public static void main(String[] args) {
        Entry myEntry = new Entry();
        myEntry.setName("Sanyogita");  
        myEntry.setAddress("Ballia ");
        myEntry.setPhoneNumber("123-456-7890");

        System.out.println(
                "My Entry is : " + myEntry.getName() + " " + myEntry.getAddress() + " " + myEntry.getPhoneNumber());

    }
}