package ro.sda.advanced._6_hashMap_stock;

public class StockNotReservedException extends RuntimeException{
    public StockNotReservedException(String message) {
        super(message);
    }
}
