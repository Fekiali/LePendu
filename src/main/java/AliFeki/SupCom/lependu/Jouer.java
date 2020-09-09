    package AliFeki.SupCom.lependu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.Canvas;

import java.io.IOException;


@SuppressWarnings("ALL")
public class Jouer extends Activity {
    ImageView dessierImageView;
    public static Intent intent ;
	
	Ecriremot mots;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer);
        intent = getIntent();
        dessierImageView = (ImageView) this.findViewById(R.id.imageView);
        Bitmap bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        dessierImageView.setImageBitmap(bitmap);
        try {
            mots = new Ecriremot(this);
            mots.dessinerTraitDemots(canvas);


        } catch (IOException e) {
            e.printStackTrace();
        }

        final Button bouton_a = (Button) findViewById(R.id.bouton_a);
        bouton_a.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_a.setEnabled(false);
                mots.EcrireLetters(canvas, "a");

            }
        });
        final Button bouton_b = (Button) findViewById(R.id.bouton_b);
        bouton_b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_b.setEnabled(false);
                mots.EcrireLetters(canvas,"b");
            }
        });
        final Button bouton_c = (Button) findViewById(R.id.bouton_c);
        bouton_c.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_c.setEnabled(false);
                mots.EcrireLetters(canvas,"c");
            }
        });
        final Button bouton_d = (Button) findViewById(R.id.bouton_d);
        bouton_d.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_d.setEnabled(false);
                mots.EcrireLetters(canvas,"d");
            }
        });
        final Button bouton_e = (Button) findViewById(R.id.bouton_e);
        bouton_e.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_e.setEnabled(false);
                mots.EcrireLetters(canvas,"e");
            }
        });
        final Button bouton_f = (Button) findViewById(R.id.bouton_f);
        bouton_f.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_f.setEnabled(false);
                mots.EcrireLetters(canvas,"f");
            }
        });
        final Button bouton_g = (Button) findViewById(R.id.bouton_g);
        bouton_g.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_g.setEnabled(false);
                mots.EcrireLetters(canvas,"g");
            }
        });
        final Button bouton_h = (Button) findViewById(R.id.bouton_h);
        bouton_h.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_h.setEnabled(false);
                mots.EcrireLetters(canvas,"h");
            }
        });
        final Button bouton_i = (Button) findViewById(R.id.bouton_i);
        bouton_i.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_i.setEnabled(false);
                mots.EcrireLetters(canvas,"i");
            }
        });
        final Button bouton_j = (Button) findViewById(R.id.bouton_j);
        bouton_j.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_j.setEnabled(false);
                mots.EcrireLetters(canvas,"j");
            }
        });
        final Button bouton_k = (Button) findViewById(R.id.bouton_k);
        bouton_k.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_k.setEnabled(false);
                mots.EcrireLetters(canvas,"k");
            }
        });
        final Button bouton_l = (Button) findViewById(R.id.bouton_l);
        bouton_l.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_l.setEnabled(false);
                mots.EcrireLetters(canvas,"l");
            }
        });
        final Button bouton_m = (Button) findViewById(R.id.bouton_m);
        bouton_m.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_m.setEnabled(false);
                mots.EcrireLetters(canvas,"m");
            }
        });
        final Button bouton_n = (Button) findViewById(R.id.bouton_n);
        bouton_n.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_n.setEnabled(false);
                mots.EcrireLetters(canvas,"n");
            }
        });
        final Button bouton_o = (Button) findViewById(R.id.bouton_o);
        bouton_o.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_o.setEnabled(false);
                mots.EcrireLetters(canvas,"o");
            }
        });
        final Button bouton_p = (Button) findViewById(R.id.bouton_p);
        bouton_p.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_p.setEnabled(false);
                mots.EcrireLetters(canvas, "p");
            }
        });
        final Button bouton_q = (Button) findViewById(R.id.bouton_q);
        bouton_q.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_q.setEnabled(false);
                mots.EcrireLetters(canvas,"q");
            }
        });
        final Button bouton_r = (Button) findViewById(R.id.bouton_r);
        bouton_r.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_r.setEnabled(false);
                mots.EcrireLetters(canvas,"r");
            }
        });
        final Button bouton_s = (Button) findViewById(R.id.bouton_s);
        bouton_s.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_s.setEnabled(false);
                mots.EcrireLetters(canvas,"s");
            }
        });
        final Button bouton_t = (Button) findViewById(R.id.bouton_t);
        bouton_t.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_t.setEnabled(false);
                mots.EcrireLetters(canvas,"t");
            }
        });
        final Button bouton_u = (Button) findViewById(R.id.bouton_u);
        bouton_u.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_u.setEnabled(false);
                mots.EcrireLetters(canvas,"u");
            }
        });
        final Button bouton_v = (Button) findViewById(R.id.bouton_v);
        bouton_v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_v.setEnabled(false);
                mots.EcrireLetters(canvas,"v");
            }
        });
        final Button bouton_w = (Button) findViewById(R.id.bouton_w);
        bouton_w.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_w.setEnabled(false);
                mots.EcrireLetters(canvas,"w");
            }
        });
        final Button bouton_x = (Button) findViewById(R.id.bouton_x);
        bouton_x.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_x.setEnabled(false);
                mots.EcrireLetters(canvas,"x");
            }
        });
        final Button bouton_y = (Button) findViewById(R.id.bouton_y);
        bouton_y.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_y.setEnabled(false);
                mots.EcrireLetters(canvas,"y");
            }
        });
        final Button bouton_z = (Button) findViewById(R.id.bouton_z);
        bouton_z.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bouton_z.setEnabled(false);
                mots.EcrireLetters(canvas,"z");
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jouer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Parametre) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
