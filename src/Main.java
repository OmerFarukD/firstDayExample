import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //todo: Kullanıcıdan isim ve soyisimi aldıktan sonra ekrana isim : , soyisim : şeklinde ekran çıktısı veriniz.
/*        System.out.println("Lütfen adınızı giriniz : ");
        String name = scanner.nextLine();

        System.out.println("Lütfen soyadınızı giriniz : ");
        String surname = scanner.nextLine();

        System.out.println("İsminiz :"+name+" Soyadınız :"+surname);*/

        //todo : Kullanıcıdan 2 tane sayı alalım ve aldığımız sayıların toplamını , çarpımını , bölümünü , farkını alan ekran çıktısını yazınız.

/*        System.out.println("Lütfen 1. sayıyı giriniz. ");
        double sayi1 = scanner.nextDouble();

        System.out.println("Lütfen 2. sayıyı giriniz. ");
        double sayi2 = scanner.nextDouble();

        double toplam = sayi1 + sayi2;
        double carpma = sayi1 * sayi2;
        double fark = sayi1 - sayi2;
        double bolum = sayi1 / sayi2;

        double mod = sayi1 % sayi2;

        System.out.println(sayi1 + "ile "+sayi2+" nin toplamı :"+toplam);
        System.out.println(sayi1 + "ile "+sayi2+" nin çarpımı :"+carpma);
        System.out.println(sayi1 + "ile "+sayi2+" nin farkı :"+fark);
        System.out.println(sayi1 + "ile "+sayi2+" nin bölümü :"+bolum);
        System.out.println(mod);*/

        // Yorum satırı : Ctrl  shift  /

        // boolean : Boolean veri tipi sadece 2 değer alır true , false

        // if else

        //todo : Kullanıcının yaşı 18 den küçükse ehliyet alamaz aksi takdirde ehliyet alabilir

/*        System.out.println("Lütfen Yaşınızı giriniz : ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Ehliyet alamazsınız.");
        } else {
            System.out.println("Ehliyet alabilirsiniz.");
        }*/
        // todo : kullanıcıdan bir puan isteyiniz ve koşullar şu şekilde olmalıdır.
        // 1. Koşul = Kullanıcının girmiş olduğu puan 10 ise 3. oldunuz ekran çıktısı
        // 2. Koşul = Kullanıcının girmiş olduğu puan 20 ise 2. oldunuz ekran çıktısı
        // 3. Koşul =  Kullanıcının girmiş olduğu puan 30 ise 1. oldunuz ekran çıktısı
        // 4. Koşul =  Kullanıcının girmiş olduğu puan 10 , 20 veya 30 dışında bir sayı ise hatalı puan girdiniz ekran çıktısı.



        // 1. yöntem + + +
        System.out.println("Lütfen puan giriniz :");
        int puan = scanner.nextInt();

        if (puan==10){
            System.out.println("1.Yöntem: 3. oldunuz");
        }
        else if (puan == 20){
            System.out.println("1.Yöntem: 2. oldunuz");
        }
        else  if (puan==30){
            System.out.println("1.Yöntem: 1. oldunuz");
        }
        else {
            System.out.println("1.Yöntem: hatalı puan girdiniz");
        }

        //2. Yöntem (switch-case) +
        switch (puan){
            case 10:
                System.out.println("2.Yöntem: 3. oldunuz");
                break;
            case 20 :
                System.out.println("2.Yöntem: 2. Oldunuz");
                break;
            case 30 :
                System.out.println("2.Yöntem: 1. Oldunuz.");
                break;
            default:
                System.out.println("2.Yöntem: Hatalı puan girdiniz.");
        }

        //3. Yöntem (switch-case) +
        String  sonuc = switch(puan){
            case 10 -> "3. Yöntem : 3. Oldunuz";
            case 20-> "3. Yöntem : 2. Oldunuz";
            case 30 -> "3. Yöntem : 1. Oldunuz";
            default -> "3. Yöntem : Hatalı puan girdiniz.";
        };
        System.out.println(sonuc);

        // Mantıksal Operatörler
        // && operatörü
        // || operatörü

        // ve operatörü (&&) her iki koşul doğru ise sonuç olarak bize true döner 2 koşuldan sadece 1 i yanlış olsa sonuç olarak false döner
        // veya operatörü (||)  her iki koşuldan sadece  biri doğruysa true döner

        boolean dogruluk1 = 3<5 && 15==25;
//                          true  ve false = false

        boolean dogruluk2 = 5>4 || 85>54;

        boolean dogruluk3 = 3!=5 || 97==97;

        boolean dogruluk4 = 78>= 87 && 76 !=69;
/*
        System.out.println(dogruluk1);  // false
        System.out.println(dogruluk2); // true
        System.out.println(dogruluk3); // true
        System.out.println(dogruluk4); // false*/

        // todo: Kullanıcıdan aldığımız bilgiler sonucunda kullanıcının parası 500000 den fazla ve 18 yaşından büyük ise Araba alabilir.
        // Aksi takdirde araba alamaz ekran çıktısı isteniyor.

        System.out.println("Lütfen yaşınızı giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("Lütfen harcayabileceğiniz max para miktarını giriniz: ");
        int money = scanner.nextInt();

        if (money>500000 && yas>18){
            System.out.println("Araba alabilirsiniz.");
        }else{
            System.out.println("Araba alamazsınız.");
        }

    }




}
