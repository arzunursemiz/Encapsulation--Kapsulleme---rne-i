/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

public class Book {

    public String adi, yazar, yayinevi;
    private int sayfasayisi;

    public Book(String adi, String yazar, String yayinevi, int sayfasayisi) {
        this.adi = adi;
        this.yazar = yazar;
        this.yayinevi = yayinevi;
        if (sayfasayisi < 1) { //encapsulation yani sarmalama yaptıgımız kısım. Sarmalama ilkesi bir sınıfa ait degiskenlerin degerlerini ancak o sınıfın icine kodlanmıs metotlar tarafından degistirilebilmesi ve kullanılabilmesi ilkesidir.
            this.sayfasayisi = 10;
        } else {
            this.sayfasayisi = sayfasayisi;
        }

    }

    public int getSayfasayisii() {
        return this.sayfasayisi;
    }

    public void setSayfaSayisii(int yeniSayfa) {
        this.sayfasayisi = yeniSayfa;
    }
}


