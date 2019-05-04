/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextFeild();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
