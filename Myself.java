import java.util.Scanner;

class Myself {
    public static void main(String[] args) {
        System.out.printf("My Name: %s \n", ("Adarsh Agarwal"));
        System.out.printf("Father's Name: %s \n", ("Pradeep Agarwal"));
        System.out.printf("Postal Address: %s \n", ("Kharagpur"));
        System.out.printf("Contact Number: %s \n", ("9618029732"));
    }
}

class CalculateGrossSalary {
    public static void main(String[] args) {
        int basicSalary = 8600;
        double DA = 0.2 * basicSalary;
        double HRA = 0.1 * basicSalary;
        double CTA = 0.12 * basicSalary;
        double grossSalary = basicSalary + DA + HRA + CTA;

        System.out.println(grossSalary);
    }
}

class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tempInCelsius = sc.nextDouble();
        double tempInFahrenheit = ((9 / 5.0) * tempInCelsius) + 32;

        sc.close();

        if (tempInFahrenheit > 98.6)
            System.out.println("Fever");
        else
            System.out.println("Normal");
    }
}

class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marksInEnglish = sc.nextFloat();
        float marksInPhy = sc.nextFloat();
        float marksInChem = sc.nextFloat();
        float marksInBiology = sc.nextFloat();
        float marksInMaths = sc.nextFloat();

        sc.close();

        double average = (marksInEnglish + marksInPhy + marksInChem + marksInBiology + marksInMaths) / 5.0;

        // Assuming the full marks a student can get for each of the subject is 100
        if (average > 80) {
            System.out.println("Eligible for Computer Science.");
        } else {
            System.out.println("Eligible for Biology.");
        }
    }
}

class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float[] sideLengths = new float[3];
        float[] sideAngles = new float[3];
        // boolean flag = false;

        for (int i = 0; i < 3; i++)
            sideAngles[i] = sc.nextFloat();
        // sideLengths[i] = sc.nextFloat();

        sc.close();

        // if (sideLengths[0] > (sideLengths[1] + sideLengths[2]))
        // if (sideLengths[1] > (sideLengths[0] + sideLengths[2]))
        // if (sideLengths[2] > (sideLengths[0] + sideLengths[1]))
        // flag = true;
        // if (flag)
        if (sideAngles[0] + sideAngles[1] + sideAngles[2] == 180)
            System.out.println("Triangle is possible!!");
        else
            System.out.println("Triangle is not possible!!");

    }
}
