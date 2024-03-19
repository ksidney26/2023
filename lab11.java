public class Lab11 
{
    static class Box {
        private String name;
        private double length, width, height, density;
        private double area;
        private double weight;

        public Box(String name, double length, double width, double height) {
            this.name = name;
            this.length = length;
            this.width = width;
            this.height = height;
            this.density = 1.0;
            calcArea();
            calcWeight();
        }
        public Box(String name, double length, double width, double height, double density) {
            this.name = name;
            this.length = length;
            this.width = width;
            this.height = height;
            this.density = density;
            calcArea();
            calcWeight();
        }
        public Box(String name, double side) {
            this.name = name;
            this.length = side;
            this.width = side;
            this.height = side;
            this.density = 1.0;
            calcArea();
            calcWeight();
        }
        public Box(String name, double side, double density) {
            this.name = name;
            this.length = side;
            this.width = side;
            this.height = side;
            this.density = density;
            calcArea();
            calcWeight();
        }
        private void calcArea() {
            area = 2 * (length * width + width * height + height * length);
        }
        private void calcWeight() {
            weight = length * width * height * density;
        }
        public String info() {
            return String.format("Box %s - Length: %.2f, Width: %.2f, Height: %.2f, Density: %.2f, Area: %.2f, Weight: %.2f",
                    name, length, width, height, density, area, weight);
        }
    }

    static class Ball {
        private String name;
        private double radius;
        private double density;
        private double area;
        private double volume;
        private double weight;

        public Ball(String name, double radius, double density) {
            this.name = name;
            this.radius = radius;
            this.density = density;
            calcArea();
            calcWeight();
    }
        public Ball(String name, double diameter) {
            this.name = name;
            this.radius = diameter / 2;
            this.density = 1.0;
            calcArea();
            calcWeight();
    }
        public Ball(String name, double radius, double density, double weight) {
            this.name = name;
            this.radius = radius;
            this.density = density;
            this.weight = weight;
            calcArea();
    }
        private void calcWeight() {
            volume = 4.0 / 3.0 * 3.14159 * radius * radius * radius;
            weight = volume * density;
    }
        private void calcArea() {
            area = 4 * 3.14159 * radius * radius;
    }
        public String info() {
            return String.format("Ball %s - Radius: %.2f, Density: %.2f, Weight: %.2f, Area: %.2f, Volume: %.2f",
                name, radius, density, weight, area, volume);
    }
}
        static class Circle {
            private String name;
            private double radius;
            private double area;
            private double circumference;

        public Circle(String name, double radius) {
            this.name = name;
            this.radius = radius;
            calcArea();
            calcCircumference();
        }
        public Circle(String name, double diameter, double circumference) {
            this.name = name;
            this.radius = diameter / 2;
            this.circumference = circumference;
            calcArea();
        }
        private void calcArea() {
            area = 3.14159 * radius * radius;
        }
        private void calcCircumference() {
            circumference = 2 * 3.14159 * radius;
        }
        public String info() {
            return String.format("%s - Radius: %.2f, Area: %.2f, Circumference: %.2f",
                    name, radius, area, circumference);
        }
        public String getName() {
            return name;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return area;
        }
        public double getCircumference() {
            return circumference;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setRadius(double radius) {
            this.radius = radius;
            calcArea();
            calcCircumference();
        }
    }
    
    static class Person {
        private String name;
        private int birthYear;
        private char gender;
        
        public Person(String name, int birthYear, char gender) {
            this.name = name;
            this.birthYear = birthYear;
            this.gender = Character.toUpperCase(gender);
    }
        public Person(String name, int birthYear) {
            this(name, birthYear, 'U');
    }
        public Person(String name) {
            this(name, 0, 'U');
    }
        public String getName() {
            return name;
    }
        public int getBirthYear() {
            return birthYear;
    }
        public char getGender() {
            return gender;
    }
        public void setName(String name) {
            this.name = name;
    }
        public void setBirthYear(int birthYear) {
            this.birthYear = birthYear;
    }
        public void setGender(char gender) {
            this.gender = Character.toUpperCase(gender);
    }
        public int calculateAge() {
            return 2023 - birthYear;
    }
        public String getGenderString() {
            switch (gender) {
                case 'F':
                    return "Female";
                case 'M':
                    return "Male";
                default:
                    return "N/A";
        }
    }
        public String info() {
            return String.format("Person - Name: %s, Age: %d, Gender: %s",
                name, calculateAge(), getGenderString());
    }
}
    public static void main(String[] args) {

        Box bx1 = new Box("1", 10, 5, 2, 1);
        Box bx2 = new Box("2", 8, 4, 3, 2);
        Box bx3 = new Box("3", 12, 6, 1, 3);

        Ball bl1 = new Ball("1", 10, 1.2, 1);
        Ball bl2 = new Ball("2", 5, 2.5, 2);
        Ball bl3 = new Ball("3", 8, 1.1, 3);

        Circle cl1 = new Circle("1", 5);
        Circle cl2 = new Circle("2", 8);
        Circle cl3 = new Circle("3", 10);
        
        Person person1 = new Person("Karl", 1993, 'm');
        Person person2 = new Person("Ilan", 2003, 'M');
        Person person3 = new Person("Amy", 1995, 'f');

        System.out.println(bx1.info());
        System.out.println(bx2.info());
        System.out.println(bx3.info());

        System.out.println(bl1.info());
        System.out.println(bl2.info());
        System.out.println(bl3.info());

        System.out.println(cl1.info());
        System.out.println(cl2.info());
        System.out.println(cl3.info());
        
        System.out.println(person1.info());
        System.out.println(person2.info());
        System.out.println(person3.info());
    }
}
