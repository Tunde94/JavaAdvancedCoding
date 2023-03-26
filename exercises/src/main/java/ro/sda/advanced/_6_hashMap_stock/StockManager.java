package ro.sda.advanced._6_hashMap_stock;

import java.util.HashMap;
import java.util.Map;

/*Create a class StockManager which has only one field (instance variable) which is a final Map<String, StockItem>

  The class should contain the following methods:
        - a constructor which don't take any parameter but initialize the map with a new HashMap<>()
        - addStock(StockItem item) - check if item is not null, then check if the key (item name) already exists in the map,
        if exists adjustQuantity() if not add the item to the list by putting the name as key and item as value
        - reserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
        if the item is in the map and quant is grater then 0 then call the method reserveStock(quant) for that item
        - sellStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
        if the item is in the map and quant is grater then 0 then call the method finalizeStock(quant) for that item
        - unreserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
        if the item is in the map and quant is grater then 0 then call the method unreserveStock(quant)
        - get(String key) - returns if a StockItem is in the map (map.get(key))
        - toString() - override to print the stock list (use map.entrySet() to iterate through map entries)*/
public class StockManager {
    private final Map<String, StockItem> itemMap;

    public StockManager() {
        this.itemMap = new HashMap<>();
    }

    public void addStock(StockItem item) {
        if (item != null) {
            StockItem inStock = itemMap.get(item.getName());
            if (inStock != null) {
                inStock.adjustStock(item.availableQuantity());
            } else {
                itemMap.put(item.getName(), item);
            }
        }
    }

    public int sellStock(String item, int quantity) {
        if (item != null) {
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0) {
                int soldQuantity = inStock.finalizeStock(quantity);
                return soldQuantity;
            }
        }
        return -1;
    }

    public int reserveStock(String item, int quantity) {
        if (item != null) {
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0) {
                try {
                    return inStock.reserveStock(quantity);
                } catch (UnavaibleStockException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }
            }
        }
        return -1;
    }

    public int unReserveStock(String item, int quantity) {
        if (item != null) {
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0) {
                inStock.unreservedStock(quantity);
            }
        }
        return -1;
    }
}
