import java.util.Scanner;

public class Main {

    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    //Yukarıdaki kod satılarında; önce s1 değişkeni oluşturulduğunda "Welcome" kelimesi Java'nın String Pool yapısına düşer.
    // s2 ve s3 Stringleri de s1 ile aynı olduğu için s2 ve s3 nesneleri s1 nesnesinin referansını kullanır. Bu yüzden sadece 1 nesne üretilmiş olur.


    //static ve String data tipinde <<code>> değişkeni
    static String data = "<<code>>";


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfString = 0;

        System.out.println("Kaç adet kelime gireceksiniz ? (En az 5 string girebilirsiniz)");
        numberOfString = input.nextInt();

        if (numberOfString >= 5) {
            String[] stringArray = new String[numberOfString];
            for (int i = 0; i < numberOfString; i++) {
                System.out.print("String giriniz: ");
                stringArray[i] = input.next();
            }
            System.out.println(isInclude(stringArray));

        } else {
            System.out.println("En az 5 string girmelisiniz.");
        }
    }

    //Dönüş tipi String olan ve String[] parametre alan metod.
    public static String isInclude(String[] stringArray) {

        String definedValueString = "";
        String output = "";
        for (String s : stringArray) {
            if (s.equals(data)) {
                definedValueString = s;
                output = "Tanimli value yu içeren String değer: " + definedValueString;
                break;
            } else {
                return output = "Tanımlı value yu içeren String değer yoktur.";
            }
        }
        return output;
    }
}


