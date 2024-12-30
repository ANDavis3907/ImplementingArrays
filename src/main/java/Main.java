package main.java;

//This java program is designed to calculate the area of a rectangle. It will prompt the user to enter dimensions of the rectangle and then calculate the area of the rectangle,
//then calculate the area and print the results. This program can also calculate the volume of a sphere, cylindar or cube by using object-oriented principles.

import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class sphere {
    double radius;

    public void setDimensions(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class cylindar {
    double radius;
    
    public void setDimensions(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class cube {
    double side;

    public void setDimensions(double side) {
        this.side = side;
    }

    public double getVolume() {
        return Math.pow(side, 3);
    }
}
public class Main {
    public static void main(string [] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //Rectangle area calculation
            System.out.println("Enter Rectangle Dimensions:");
            System.out.print("Length: ");
            double rectangleLength = scanner.nextDouble();
            System.out.print("Width: ");
            double rectangleWidth = scanner.nextDouble();

            if (rectangleLength < 0 || rectangleWidth < 0) {
                System.out.println("Invalid dimensions. Please enter positive values.");
            } else {
                Rectangle rectangle = new Rectangle();
                rectangle.setDimensions(rectangleLength, rectangleWidth);
                double rectangleArea = rectangle.getArea();
                System.out.println("Rectangle Area: " + rectangle.getArea());
            }

            //Sphere volume calculation
            System.out.println("Enter Sphere Radius:");
            System.out.print("Radius: ");
            double sphereRadius = scanner.nextDouble();

            if (sphereRadius < 0) {
                System.out.println("Invalid radius. Please enter a positive value.");
            } else {
                sphere sphere = new sphere(sphereRadius);
                double sphereVolume = sphere.getVolume();
                System.out.println("Sphere Volume: " + sphereVolume);
            }

            //Cylindar volume calculation
            System.out.println("\nEnter Cylindar Dimensions:");
            System.out.print("Radius: ");
            double cylindarRadius = scanner.nextDouble();
            System.out.print("Height: ");
            double cylindarHeight = scanner.nextDouble();

            if (cylindarRadius < 0 || cylindarHeight < 0) {
                System.out.println("Invalid dimensions. Please enter positive values.");
            } else {
                cylindar cylindar = new cylindar(cylindarRadius, cylindarHeight);
                double cylindarVolume = cylindar.getVolume();
                System.out.println("Cylindar Volume: " + cylindarVolume);
            }

            //Cube volume calculation
            System.out.println("\nEnter Cube Dimensions:");
            System.out.print("Side: ");
            double cubeSide = scanner.nextDouble();

            if (cubeSide < 0) {
                System.out.println("Invalid side length. Please enter a positive value.");
            } else {
                cube cube = new cube(cubeSide);
                double cubeVolume = cube.getVolume();
                System.out.println("Cube Volume: " + cubeVolume);
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            } finally {
                scanner.close(); 
            }
        }
    }