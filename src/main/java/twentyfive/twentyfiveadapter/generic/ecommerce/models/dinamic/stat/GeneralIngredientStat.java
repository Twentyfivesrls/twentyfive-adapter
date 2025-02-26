package twentyfive.twentyfiveadapter.generic.ecommerce.models.dinamic.stat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GeneralIngredientStat {
    private List<String> distinctUsedIngredients; //Id ingredienti usati diversi
    private long totalIngredients; //Tutti gli ingredienti presenti al giorno in cui si è fatta la statistica
    private long totalUsedIngredients; //Totale ingredienti usati
}
