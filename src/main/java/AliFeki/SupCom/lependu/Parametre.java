package AliFeki.SupCom.lependu;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.CompoundButton;

public class Parametre extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametre);
        Switch boutswitch = (Switch) findViewById(R.id.boutonswitch);
        if(MainActivity.mp.isPlaying()){
            boutswitch.setChecked(true);
        }
        else{
            boutswitch.setChecked(false);
        }
        boutswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    MainActivity.mp = MediaPlayer.create(Parametre.this, R.raw.music);
                    MainActivity.mp.setLooping(true);
                    MainActivity.mp.start();
                } else {
                    MainActivity.mp.stop();
                }
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_parametre, menu);
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
