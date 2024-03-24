package cafe.camellia.api.sales;

public interface SalesInterface {
    public Sales createSales(Sales sales);
    public Sales UpdateSales(Sales sales);
    public Sales getSalesItem(String id);
    public Sales getSales();
}
