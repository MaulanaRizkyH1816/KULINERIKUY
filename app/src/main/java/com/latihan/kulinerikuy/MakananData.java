package com.latihan.kulinerikuy;

import java.util.ArrayList;

import static com.latihan.kulinerikuy.Makanan.makanan;

public class MakananData {
    private static final String[] makananNames = {
            "Asinan Bogor",
            "Bebek Betutu",
            "Gudeg",
            "Kerak Telor",
            "Mie Aceh",
            "Papeda",
            "Rendang",
            "Soto Banjar"
            "Pempek",
            "Rawon"
    };

    private static final String[] makananDetails = {
            "Asinan Bogor merupakan kuliner khas Bogor yang sangat populer di kota Bogor. Asinan Bogor terdiri dari dua jenis asinan, yaitu asinan buah dan asinan sayur. Asinan Bogor memiliki rasa asam, manis, dan pedas.",
            "Betutu adalah lauk yang terbuat dari ayam atau bebek yang utuh yang berisi bumbu, kemudian dipanggang dalam api sekam. Betutu ini telah dikenal di seluruh kabupaten di Bali. Betutu merupakan jenis makanan tradisional daerah Bali yang bahan mentahnya berupa karkas utuh itik dan ayam. ",
            "Gudeg merupakan kuliner yang tidak bisa dipisahkan dengan kota Yogyakarta bahkan sampai-sampai Yogyakarta memiliki julukan sebagai kota Gudeg. Gudeg asli Yogyakarta memiliki rasa yang sangat manis. Gudeg terbuat dari sayur nangka muda bersantan yang biasa dinikmati dengan nasi, ayam kampung, dan telur kecap.",
            "Makanan khas dari Jakarta yang satu ini sebenarnya merupakan perpaduan dari kuliner Portugis. Kerak telor mudah ditemui di Jakarta terutama pada saat diadakannya  Pekan Raya Jakarta bahkan kerak telor acap kali dijadikan simbol kuliner klasik budaya Betawi.",
            "Mie Aceh memiliki tekstur yang tebal dan berwarna kekuningan. Mie Aceh disajikan dalam bentuk mie goreng dan mie basah dengan irisan daging sapi atau kambing. Mie Aceh yang sebenarnya memiliki rasa pedas yang menyengat dan bumbu pekat/kental.",
            "Papeda adalah Daerah Indonesia Timur memiliki makanan pokok yang terbuat dari sagu. Salah satu makanan khas daerah Maluku terpopuler yang terbuat dari sagu adalah papeda. Papeda merupakan makanan pokok daerah Maluku sebagai pengganti nasi. Biasanya, papeda dinikmati dengan tambahan lauk hewani berupa ikan kuah.",
            "Rendang khas dari suku Minangkabau ini merupakan makanan yang sudah tersebar di berbagai penjuru Indonesia karena rendang merupakan salah satu menu wajib dari Rumah Makan Padang. Rendang memiliki citarasa pedas dan bumbu yang pekat. Berdasarkan proses memasak rendang ini, rendang padang sangat tahan lama.",
            "Soto Banjar adalah soto khas suku Banjar, Kalimantan Selatan dengan bahan utama ayam serta memiliki aroma harum rempah-rempah seperti kayu manis, biji pala, dan cengkih. Adakalanya pembuatan kuah soto banjar dapat dicampurkan dengan sedikit susu yang membuat warna kuahnya mejadi tidak bening, tetapi sedikit keruh",
            "Pempek palembang merupakan salah satu kuliner Indonesia dari Sumatera Selatan yang cukup terkenal. Pempek terbuat dari tepung sagu dan ikan (biasanya ikan tenggiri). Pempek biasa disajikan dengan kuah cuka. Pempek memiliki beberapa jenis, dan diantaranya yang paling dikenal orang adalah pempek kapal selam yang berisi telur rebus.",
            "Sup dengan potongan daging rawon asal Surabaya ini sangat terkenal di daerah Pulau Jawa. Soto rawon Surabaya ini memiliki ciri khas yang terletak pada kuahnya. Kuah dari soto rawon ini tidak menggunakan kecap akan tetapi menggunakan kluwek."
    };
    private static final int[] makananImage={
            R.drawable.asinanbogor,
            R.drawable.bebekbetutu,
            R.drawable.gudegkendil,
            R.drawable.keraktelor,
            R.drawable.mieaceh,
            R.drawable.papeda,
            R.drawable.rendang,
            R.drawable.sotobanjar,
            R.drawable.pempek,
            R.drawable.rawon
    };

    static ArrayList getListData(){
        ArrayList list = new ArrayList();
        for(int position = 0; position < makananNames.length; position++){
            makanan = new Makanan();
            makanan.setName(makananNames[position]);
            makanan.setDetail(makananDetails[position]);
            makanan.setPhoto(makananImage[position]);
        }
        return list;
    }
}

