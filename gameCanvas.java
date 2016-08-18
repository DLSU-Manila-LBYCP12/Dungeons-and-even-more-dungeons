import java.awt.Canvas;
import java.awt.Graphics;
import acm.graphics.*;

public class gameCanvas extends GCanvas
{
    public double main;
    public int mistake;
    public GLabel wrong, currentt;

    private static final int SCAFFOLD_HEIGHT = 360;
    private static final int BEAM_LENGTH = 144;
    private static final int ROPE_LENGTH = 18;
    private static final int HEAD_RADIUS = 36;

    /*public void reset()
    {
        removeAll();

        double xaxis = getWidth()/2 - BEAM_LENGTH;
        main = (getHeight() - SCAFFOLD_HEIGHT) * 0.25 + ROPE_LENGTH;
        double guesss = main + SCAFFOLD_HEIGHT;
        currentt = new GLabel("");
        currentt.setLocation(xaxis, guesss + HEAD_RADIUS / 2);
        currentt.setFont("Calibri-40");
        add(currentt);
        wrong = new GLabel("");
        wrong.setLocation(xaxis, guesss + HEAD_RADIUS);
        add(wrong);
    }*/

    public void setPicture(GImage image){
    add(image);
}


    public void displayWord(String word)
    {
        currentt.setLabel(word);
    }

}