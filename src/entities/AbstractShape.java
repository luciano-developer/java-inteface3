package entities;

import entities.enums.Color;

public abstract class AbstractShape implements Shape {
	public Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public AbstractShape(Color color) {
		this.color = color;
	}
	
}
