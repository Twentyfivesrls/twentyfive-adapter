package twentyfive.twentyfiveadapter.models.thubModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThubCustomTheme {

    private String themeName;
    private String titleColor;
    private String backgroundColor;
    private boolean backgroundGradient;
    private String backgroundOption;
    private String gradientColor;
    private String backgroundImage;
    private String[] backgroundImages;
    private String buttonShape;
    private String buttonStyle;
    private String buttonColor;
    private String buttonOutlineColor;
    private String font;
    private String fontColor;
}
