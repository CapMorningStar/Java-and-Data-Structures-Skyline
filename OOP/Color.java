public class Color {
    private int red;
    private int green;
    private int blue;

    // Constructor to initialize RGB values
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    // Override the equals method to compare Color objects based on RGB values
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check if the object is not null and is of the same class

        Color color = (Color) obj; // Cast the object to Color
        return red == color.red && green == color.green && blue == color.blue; // Compare RGB values
    }

    public static void main(String[] args) {
        Color color1 = new Color(255, 0, 0); // Red
        Color color2 = new Color(255, 0, 0); // Red
        Color color3 = new Color(0, 255, 0); // Green

        System.out.println("color1 equals color2: " + color1.equals(color2)); // Should return true
        System.out.println("color1 equals color3: " + color1.equals(color3)); // Should return false
    }
}
