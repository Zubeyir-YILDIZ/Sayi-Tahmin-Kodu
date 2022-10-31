import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        int tahmin= rnd.nextInt(100);
        int girilenSayi;
        System.out.println("Kaç hak istersiniz? "); int hak=input.nextInt();
        int depo=hak;
        while(hak>0)
        {
            int sayac=0;
            System.out.println("1-100 arasında bir sayı giriniz ");  girilenSayi=input.nextInt();

            if(girilenSayi>100||girilenSayi<0)
            {
                System.out.println("Tahmin sınırını aştınız!");
            }
            else
            {
                if(girilenSayi>tahmin)
                {
                    sayac++;
                    hak--;
                    System.out.println("Yanlış tahmin ! Kalan Hakkınız: "+hak);
                    if(hak>0)
                        System.out.println("İPUCU: daha düşük değerleri deneyiniz");
                }
                else if(girilenSayi<tahmin)
                {
                    sayac++;
                    hak--;
                    System.out.println("Yanlış tahmin ! Kalan Hakkınız: "+hak);
                    if(hak>0)
                        System.out.println("İPUCU: daha yüksek değerleri deneyiniz");
                }
                else
                {
                    System.out.println("Tebrikler "+(depo-hak)+".tahmininizde bildiniz.");
                    break;
                }
                if(hak==0)
                    System.out.println("Üzgünüz kaybettiniz ");
            }
        }
    }
}

