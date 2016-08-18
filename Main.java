import acm.graphics.GImage;
import acm.program.ConsoleProgram;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.Console;

public class Main extends ConsoleProgram {
    public gameCanvas canvas;
    public GImage image,image2;
    private BST<String> bst = new BST<String>();
    private String command = new String();

    public static void main(String[] args) {new Main().start(args);}

    public void init()
    {
        canvas = new gameCanvas();
        image = new GImage("res/start.jpg");
        canvas.setPicture(image);
        add(canvas);
        bst.insert("Help");
        bst.insert("Hint");
        bst.insert("Inventory");
        bst.insert("Move East");
        bst.insert("Move North");
        bst.insert("Move South");
        bst.insert("Move West");
        bst.insert("Search");
        bst.insert("Start");
        bst.insert("Use");
    }


    public void startScreen(){
        println("                How to play the game");
        println("");
        println("");
        println("Drake Armiger was from a lineage of the clan called The Lost. He was next in " +
                "line to take care of the book, but before his father passed the knowledge onto him, " +
                "a group called “The Holy Order of Glemour” found out about the book and wanted to find it " +
                "and destroy the book because they believe that the very existence of the book to be an abomination. " +
                "His father, Nikolas Armiger, who was then the guardian of the book, was captured and questioned by " +
                "The Holy Order. Nikolas, frail of health, died because his heart gave out before he could give the instructions to Drake on where the book is. Drake found out that his father had died after being questioned by the order. Fearing for his and his mother’s safety, they escape, and before sending his mother to his uncle in a distant land, he was able to get exact location on where the book is but not how to get to it. He nevertheless went after the book to preserve it before it falls into the wrong hands.");
        pause(20000);
        println("");
        println("");
        println("This is a text based games that pushes you the player to use your imagination.");
        println("There are several commands that you can type to begin your adventure, some of these are listed below:");
        println("Type in 'Help' to see all the various commands that can be used");
        println("If you are stuck on a level, you can always type 'Hint' to get a clue");
        println("'Move North/South/East/West' to go in that direction to explore if possible");
        println("'Search' allows you to look for items in the surroundings");
        println("'Use' allows you to use an item that you have found");
        println("These are some of the basic commands that you can use.");
        println("When you are ready type in 'Start' to begin your adventure");
        command = readLine();
        if (bst.search(command)){
            game();
        }
    }

    public void game(){
        image = new GImage("res/black.jpg");
        canvas.setPicture(image);
        println("");
    }

    public void run()
    {
    startScreen();
    }
}
