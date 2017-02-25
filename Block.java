//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}

	//add other Block constructors - x , y , width, height, color
	Block(int x, int y, int w, int h){
		xPos=x;
		yPos=y;
		width=w;
		height=h;
	}
	Block(int x, int y, int w, int h, Color col){
		xPos=x;
		yPos=y;
		width=w;
		height=h;
		color=col;
	}
		
   //add the other set methods
	public void setPos(int x, int y) {
		xPos=x;
		yPos=y;
	}

	public void setX(int x) {
		xPos=x;		
	}
	public void setY(int y) {
		yPos=y;
	}

   public void setColor(Color col)   {
	   color=col;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(color);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		if(xPos==((Block)obj).getX()&&yPos==((Block)obj).getY()&&width==((Block)obj).getWidth()&&height==((Block)obj).getHeight())
			return true;
		return false;
	}

   //add the other get methods
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}   
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
   //add a toString() method  - x , y , width, height, color
	public String toString(){
		return ""+xPos+" "+yPos+" "+width+" "+height+" "+color;}
}