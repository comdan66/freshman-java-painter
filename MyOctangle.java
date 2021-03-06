import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class MyOctangle extends MyShape{
	public MyOctangle( int x1, int y1, int x2, int y2,Color color,Color leftcolor,Color rightcolor, boolean filled ,int big){
		super(x1,y1,x2,y2,color,leftcolor,rightcolor,filled,big);
	}
	
	public int getp1x( ){ return super.getx1( ) + ( super.getwidth ( ) /3) *1 ; }
	public int getp1y( ){ return super.gety1( ) ; }
	public int getp2x( ){ return super.getx1( ) ; }
	public int getp2y( ){ return super.gety1( ) + ( super.getheight( ) /3) *1 ; }
	public int getp3x( ){ return super.getx1( ) ; }
	public int getp3y( ){ return super.gety1( ) + ( super.getheight( ) /3) *2 ; }
	public int getp4x( ){ return super.getx1( ) + ( super.getwidth ( ) /3) *1 ; }
	public int getp4y( ){ return super.gety2( ) ; }
	public int getp5x( ){ return super.getx1( ) + ( super.getwidth ( ) /3) *2 ; }
	public int getp5y( ){ return super.gety2( ) ; }
	public int getp6x( ){ return super.getx2( ) ; }
	public int getp6y( ){ return super.gety1( ) + ( super.getheight( ) /3) *2 ; }
	public int getp7x( ){ return super.getx2( ) ; }
	public int getp7y( ){ return super.gety1( ) + ( super.getheight( ) /3) *1 ; }
	public int getp8x( ){ return super.getx1( ) + ( super.getwidth ( ) /3) *2 ; }
	public int getp8y( ){ return super.gety1( ) ; }
	
	public void draw( Graphics g ){
		Graphics2D g2d = ( Graphics2D ) g; 
		if ( super.getisfilled() ){
			g2d.setStroke( new BasicStroke( 1 ) ); 
			g2d.setPaint( new GradientPaint( super.getx1(),super.gety1() , super.getleftcolor(), super.getx2(), super.gety2(),super.getrightcolor(),  true ) );  
			g2d.draw( new Line2D.Double( getp1x(), getp1y(), getp2x(), getp2y() ));
			g2d.draw( new Line2D.Double( getp2x(), getp2y(), getp3x(), getp3y() ));
			g2d.draw( new Line2D.Double( getp3x(), getp3y(), getp4x(), getp4y() ));
			g2d.draw( new Line2D.Double( getp4x(), getp4y(), getp5x(), getp5y() ));
			g2d.draw( new Line2D.Double( getp5x(), getp5y(), getp6x(), getp6y() ));
			g2d.draw( new Line2D.Double( getp6x(), getp6y(), getp7x(), getp7y() ));
			g2d.draw( new Line2D.Double( getp7x(), getp7y(), getp8x(), getp8y() ));
			g2d.draw( new Line2D.Double( getp8x(), getp8y(), getp1x(), getp1y() ));
		}
		else{
			g2d.setStroke( new BasicStroke( super.getbig() ) ); 
			g2d.setPaint( super.getcolor() );    
			g2d.draw( new Line2D.Double( getp1x(), getp1y(), getp2x(), getp2y() ));
			g2d.draw( new Line2D.Double( getp2x(), getp2y(), getp3x(), getp3y() ));
			g2d.draw( new Line2D.Double( getp3x(), getp3y(), getp4x(), getp4y() ));
			g2d.draw( new Line2D.Double( getp4x(), getp4y(), getp5x(), getp5y() ));
			g2d.draw( new Line2D.Double( getp5x(), getp5y(), getp6x(), getp6y() ));
			g2d.draw( new Line2D.Double( getp6x(), getp6y(), getp7x(), getp7y() ));
			g2d.draw( new Line2D.Double( getp7x(), getp7y(), getp8x(), getp8y() ));
			g2d.draw( new Line2D.Double( getp8x(), getp8y(), getp1x(), getp1y() ));
		}
	} 
}
