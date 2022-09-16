package fr.univlille.iut.r3_04.tp2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Felix {

	public void drawOn(GraphicsContext gc) {
		drawHead(gc);
		drawEyes(gc);
		drawEars(gc);
		drawWiskers(gc);
		drawMouseCorp(gc);
		drawMouseEars(gc);
		drawMouseEye(gc);
		drawChapeau(gc);
	}

	public void drawHead(GraphicsContext gc) {
		gc.setFill(Color.GREY);
		gc.fillOval(50, 50, 185, 200);
	}

	public void drawEyes(GraphicsContext gc) {
		gc.setFill(Color.BLUE);
		gc.fillOval(90, 100, 20, 40);
		gc.fillOval(160, 100, 20, 40);
	}

	public void drawEars(GraphicsContext gc) {
		gc.setFill(Color.PURPLE);
		gc.fillPolygon(new double[] {240, 210, 190}, new double[] {50, 83, 65}, 3);
		gc.fillPolygon(new double[] {50, 75, 95}, new double[] {50, 83, 65}, 3);
	}

	public void drawWiskers(GraphicsContext gc) {
		gc.setFill(Color.PURPLE);
		gc.fillPolygon(new double[] {35,30, 140, 140}, new double[] {130, 135, 170, 165}, 4);
		gc.fillPolygon(new double[] {30,30, 140, 140}, new double[] {165, 170, 170, 165}, 4);
		gc.fillPolygon(new double[] {30,35, 140, 140}, new double[] {190, 195, 170, 165}, 4);

		gc.fillPolygon(new double[] {140, 140, 250, 240}, new double[] {165, 170, 140, 135}, 4);
		gc.fillPolygon(new double[] {140, 140, 250, 250}, new double[] {170, 165, 165, 170}, 4);
		gc.fillPolygon(new double[] {140, 140, 245, 240}, new double[] {170, 165, 190, 195}, 4);
	}

	public void drawMouseCorp(GraphicsContext gc) {
		gc.setFill(Color.GRAY);
		gc.fillOval(300, 200, 100, 40);
		gc.fillPolygon(new double[] {370, 450, 370}, new double[] {238, 238, 200}, 3);

	}

	public void drawMouseEars(GraphicsContext gc) {
		gc.setFill(Color.GRAY);
		gc.fillOval(360, 190, 30, 30);
	}

	public void drawMouseEye(GraphicsContext gc) {
		gc.setFill(Color.RED);
		gc.fillOval(380, 215, 10, 10);
	}

	public void drawChapeau(GraphicsContext gc) {
		drawChapeauBord(gc);
		drawChapeauCorp(gc);
		drawChapeauBandeau(gc);
	}


	public void drawChapeauBandeau(GraphicsContext gc) {
		gc.setFill(Color.RED);
		gc.fillRect(45, 55, 200, 10);
	}

	public void drawChapeauCorp(GraphicsContext gc) {
		gc.setFill(Color.YELLOW);
		gc.fillArc(45, 10, 200, 100, 0, 180 , ArcType.OPEN);
	}
	public void drawChapeauBord(GraphicsContext gc) {
		gc.setFill(Color.YELLOW);
		gc.fillOval(25, 60, 250, 20);
	}
}
