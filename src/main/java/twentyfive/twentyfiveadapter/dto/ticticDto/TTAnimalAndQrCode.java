package twentyfive.twentyfiveadapter.dto.ticticDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import twentyfive.twentyfiveadapter.models.tictickModels.TTAnimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TTAnimalAndQrCode {
    private TTAnimal animal;
    private MinimalQrCode qrCode;
}
