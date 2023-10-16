package AriaCercului.src;

public class Circle {
    public static float pi;
    public static float radius;
    public static float aria;
    public float getPi() {
        return pi;
    }
    public float getRadius() {
        return radius;
    }
    public float getAria() {
        return aria;
    }

    public static void cheamaMetoda(){
        aria = pi*(radius*radius);
        System.out.println("aria este "+ aria);

    }

    public Circle(float getRadius){
        radius = getRadius;
    }

}
