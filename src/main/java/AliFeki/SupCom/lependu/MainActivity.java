package AliFeki.SupCom.lependu;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
    public static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AlertDialog.Builder alert1 = new AlertDialog.Builder(this);
        mp = MediaPlayer.create(MainActivity.this, R.raw.music);
        mp.setLooping(true);
        mp.start();
        alert1.setMessage("Ce jeux est réalisé par Ali Feki dans le cadre de projet développement mobile au sein de Sup'Com.");
        alert1.setCancelable(true);
        alert1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        Button bouton_apropos = (Button) findViewById(R.id.bouton_apropos);
        bouton_apropos.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                AlertDialog alert11 = alert1.create();
                alert11.show();
            }
        });
        Button bouton_parametres = (Button) findViewById(R.id.bouton_parametres);
        bouton_parametres.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Parametre.class);
                startActivity(intent);
            }
        });
        Button bouton_Jouer = (Button) findViewById(R.id.bouton_Jouer);
        bouton_Jouer.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Jouer.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

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
