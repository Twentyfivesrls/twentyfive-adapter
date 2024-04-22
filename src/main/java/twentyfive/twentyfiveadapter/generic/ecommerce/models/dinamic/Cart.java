package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
    private List<ItemInPurchase> purchases = new ArrayList<>();

    /**
     * Ottiene item e quantità corrispondenti agli indici forniti.
     * @param positions la lista degli indici degli item desiderati.
     * @return la lista degli item e delle loro quantità agli indici specificati.
     */
    public List<ItemInPurchase> getItemsAtPositions(List<Integer> positions) {
        List<ItemInPurchase> selectedItems = new ArrayList<>();
        Set<Integer> sortedIndices = new TreeSet<>(positions); // Evita duplicati e ordina gli indici
        for (Integer index : sortedIndices) {
            if (index >= 0 && index < purchases.size()) {
                selectedItems.add(purchases.get(index));
            } else {
                throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
            }
        }
        return selectedItems;
    }

    public void addNewItem(ItemInPurchase item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot add null item or non-positive quantity to the cart.");
        }
        if (!purchases.contains(item)) {
            purchases.add(item);
        } else {
            throw new IllegalArgumentException("Item already exists in the cart. Use setItemQuantity to adjust the quantity.");
        }
    }

    /**
     * Rimuove item dal carrello agli indici forniti.
     * @param positions la lista degli indici degli item da rimuovere.
     */
    public void removeItemsAtPositions(List<Integer> positions) {
        Set<Integer> sortedIndices = new TreeSet<>(Collections.reverseOrder());
        sortedIndices.addAll(positions);
        for (Integer index : sortedIndices) {
            if (index >= 0 && index < purchases.size()) {
                purchases.remove((int) index);
            } else {
                throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds");
            }
        }
    }



    /**
     * Pulisce completamente il carrello.
     */
    public void clearCart() {
        purchases.clear();
    }


}
