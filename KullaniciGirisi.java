import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password,newPassword,changePassword;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz : ");
        userName = inp.nextLine();
        System.out.print("Sifrenizi Giriniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Basariyla Giris Yapildi");
        } else if (!userName.equals("patika") && !password.equals("java123")){

            System.out.println("Hatali giris yaptiniz");
            System.out.print("Sifrenizi sifirlamak ister misiniz (Evet/Hayir) : ");
            changePassword = inp.nextLine();
            if(changePassword.equals("Evet")){
                System.out.print("Yeni sifrenizi giriniz : ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")){
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz");
                }
                else {
                    System.out.print("Sifre olusturuldu.");
                }
            }

        }
    }
}