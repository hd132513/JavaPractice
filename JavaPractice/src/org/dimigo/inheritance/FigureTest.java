/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ FigureTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author		: 김지현
 * @version		: 1.0
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c = new Circle(0,0,5);
		Triangle t = new Triangle(10,10,5,8);
		Rectangle r = new Rectangle(20,20,5,8);
	
		System.out.println("원의 넓이 : " + String.format("%.1f", c.calcArea()));
		System.out.println("삼각형 넓이 : " + String.format("%.1f", t.calcArea()));
		System.out.println("사각형 넓이 : " + String.format("%.1f", r.calcArea()));
		System.out.println("");
		
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
		System.out.println("");
		System.out.println("--중심좌표 이동 (x,y축 5씩)");
		c.moveFigure(5, 5);
		t.moveFigure(5, 5);
		r.moveFigure(5, 5);
		
		System.out.println("");
		c.printCenter();
		t.printCenter();
		r.printCenter();
		
	}

}
