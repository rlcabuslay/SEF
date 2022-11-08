package sef.module6.activity;

/**
 * @author Ryan Vincent Cabuslay
 * 
 * This class represents a point in 3D space.  The coordinates are represented by
 * a set of values x, y an z that represents the coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D{
	
	private double z;
	
	/**
	 * Creates a Point3D object with the default coordinate of 0,0,0 
	 *
	 */
	public Point3DImpl(){
		
	}
	
	/**
	 * Creates a Point3D object at the specified coordinates
	 * 
	 * @param x coordinate along the x axis
	 * @param y coordinate along the y axis
	 * @param z coordinate along the z axis
	 */
	public Point3DImpl(double x, double y, double z){
		super(x, y);
		this.z = z;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#setZ(double)
	 */
	public final void setZ(double z){
		this.z = z;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getZ(){
		return this.z;
	}
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#move(double, double, double)
	 */
	public void move(double x2, double y2, double z2){
		super.move(x2, y2);
		this.z = z2;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#translate(double, double, double)
	 */
	public void translate(double x2, double y2, double z2){
		super.setX(super.getX() + x2);
		super.setY(super.getY() + y2);
		this.z += z2;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#equals(double, double, double)
	 */
	public boolean equals(double x2, double y2, double z2){
		if((super.getX() == x2) && (super.getY() == y2) && (this.z == z2)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	/**
	 * Compares if the coordinates are equal to the coordinates specified by the parameter
	 * 
	 * @param p the coordinates to compare
	 * 
	 * @return true if the parameter is an instance of Point3D and contain the same coordinates, false otherwise
	 */
	public boolean equals(Object p){
		if(p instanceof Point3D) {
			Point3D point = (Point3D) p;
			
			if((super.getX() == point.getX()) && (super.getY() == point.getY()) && (this.z == point.getZ())) {
				return true;
			}
			else {
				return false;
			}
		} else {
			return false;
		}
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
	 */
	public double getDistance(Point3D p){
		double distance = Math.sqrt(Math.pow((p.getX() - super.getX()), 2) + Math.pow((p.getY() - super.getY()), 2) + Math.pow((p.getZ() - this.z), 2));
		return distance;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(double, double, double)
	 */
	public double getDistance(double x2, double y2, double z2){
		double distance = Math.sqrt(Math.pow((x2 - super.getX()), 2) + Math.pow((y2 - super.getY()), 2) + Math.pow((z2 - this.z), 2));
		return distance;
	
	}
	

}
