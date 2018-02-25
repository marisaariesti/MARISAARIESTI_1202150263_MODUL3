package com.example.marisaariesti.marisaariesti_1202150263_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hasby on 25/02/2018.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<String> rvNammerk, rvpenjelasanmerk;
    private ArrayList<Integer> rvImg;

    public RecyclerViewAdapter(ArrayList<String> merekMinuman, ArrayList<String> penjelasanM, ArrayList<Integer> gambar) {
        rvNammerk = merekMinuman;
        rvpenjelasanmerk = penjelasanM;
        rvImg = gambar;
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView Merek;
        public TextView penjelasMerek;
        public ImageView gmbrmmerek;
        private RelativeLayout Listmerek;

        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            Merek = (TextView) itemView.findViewById(R.id.textView_namaminum);
            penjelasMerek = (TextView) itemView.findViewById(R.id.penmerekminum);
            gmbrmmerek= (ImageView) itemView.findViewById(R.id.imageView_minuman);
            Listmerek = itemView.findViewById(R.id.layoutminuman);

            Listmerek.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent myintent = new Intent(context,DetailActivity.class);
                    String merek = "";

                    switch (getAdapterPosition()) {

                        case 0:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi " +
                                    "Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. " +
                                    "Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 1:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Pristine 8+ merupakan Air minum Alkaline dengan kandungan pH 8+ (Melebihi 8) yang memberikan manfaat detoxifikabagi tubuh kita. Buat yang belum tau nih gan," +
                                    " air alkaline memilik banyak manfaat dan pastinya sangat baik untuk tubuh yang bisa menjaga keseimbangan kadar pH ";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;

                        case 2:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Le Minerale hadir sejak tahun 2015, air mineral dalam kemasan ini diproduksi oleh salah satu anak perusahaan Mayora Group. Le Minerale berasal dari sumber" +
                                    "mata air pegunungan terpilih dengan kandungan mineral alami yang baik bagi kesehatan.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 3:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Cleo diproses melalui teknologi hyper membrane filter 0,0001 mikron dan penuh kontrol kualitas di setiap titiknya yang memastikan mineral anorganik dan mikroorganisme terfilter secara maksimal." +
                                    "Kemasan Cleo terbuat dari bijih plastik 100%, tanpa bahan campuran atau daur ulang. Proses pembuatannya berstandar internasional AS/NZS ISO 22000:2005." +
                                    "Perusahaan yang memproduksi Cleo adalah yang pertama menerima sertifikat ini di Indonesia.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 4:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Club diproduksi oleh perusahaan Grup Tirta Bahagia sejak akhir tahun 1980. Kini perusahaan tersebut telah diakuisisi oleh Indofood," +
                                    "dan menjadi salah satu merek air mineral yang patut Anda jadikan pilihan untuk diminum sehari-hari!";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 5:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Amidis adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius" +
                                    "sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan, mineral anorganik maupun bahan kontaminasi lain seperti bahan kimia maupun bahan pestisida.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;

                        case 6:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Ades adalah merek air mineral atau air minum dalam kemasan (AMDK) yang diproduksi oleh PT. Coca-Cola Bottling Indonesia, Bekasi." +
                                    " Air mineral tersebut juga dikenal sebagai I-Lohas di Jepang. Kini The Coca-Cola Company merupakan pemilik merek dagang Ades," +
                                    "menggantikan PT. Akasha Wira Internasional atau PT. AdeS Waters Indonesia, pemilik merek dagang Ades sebelumnya.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 7:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Equil merupakan air mineral murni asli Indonesia produksi PT. Equilindo Lestari milik Morgen Sutanto. EQUIL mungkin masih asing di telinga kebanyakan masyarakat Indonesia." +
                                    "Namun merk air mineral murni ini sudah cukup dikenal kalangan menengah atas dan ekspatriat. Equil kerap hadir di meja restoran fine dining, hotel bintang lima, hingga meja Istana Negara saat rapat kabinet. ";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 8:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Evian adalah produk air mineral alami impor yang juga populer di Indonesia. Berasal dari bebatuan di bawah tanah," +
                                    "air mineral ini sangat alami dan diproses tanpa campur tangan manusia. Selama lebih dari 15 tahun, airnya menjalani proses natural filtration.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                        case 9:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "Nestle PureLife sebelumnya bernama Aberfoyle Springs sebelum akhirnya dibeli oleh perusahaan Nestle pada tahun 2002." +
                                    "Namanya berganti menjadi Nestle Pure Life Natural Spring Water. Untuk Anda yang mengedepankan gaya hidup eco, Anda bisa memilih produk ini.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;

                        case 10:
                            myintent.putExtra("nama", rvNammerk.get(getAdapterPosition()));
                            myintent.putExtra("gambar", rvImg.get(getAdapterPosition()));
                            merek = "VIT adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia." +
                                    "Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian," +
                                    "setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.";
                            myintent.putExtra("pminuman", merek);
                            context.startActivity(myintent);
                            break;
                    }
                }
            });

        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_minuman, parent, false);
        // mengeset ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vvholder = new ViewHolder(v);
        return vvholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rvNammerk.get(position);
        final String harga = rvpenjelasanmerk.get(position);
        final Integer test = rvImg.get(position);
        holder.Merek.setText(name);
        holder.penjelasMerek.setText(harga);
        holder.gmbrmmerek.setImageResource(test);

    }



    @Override
    public int getItemCount() {
        return rvNammerk.size();
    }


}
