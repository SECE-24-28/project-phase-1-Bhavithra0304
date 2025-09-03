public class Booking {
    int bookingId;
    int customerId;
    String gasType;
    String date;
    String status;

    public Booking(int bookingId, int customerId, String gasType, String date, String status) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.gasType = gasType;
        this.date = date;
        this.status = status;
    }

    public String toFileString() {
        return bookingId + "," + customerId + "," + gasType + "," + date + "," + status;
    }
}
