package game;

import com.jogamp.opengl.GL2;

public class Graphics {
    
    public static void drawSquare() {
      GL2 gl = EventListener.gl;
      
      //Top
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( -10,10 );
      gl.glVertex2f( 10,10 );
      gl.glEnd();
      
      //Bottom
      gl.glBegin( GL2.GL_LINES );
      gl.glVertex2f( -10,-10 );
      gl.glVertex2f( 10,-10 );
      gl.glEnd();
      
      gl.glFlush();
    }
    
    public static void drawExample() {
        /*
    	gl.glColor3f(0,0,1);
    	gl.glBegin(gl.GL_QUADS);
        	gl.glVertex2f(-50,-50);
        	gl.glVertex2f(50,-50);
        	gl.glVertex2f(50,50);
        	gl.glVertex2f(-50,50);
    	//
    	gl.glEnd();*/
        
        gl.glColor4f(1,1,255,1);
      gl.glBegin( GL2.GL_QUADS );
      gl.glVertex2f(20,20);
      gl.glVertex2f(40,20);
      gl.glVertex2f(40,80);
      gl.glVertex2f(20,80);
      gl.glEnd();
    }
}
