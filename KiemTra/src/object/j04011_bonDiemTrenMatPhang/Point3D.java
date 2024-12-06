
package object.j04011_bonDiemTrenMatPhang;


public class Point3D {
    private int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int abX = p2.x - p1.x;
        int abY = p2.y - p1.y;
        int abZ = p2.z - p1.z;

        int acX = p3.x - p1.x;
        int acY = p3.y - p1.y;
        int acZ = p3.z - p1.z;
        

        int adX = p4.x - p1.x;
        int adY = p4.y - p1.y;
        int adZ = p4.z - p1.z;
        
        int nX = abY * acZ - abZ * acY;
        int nY = abZ * acX - abX * acZ;
        int nZ = abX * acY - abY * acX;
        
        return nX * adX + nY * adY + nZ * adZ == 0;
    }
}
