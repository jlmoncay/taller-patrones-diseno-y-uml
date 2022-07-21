
package ec.edu.espol.strategy;

public class TransportSystem {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void Do(Location location){
        strategy.ProductDeliveryLocation(location);
        // Does delivery action
    }    
}
