//package week12_test;
//
//import week12.Student;
//
//public class MyRect extends MyShape {
//	private int x, y, width, height;
//	double area;
//	public MyRect(int x, int y,int width,int height) {
//		super(x,y);
//		this.x = x;
//		this.y = y;
//		this.width = width;
//		this.height = height;
//		area = width *height;  
//	}
//	public double getArea() {
//		// TODO Auto-generated method stub
//		return width*height;
//	}
//	public double getParameter() {
//		// TODO Auto-generated method stub
//		return 2*(width+height);
//	}
//	public int compareTo(Object obj) {
//		if(obj != null && obj instanceof Student) {
//			MyRect s = (MyRect)obj;
//			if(area>s.area)
//				return -1;
//			else if (area<s.area)
//				return 1;
//			else 
//				return 0;
//		}else
//			return -1;
//	}
//	
//}
