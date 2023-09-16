//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.*;

@SuppressWarnings("serial")
public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.CYAN);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
	   bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.PINK);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.WHITE);

      window.fillRect( 250, 300, 100, 100 );
      window.setColor(Color.WHITE);

      window.fillRect( 450, 300, 100, 100 );
      window.setColor(Color.BLACK);

      window.fillRect( 350, 400, 100, 300 );
      window.setColor(Color.YELLOW);

      window.fillOval( 10, 100, 100, 100 );
      window.setColor(Color.WHITE);

      window.fillOval( 200, 30, 100, 30 );
      window.setColor(Color.WHITE);

      window.fillOval( 350, 40, 100, 30 );
      window.setColor(Color.WHITE);

      window.fillOval( 500, 30, 100, 30 );
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