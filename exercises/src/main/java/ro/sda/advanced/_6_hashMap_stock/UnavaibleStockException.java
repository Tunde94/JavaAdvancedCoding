package ro.sda.advanced._6_hashMap_stock;

public class UnavaibleStockException extends RuntimeException{//Excepcion= chacked exception------RundtimeExcepcion= unchacked excepcion
    public UnavaibleStockException(String message) {
        super(message);
    }
}
