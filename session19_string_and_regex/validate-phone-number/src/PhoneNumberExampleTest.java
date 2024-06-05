public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;
    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(84)-(0978123654)", "(84)-(0342487549)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(9978489648)", "(84)-(22b22222)"};
    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for(String phoneNumber : validPhoneNumber) {
            boolean isValid = phoneNumberExample.validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
        for(String phoneNumber : invalidPhoneNumber) {
            boolean isValid = phoneNumberExample.validatePhoneNumber(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isValid);
        }
    }
}