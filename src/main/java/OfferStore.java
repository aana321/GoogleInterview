import org.example.Offer;

import java.util.HashMap;
import java.util.Map;

/*
In Meesho Shopping we have products which are identified by a unique id. Each product can have multiple offers associated with it, and each offer has a corresponding price.
Design a data structure to support the following operations:
void addOffer(int64 offer_id, int64 product_id, double price); // Adds offer_id, with the specified price, for product_id.
void removeOffer(int64 offer_id); // The offer is not valid anymore.
Offer getClosestOffer(int64 product_id, double price); // getClosestOff --> TreeMap O(logn)

 */

public class OfferStore {

    private Map<Long, Map<Long, Double>> offers;

    public OfferStore(){
        offers = new HashMap<>();
    }

    public void addOffers(long product_id, long offer_id, double price){
        if(!offers.containsKey(product_id)){
            offers.put(product_id, new HashMap<>());
        }
        offers.get(product_id).put(offer_id, price);
    }

    public void removeOffers(long offer_id){
        for(Map<Long, Double> productOffers : offers.values()){
            if(productOffers.containsKey(offer_id)){
                productOffers.remove(offer_id);
                break;
            }
        }
    }

    public Offer getClosetsOffer(long product_id, long price){
        if(!offers.containsKey(product_id)){
            return new Offer(-1,-1);
        }
        Map<Long, Double> productOffers = offers.get(product_id);
        double minDiff = Double.MAX_VALUE;
        long closetOfferId = -1;
        for(Map.Entry<Long, Double> entry : productOffers.entrySet()){
            double offerPrice = entry.getValue();
            double diff = Math.abs(offerPrice - price);
            if(diff < minDiff){
                minDiff = diff;
                closetOfferId = entry.getKey();
            }
        }

        return new Offer(closetOfferId, price);
    }

    class Offer {
        public long offerId;
        public double price;

        public Offer(long offerId, double price) {
            this.offerId = offerId;
            this.price = price;
        }
    }

    public static void main(String[] args){

    }
}
