package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Ayam;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Ayam> intDataAyam(Context ctx) {
        List<Ayam> ayams = new ArrayList<>();
        ayams.add(new Ayam("Tukung", "Pontianak",
                "Ayam Tukung merupakan salah satu dari jenis-jenis ayam di Indonesia yang cukup langka untuk ditemukan. \n \n Ciri khasnya terletak pada bentuk fisiknya sendiri, yang mana ayam ini tidak memiliki bulu pada ekornya ", R.drawable.ayam_tukung));
        ayams.add(new Ayam("Pelung", "Cinajur",
                "Hewan yang termasuk dalam jenis-jenis ayam di Indonesia ini, termasuk ayam buras khas tanah air yang banyak ditemukan di daerah Cianjur, Jawa Barat. \n \n Suara kokokannya yang unik dan berirama jadi salah satu unggulan dari Ayam Pelung.", R.drawable.ayam_pelung));
        ayams.add(new Ayam("Ayunai", "JayaPura",
                "Jenis ini memiliki bentuk tubuh yang oval dan cenderung lebih besar ketimbang jenis-jenis ayam kampung biasa. \n \n  Keunikannya terletak pada bagian leher yang tampak gundul, karena bulunya hanya terdapat pada bagian bawah tembolok hingga ekor.",R.drawable.ayam_ayunai));
        ayams.add(new Ayam("Ciparage" ,"Karawang",
                "Ini adalah jenis ayam petarung lokal terbaik yang berasal dari daerah Ciparage, Karawang, Jawa Barat. \n \n  Konon Ayam Ciparage pertama kali dimiliki oleh keturunan bangsawan, yaitu Duke Raden Adipati Singaperbangsa, yang merupakan seorang Pangeran Kekaisaran Sunda.",R.drawable.ayam_ciparage));
        ayams.add(new Ayam("Balanggek","Jayapura",
                "Pada jenis pejantannya, ayam ini memiliki suara kokokan yang unik seperti Ayam Pelung. \n \n  Bahkan, Balenggek yang tergolong dalam jenis ayam penyanyi ini memiliki kokok kan yang bervariasi, mulai dari 6 tingkatan hingga 24 tingkatan.",R.drawable.ayam_balanggek));

        return ayams;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(intDataAyam(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
