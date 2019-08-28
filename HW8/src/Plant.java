import java.util.Arrays;

public class Plant {

    private Type type;
    private Color color;
    private int size;

    public enum Color {White, Yellow, Blue}

    public enum Type {FLOWER1, FLOWER2, FLOWER3}

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant("flower3", "blue", 3);
            plants[1] = new Plant("flower1", "white", 5);
            plants[2] = new Plant("flower3", "yellow", 8);
            plants[3] = new Plant("flower2", "yellow", 7);
            plants[4] = new Plant("flower2", "white", 1);
            System.out.println(Arrays.toString(plants));
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage());
        }
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.Blue;
            case "yellow":
                return Color.Yellow;
            case "white":
                return Color.White;
            default:
                throw new ColorException("Choose blue, yellow or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "flower1":
                return Type.FLOWER1;
            case "flower2":
                return Type.FLOWER2;
            case "flower3":
                return Type.FLOWER3;
            default:
                throw new TypeException("Choose flower1, flower2 or flower3");
        }
    }

    @Override
    public String toString() {
        return "\nPlant{" + "\t" + type + "\t" + color + "\t" + size + '}';
    }

    public class ColorException extends Exception {
        public ColorException(String arg0) {
            super(arg0);
        }

    }

    public class TypeException extends Exception {
        public TypeException(String arg0) {
            super(arg0);
        }

    }
}