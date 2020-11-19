package entities;

import entities.enums.Color;

public abstract class Shape {
	public Color color;

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape(Color color) {
		this.color = color;
	}

	public abstract Double area();
	
}
