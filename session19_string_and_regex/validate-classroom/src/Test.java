public class Test {
    private static ValidateClassName className;
    public static final String[] validClassName = new String[]{"C0223G", "A0323K"};
    public static final String[] invalidClassName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ValidateClassName();
        for (String name : validClassName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name " + name + " is valid: " + isValid);
        }

        for (String name : invalidClassName) {
            boolean isValid = className.validate(name);
            System.out.println("Class name " + name + " is valid: " + isValid);
        }
    }
}

