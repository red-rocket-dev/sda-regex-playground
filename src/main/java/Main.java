import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Pattern - na później, roznica miedzy matches, a find
        //String.replaceAll
        //String.split
        //String.matches
        //Pamiętać o escape characters!
        //TODO: split
        //0. Sprawdzanie numeru telefonu
        String phoneNumber = "987123-123";
        boolean isPhoneNumber = phoneNumber.matches( "(\\d{3}[ -]?){2}\\d{3}");


        //test.test@gmail.com

        //jak zamienic caly numer na tylko jego pierwsze 3 liczby
        String first3Numbers = phoneNumber.replaceAll("(\\d{3})[ -]?\\d{3}[ -]?\\d{3}", "$1");
        //w jakiej kolejnosci sa grupy rozpatrywane

        String first3NumbersAdv = phoneNumber.replaceAll("((\\d)(\\d)(\\d))[ -]?\\d{3}[ -]?\\d{3}", "first group: $1 2nd:$2");
        System.out.println(first3NumbersAdv);

        //System.out.println("Czy to jest numer telefonu? " + isPhoneNumber);

        System.out.println("alternatywa regex");
        String test1 = "123";
        System.out.println(test1.matches("\\d{3}|[a-zA-Z]{3}"));
        System.out.println("[ab] regex");
        String test2 = "ba";
        System.out.println(test2.matches("[ab]{2}"));

        System.out.println("ala ma kota regex");
        // jak zrobic czesciowe sprawdzenie stringa
        String sentence = "ala ma kota!asdasdasd";
        System.out.println(sentence.matches("[ao]la ma kota.*"));


        //                         (\d{3}[ -]?){2}\d{3}

        //1. Chcę zamienić wszystkie źle napisane wystąpienia słowa Jaaavaaaa na Java
        System.out.println("1.");
        String javaReplace = "Hej, Javaaaa jest wspaniałaaaa. Naprawdę PoWiNieneś się Nauczyć Jaaaaaavaaaaa";
        String properSentence = javaReplace.replaceAll("J+a+v+a+", "Java");
        System.out.println(properSentence);
        //2. Ktoś niechlujnie odseparował kolumny różnymi znakami specjalnymi i nie mogę ich odczytać w excelu, ani zsumowac
        System.out.println("2.");
        String csvReplaceAndSum = "1;323:3}{18+23";
        String[] numbers = csvReplaceAndSum.split("\\D+");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
        //System.out.println(Arrays.toString(numbers));
        //3. Chciałbym sprawdzić czy została wprowadzony poprawny adres według wzoru ul. NazwaUlicy numerDomu/opcjonalnieNumerMieszkania
        System.out.println("3.");
        String streetTest1 = "ul. Grabowa 1";
        String streetTest2 = "ul$ Kwiatowa 5";
        String streetTest3 = "ul. Opolska 5/12";


        // .+? -> a

    }
}
