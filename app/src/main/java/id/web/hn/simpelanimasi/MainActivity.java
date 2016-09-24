package id.web.hn.simpelanimasi;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img1, img2;
    Button btn;
    boolean isAnimasi;
    Drawable drawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageView) findViewById(R.id.img);
        img2 = (ImageView) findViewById(R.id.imageView2);
        btn = (Button) findViewById(R.id.button);

        drawable = img1.getDrawable();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jalankanAnimasi();
            }
        });
    }

    private void jalankanAnimasi(){
        //menjalankan animasi
        if(drawable instanceof Animatable) {
            if(!isAnimasi){
                ((Animatable) drawable).start();
                isAnimasi = true;
            } else {
                ((Animatable) drawable).stop();
                isAnimasi = false;
            }

        }
    }
}
