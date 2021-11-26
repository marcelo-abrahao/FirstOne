package pkg;

public class Order {
    private final String cod;

    public Order(String cod){
        this.cod = cod;
    }
    @Override
    public String toString(){
        return "Order = " + "cod:'" + cod + "'";
    }

}