//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

@SuppressWarnings("serial")
public class SmileyFace extends Canvas
{
   //constructor - sets up the class
   //Allows us to create a SmileyFace object in the the runner class
   public SmileyFace()  
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

		//add more code here
      window.setColor(Color.GREEN);
      window.fillOval( 275, 200, 75, 50 );
      
      window.setColor(Color.GREEN);
      window.fillOval( 470, 200, 75, 50 );
      
      window.setColor(Color.BLACK);
      window.fillOval( 385, 300, 50, 50 );
      
      window.setColor(Color.RED);
      window.fillArc( 310, 350, 200, 75, 525,200 );
   }
}