package AliFeki.SupCom.lependu;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import java.io.InputStream;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.Random;

public class Ecriremot extends View {
    Paint paint = new Paint();
    ArrayList<String> ListeDeMot = new ArrayList<String>();
    int nombreAleatoire;
    int nombreLettreDeviner;
    String motADeviner = new String();
    int nbreErreur = 0;
    DessinerPendu bonhomme ;
    int longeurDeMot;
    public static AlertDialog.Builder alert1;
    public static AlertDialog.Builder alert2;
    public Ecriremot(final Context context) throws IOException {
        super(context);
        alert1 = new AlertDialog.Builder(context);
        alert1.setMessage("Tu as perdu!");
        alert1.setCancelable(true);
        alert1.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        ((Jouer) context).finish();
                        context.startActivity(Jouer.intent);
                    }
                });
        alert2 = new AlertDialog.Builder(context);
        alert2.setMessage("Tu as gagné!");
        alert2.setCancelable(true);
        alert2.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                        ((Jouer) context).finish();
                        context.startActivity(Jouer.intent);
                    }
                });
        bonhomme = new DessinerPendu(context);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        paint.setTextSize(100);
        try {
            InputStream in = getResources().openRawResource(R.raw.mots);
            DocumentBuilder builder = DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder();
            Document doc = builder.parse(in, null);
            NodeList mots = doc.getElementsByTagName("word");

            for (int i = 0; i < mots.getLength(); i++) {
                ListeDeMot.add(((Element) mots.item(i)).getAttribute("value"));
            }
            in.close();
        } catch (Throwable t) {
            t.printStackTrace();
        }
        Random rand = new Random();
        nombreAleatoire = rand.nextInt(ListeDeMot.size());
    }

    public void dessinerTraitDemots(Canvas canvas) {

        motADeviner = ListeDeMot.get(nombreAleatoire);
        longeurDeMot = motADeviner.length();



        int pas = 20;
        for(int i=0;i<longeurDeMot;i++){
            canvas.drawLine(pas,canvas.getHeight() / 3 * 2,60+pas,canvas.getHeight() / 3 * 2,paint);
            pas+=80;
        }

    }

    public void EcrireLetters(Canvas canvas, String letter) {
        motADeviner = ListeDeMot.get(nombreAleatoire);
        int pas = 20;
        if(motADeviner.contains(letter)){
            for (int index = motADeviner.indexOf(letter);
                 index >= 0;
                 index = motADeviner.indexOf(letter, index + 1)) {
                canvas.drawText(letter, pas+(index*80), (canvas.getHeight() / 3 * 2) - 30, paint);
                nombreLettreDeviner++;
            }
        }
        else{
            nbreErreur++;
            bonhomme.BonHomme(canvas,nbreErreur);
            if(nbreErreur==10){
                AlertDialog alert11 = alert1.create();
                alert11.show();
            }
        }
        if(nombreLettreDeviner==longeurDeMot){
            AlertDialog alert22 = alert2.create();
            alert22.show();
        }


    }
}