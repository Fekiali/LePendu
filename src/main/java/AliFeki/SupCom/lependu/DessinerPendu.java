package AliFeki.SupCom.lependu;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class DessinerPendu extends View {
    Paint paint = new Paint();

    public DessinerPendu(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
    }

    public void BonHomme(Canvas canvas, int n) {
        switch (n) {
            case 1:
                canvas.drawLine(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 2 * 2, canvas.getHeight() / 2, paint);
                break;
            case 2:1111
                canvas.drawLine(canvas.getWidth() / 4 * 3, canvas.getHeight() / 2, canvas.getWidth() / 4 * 3, 0, paint);
                break;
            case 3:
                canvas.drawLine(canvas.getWidth() / 4 * 3, 0, canvas.getWidth() / 3, 0, paint);
                break;
            case 4:
                canvas.drawLine(canvas.getWidth() / 3, 0, canvas.getWidth() / 3, canvas.getHeight() / 10, paint);
                break;
            case 5:
                canvas.drawCircle(canvas.getWidth() / 3, canvas.getHeight() / 7, 50, paint);
                break;
            case 6:
                canvas.drawLine(canvas.getWidth() / 3, canvas.getHeight() / 8, canvas.getWidth() / 3, canvas.getHeight() / 3, paint);
                break;
            case 7:
                canvas.drawLine(canvas.getWidth() / 3, canvas.getHeight() / 4, canvas.getWidth() / 5, canvas.getHeight() / 5, paint);
                break;
            case 8:
                canvas.drawLine(canvas.getWidth() / 3, canvas.getHeight() / 4, canvas.getWidth() / 6 * 3 - 15, canvas.getHeight() / 5, paint);
                break;
            case 9:
                canvas.drawLine(canvas.getWidth() / 3, canvas.getHeight() / 3, canvas.getWidth() / 5, canvas.getHeight() / 5 * 2, paint);
                break;
            case 10:
                canvas.drawLine(canvas.getWidth() / 3, canvas.getHeight() / 3, canvas.getWidth() / 6 * 3 - 15, canvas.getHeight() / 5 * 2, paint);
                break;
        }
    }
}