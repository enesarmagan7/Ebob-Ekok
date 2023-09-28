package Letcode;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
      //Degiskenleri tanimliyoruz.
        int ekok = 0,a,b,kucuk,buyuk;
        int ebob=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        a=sc.nextInt();
        System.out.println("İkinci Sayıyı giriniz: ");
        b=sc.nextInt();
        //kucuk ve buyuk sayıyı ayırt etmek icin degiskenlere ayırıyoruz.
        if(a>b) {
            buyuk=a;
            kucuk=b;
        }else{
            buyuk=b;
            kucuk=a;
        }
        //Ebob degerini bulma
        int i=1;
        while(i <= kucuk){
            //Dongu kucuk sayi kadar donuyor.
            //Sayılar i degiskenine ortak bölünüyorsa ebobu i' ye esitliyoruz. En sonunda gerçek ebob degerini buluyoruz.
            if(kucuk%i==0 && buyuk%i==0){
                ebob=i;
            }
            i++;

        }
        int k=1;

        //Ekok degerini bulma
        while(k <= kucuk){
            //Dongu kucuk sayi kadar donuyor.
            //Buyuk sayinin katlari eger kucuk sayiya kalansız bolunuyorsa ekok degerini bulmus oluyoruz.
            if((buyuk*k)%kucuk==0){
                ekok=buyuk*k;
                break;
            }
            k++;
        }
        //Sonucları ekrana yazdir.
        System.out.println("Ebob : "+ ebob);
        System.out.println("Ekok : "+ ekok);
    }
}
