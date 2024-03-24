package cafe.camellia.api.stock;

import java.util.List;

public interface StockInterface {
    public Stock createStock(Stock stock);
    public Stock updateStock(Stock stock);
    public Stock getStockItem();
    public List<Stock> getStock();
    public Stock deleteStockItem(String id);
}
