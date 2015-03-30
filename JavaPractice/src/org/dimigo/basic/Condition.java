package org.dimigo.basic;

public class Condition {
	public static void main(String args[]) {
		
		String car="고속버스";
		int distance=10;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("차종 : "+car);
		System.out.println("거리 : "+distance+"km");
		
		switch(car) {
		case "고속버스" :
			System.out.println("통행료 : "+(850+((distance-1)/10)*300)+"원");
			break;
		case "경차" :
			System.out.println("통행료 : "+(300+((distance-1)/10)*200)+"원");
			break;
		default :
			System.out.println("통행료 : "+(600+((distance-1)/10)*200)+"원");
			break;
		}
		
	}
}
