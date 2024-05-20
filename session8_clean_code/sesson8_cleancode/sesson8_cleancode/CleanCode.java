package sesson8_cleancode;

public class CleanCode {
    

    public int getDayOfMonth(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }

    }

    public boolean isLeapYear(int year) {
        boolean isDivisibleBy400 = year % 400 == 0;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        return isDivisibleBy400 || (isDivisibleBy4 && !isDivisibleBy100);
    }

    public static void main(String[] args) {
        CleanCode cleanCode = new CleanCode();
        System.out.println(cleanCode.getDayOfMonth(2000, 2));
    }
}
