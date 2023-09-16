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
public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );

      // A simple triangle.
      int [] x = {180,400,620};
      int [] y = {200,100,200};
      int n = 3;
      
      // This polygon represents a triangle with the above vertices.
      Polygon p = new Polygon(x, y, n);  
      
      window.setColor(Color.red);
      window.fillPolygon(p);  
      
      //add more code here


   }
}