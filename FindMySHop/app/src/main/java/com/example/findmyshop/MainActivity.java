package com.example.findmyshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    };


    public void main(View view) {
        setContentView(R.layout.main);}
    public void mall1(View view) {
        setContentView(R.layout.mall1);}
    public void mall2(View view) {
        setContentView(R.layout.mall2);}
    public void mall3(View view) {
        setContentView(R.layout.mall3);}
    public void mall4(View view) {
        setContentView(R.layout.mall4);}
    public void mall5(View view) {
        setContentView(R.layout.mall5);}
    public void mall6(View view) {
        setContentView(R.layout.mall6);}
    public void info (View view) {
        setContentView(R.layout.info);}


    public void callUs(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+966555555555"));
        startActivity(intent);
    }

    public void restaurant1(View view) {
        setContentView(R.layout.restaurant1);
    }
    public void stor1(View view) {
        setContentView(R.layout.stor1);
    }
    public void location1 (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com/maps/place/24.743818,46.657988"));
        startActivity(intent);    }



    public void restaurant2(View view) {
        setContentView(R.layout.restaurant2);
    }
    public void stor2(View view) {
        setContentView(R.layout.stor2);
    }
    public void location2 (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://maps.app.goo.gl/tuPswowQvGec2aBT9?g_st=ic"));
        startActivity(intent);    }
    public void exit(View view) {

        Button exitButton = findViewById(R.id.button_exit);

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Press and hold to exit", Toast.LENGTH_SHORT).show();
            }
        });

        exitButton.setOnLongClickListener(new View.OnLongClickListener() {
                                              @Override
                                              public boolean onLongClick(View v) {
                                                  finish(); // or System.exit(0) if running above Marshmallow
                                                  return true;
                                              }
                                          }
        );
    }
        public void restaurant3 (View view) {
            setContentView(R.layout.restaurant3);
        }
        public void stor3(View view) {
            setContentView(R.layout.stor3);
        }
        public void location3 (View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://maps.app.goo.gl/DE8NkgSX6pxWQCVAA?g_st=ic"));
            startActivity(intent);    }


    public void restaurant4 (View view) {
        setContentView(R.layout.restaurant4);
    }
    public void stor4(View view) {
        setContentView(R.layout.stor4);
    }
    public void location4 (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://maps.app.goo.gl/cKfNkhgYx1k5rQo37?g_st=it"));
        startActivity(intent);    }
    public void restaurant5 (View view) {
        setContentView(R.layout.restaurant5);
    }
    public void stor5(View view) {
        setContentView(R.layout.stor5);
    }
    public void location5 (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://maps.app.goo.gl/vt5yyt3FrVffbeNi7?g_st=it"));
        startActivity(intent);    }

    public void restaurant6 (View view) {
        setContentView(R.layout.restaurant6);
    }
    public void stor6(View view) {
        setContentView(R.layout.stor6);
    }
    public void location6 (View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://maps.app.goo.gl/bYkR6SJTKipzuTxR7?g_st=it"));
        startActivity(intent);    }


}


