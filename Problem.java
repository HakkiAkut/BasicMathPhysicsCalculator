import java.util.Scanner;
//Problem class
public class Problem {
    // Mathematic inner Class
    public static class Mathematic{
        //Circle inner class
        static class Circle extends Shape{
            //Method for calculating area of circle
            @Override
            void AreaCalculating() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("radius: ");
                int radius= scanner.nextInt();
                double Area=(radius*radius*Math.PI);
                System.out.print("Area of circle is "+ Area);
            }
            //Method for calculating length of circle
            @Override
            void LengthOfShape() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("radius: ");
                int radius= scanner.nextInt();
                double length= 2*radius*Math.PI;
                System.out.println("Length of circle is "+ length);
            }
        }
        //Triangle inner class
        static class Triangle extends Shape{
            //Method for calculating area of triangle
            @Override
            void AreaCalculating() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("edge 1: ");
                int edge1=scanner.nextInt();
                System.out.print("edge 2: ");
                int edge2=scanner.nextInt();
                System.out.print("edge 3: ");
                int edge3=scanner.nextInt();
                double u= (edge1+ edge2+ edge3)/2.0 ;
                double Area= Math.sqrt(u* (u- edge1)* (u- edge2)* (u- edge3));
                //This if statement checks existence of triangle
                if(Area>0) {
                    System.out.println("Area of triangle is "+ Area);
                }
                else{
                    System.out.println("This triangle can not be exist!");
                }

            }
            //Method for calculating length of triangle
            @Override
            void LengthOfShape() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("edge 1: ");
                int edge1=scanner.nextInt();
                System.out.print("edge 2: ");
                int edge2=scanner.nextInt();
                System.out.print("edge 3: ");
                int edge3=scanner.nextInt();
                int length = edge1+ edge2+ edge3;
                //Checking existence of triangle
                double u= (edge1+ edge2+ edge3)/2.0 ;
                double Area= Math.sqrt(u* (u- edge1)* (u- edge2)* (u- edge3));
                if(Area>0) {
                    System.out.println("Length of triangle is "+ length);
                }
                else{
                    System.out.println("This triangle can not be exist!");
                }

            }
        }
        //Quadrangle inner class
        static class Quadrangle extends Shape{
            //Method for calculating area of Quadrangle
            @Override
            void AreaCalculating() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("edge 1: ");
                int edge1= scanner.nextInt();
                System.out.print("edge 2: ");
                int edge2= scanner.nextInt();
                double Area= edge1*edge2;
                System.out.println("Area of quadrangle is "+ Area);
            }
            // Method for calculating length of quadrangle
            @Override
            void LengthOfShape() {
                Scanner scanner= new Scanner(System.in);
                System.out.print("edge 1: ");
                int edge1= scanner.nextInt();
                System.out.print("edge 2: ");
                int edge2= scanner.nextInt();
                int length = 2*(edge1+edge2);
                System.out.println("Length of quadrangle is "+ length);
            }
        }

    }
    //Physics inner Class
    public static class Physics{
        public static void InnerProduct(Vector v1, Vector v2){
            int innerproduct = v1.getI()* v2.getI() + v1.getJ()* v2.getJ() + v1.getK()+ v2.getK();
            System.out.println("Inner Product: " + innerproduct);
        }

        // Vector inner class
        public static class Vector{
            private int i;
            private int j;
            private int k;
            // Constructor method for Vector class
            public Vector(){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Value of i: ");
                this.i= scanner.nextInt();
                System.out.print("Value of j: ");
                this.j= scanner.nextInt();
                System.out.print("Value of k: ");
                this.k= scanner.nextInt();
            }
            //Getter and Setter methods
            public int getI() {
                return i;
            }

            public void setI(int i) {
                this.i = i;
            }

            public int getJ() {
                return j;
            }

            public void setJ(int j) {
                this.j = j;
            }

            public int getK() {
                return k;
            }

            public void setK(int k) {
                this.k = k;
            }
        }
    }





}
