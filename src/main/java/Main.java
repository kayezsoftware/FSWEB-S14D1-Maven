import com.workintech.cylinder.*;
import com.workintech.pool.*;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        HRManager hr = new HRManager(1, "Ayşe", 15000, 2, 2, 2);
        JuniorDeveloper jd = new JuniorDeveloper(2, "Ali", 10000);
        MidDeveloper md = new MidDeveloper(3, "Zeynep", 15000);
        SeniorDeveloper sd = new SeniorDeveloper(4, "Murat", 20000);

        hr.addEmployee(jd);
        hr.addEmployee(md);
        hr.addEmployee(sd);

        hr.work();
        jd.work();
        md.work();
        sd.work();
    }
}