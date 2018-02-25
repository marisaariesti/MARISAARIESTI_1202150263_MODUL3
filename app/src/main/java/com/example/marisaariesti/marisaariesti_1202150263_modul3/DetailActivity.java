package com.example.marisaariesti.marisaariesti_1202150263_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private TextView Nmerek, Pmerek;
    private ImageView imgmenu;
    TextView jmlhliter;
    ImageView batterayy;
    Button btplus, btmin;
    int i = 1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //inisiasi id yang sesuai

        Nmerek = (TextView) findViewById(R.id.merekdetail);
        Pmerek = (TextView) findViewById(R.id.merekpenjelasan);
        imgmenu = (ImageView) findViewById(R.id.imagedetail);
        batterayy = (ImageView) findViewById(R.id.imageView_batteray);
        btplus = (Button) findViewById(R.id.btnplus);
        btmin = (Button) findViewById(R.id.btnmin);
        jmlhliter = (TextView) findViewById(R.id.litter);

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (batterayy.getDrawable().getLevel()+1<=5){
                    i= i + 1 ;
                    jmlhliter.setText(i + "L");
                    batterayy.setImageLevel(batterayy.getDrawable().getLevel()+1);
                }else { batterayy.setImageLevel(5);
                    Toast.makeText(DetailActivity.this, "sudah penuh", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (batterayy.getDrawable().getLevel()-1>=0){
                    i = i - 1 ;
                    jmlhliter.setText(i + "L");
                    batterayy.setImageLevel(batterayy.getDrawable().getLevel()-1);
                }else { batterayy.setImageLevel(0);
                    Toast.makeText(DetailActivity.this, "tinggal sedikit", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Intent data = getIntent();
        String menu = data.getStringExtra("nama");
        String penminuman = data.getStringExtra("pminuman");
        Integer gmbr = data.getIntExtra("gambar", 0);

        Nmerek.setText(menu);
        Pmerek.setText(penminuman);
        imgmenu.setImageResource(gmbr);

    }
}
