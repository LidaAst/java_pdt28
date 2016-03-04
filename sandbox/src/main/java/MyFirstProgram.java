 public class MyFirstProgram {
	 public static void main(String[] args) {

		 System.out.println("Privet, CheBurr!");

		 Point p1 = new Point(0, 1);
		/* p1.x = 0;
		 p1.y = 0;*/
		 Point p2 = new Point(2.5, 1);
		/* p2.x = 1;
		 p2.y = 1;*/
		 System.out.println("Distance between two points: (" + p1.x + ", " + p1.y + ") and (" + p2.x + ", " + p2.y + ") = " + p1.distance(p2));
	 }
/*
	 public static double distance(Point p1, Point p2) {
		 double l = (p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y);
		 return Math.sqrt(l);
	 }*/
 }
