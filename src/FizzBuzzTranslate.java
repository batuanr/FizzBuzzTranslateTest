public class FizzBuzzTranslate {
    public static String getTranslate(int number) {

        String translate = getTranslateNumber(number);

        if (getFizz(number) && getBuzz(number)) {
            translate = "FizzBuzz";
        }
        else {
            if (getBuzz(number)) {
                translate = "Buzz";
            }
            else {
                if (getFizz(number)){
                    translate = "Fizz";
                }
            }
        }
        return translate;
    }
    public static boolean getFizz(int number) {
        boolean isDivisibleBy3 = number % 3 == 0;
        boolean isDivisibleByDozens = number % 10 == 3;
        boolean isDivisibleByUnits = (number - number % 10) / 10 == 3;
        if ( isDivisibleBy3 || isDivisibleByDozens || isDivisibleByUnits) {
            return true;
        }
        return false;
    }
    public static boolean getBuzz(int number) {
        boolean isDivisibleBy5 = number % 5 == 0;
        boolean isDivisibleByUnits = (number - number % 10) / 10 == 5;
        if ( isDivisibleBy5 || isDivisibleByUnits) {
            return true;
        }
        return false;
    }
    public static String getTranslateNumber(int number) {
        String translate = null;
        int dozens = number % 10;
        int units = (number - number % 10) / 10;
        if (number < 10) {
             translate = getTranslateLessThan10(number);
        }
        else {
            translate = getTranslateLessThan10(units) + " " + getTranslateLessThan10(dozens);
        }
        return translate;
    }
    public static String getTranslateLessThan10 (int number) {
        String translate = null;
        switch (number) {
            case 1:
                translate = "mot";
                break;
            case 2:
                translate = "hai";
                break;
            case 4:
                translate = "bon";
                break;
            case 6:
                translate = "sau";
                break;
            case 7:
                translate = "bay";
                break;
            case 8:
                translate = "tam";
                break;
            case 9:
                translate = "chin";
                break;
        }
        return translate;
    }
}
