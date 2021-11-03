import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Geometry {

    public static void main(String[] args) {
        int Length;
        int Perm;
        int Area;
        int Dist;
        int[] Altitudes;
        int x1, x2, x3, y1, y2, y3;

        x1 = -1;
        x2 = 1;
        x3 = 6;
        y1 = -2;
        y2 = 5;
        y3 = -2;

        Length = Geo.Length(x1,x2,y1,y2);
        Perm = Geo.PermOfABC(x1,y1,x2,y2,x3,y3);
        Area = Geo.Area(x1,y1,x2,y2,x3,y3);
        Dist = Geo.Dist(x1,y1,x2,x3,y2,y3);
        Altitudes = Geo.Altitudes(x1,y1,x2,y2,x3,y3);

        System.out.println(Length);
        System.out.println(Perm);
        System.out.println(Area);
        System.out.println(Dist);
        System.out.println(Arrays.toString(Altitudes));

    }

   static class Geo
    {
        public static int Length(int x1, int x2, int y1, int y2){
            return (int) Math.sqrt((double)((x1-x2)*(x1-x2))+(y1-y2)*(y1-2));
        }

        public static int PermOfABC(int x1, int y1, int x2, int y2, int x3, int y3){
            return Length(x1,x2,y1,y2)+Length(x1,x2,y1,y2)+Length(x2,x3,y2,y3);
        }
        public static int Area(int x1, int y1, int x2, int y2, int x3, int y3){
            int p = PermOfABC(x1, y1, x2, y2, x3, y3)/2;
            return (int) Math.sqrt((p* ((p - Length(x1, x2, y1, y2)) * (p - Length(x1, x3, y1, y3)) * (p - Length(x2, x3, y2, y3)))));
        }

        public static int Dist(int x1, int y1, int x2, int x3, int y2, int y3){
            return 2*Area(x1,y1,x2,y2,x3,y3)/Length(x2,x3,y2,y3);
        }

        public static int[] Altitudes(int x1, int y1, int x2, int y2, int x3, int y3){
            int h1, h2, h3;

            h1=Dist(x1,y1,x2,x3,y2,y3);
            h2=Dist(x2,y2,x1,x3,y1,y3);
            h3=Dist(x3,y3,x1,x2,y1,y2);

            return new int[]{h1,h2,h3};
        }

    }



}
