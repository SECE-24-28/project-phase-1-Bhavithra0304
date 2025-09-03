public class Customer {
    int id;
    String name;
    String address;
    String phone;

    public Customer(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String toFileString() {
        return id + "," + name + "," + address + "," + phone;
    }
}
