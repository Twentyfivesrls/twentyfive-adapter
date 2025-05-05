package twentyfive.twentyfiveadapter.dto.bustepagaDto;

import lombok.Getter;

@Getter
public enum ConfirmationState {
    CONFIRMED("Confermato"),
    NOT_CONFIRMED("Non Confermato"),
    READ("Letto");

    private String state;

    ConfirmationState(String state) {
        this.state = state;
    }
}
