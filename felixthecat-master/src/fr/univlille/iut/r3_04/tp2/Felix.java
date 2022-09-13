package fr.univlille.iut.r3_04.tp2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Felix {

	public void drawOn(GraphicsContext gc) {
		drawHead(gc);
		drawEyes(gc);
		/*drawEars(gc);
		drawWiskers(gc);*/
	}
	
	public void drawHead(GraphicsContext gc) {
		gc.setFill(Color.GREY);
		gc.fillOval(50, 50, 175, 200);
	}
	
	public void drawEyes(GraphicsContext gc) {
		gc.setFill(Color.BLUE);
		gc.fillOval(90, 100, 20, 40);
		gc.fillOval(160, 100, 20, 40);
	}
	

}
