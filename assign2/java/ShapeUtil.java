package com.assign2.java;

public class ShapeUtil {
	public static void drawShapes(Shape[] list) {
	    for (int i = 0; i < list.length; i++) {
	      // Draw a shape, no matter what it is
	      list[i].draw(); // Late binding
	    }
	    
	}
	
	public static void printShapeDetails(Shape[] list) {
	    for (int i = 0; i < list.length; i++) {
	      // Gather details about the shape
	     	  }
	}

	public static void main(String[] args) {

		Shape[] shapeList = new Shape[2];
		ShapeUtil.drawShapes(shapeList);
		
		ShapeUtil.printShapeDetails(shapeList);
	}

}
