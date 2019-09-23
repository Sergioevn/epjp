package s066;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }
//il secondo bark è un metodo completamente diverso dal primo perchè ha un parametro
    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}