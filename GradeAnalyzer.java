import java.util.Scanner;

public class GradeAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" STUDENT GRADE & CLASS ANALYZER");
        System.out.println("       Relative Grading / 50");
        System.out.println("======================================");

        // Taking input
        System.out.print("Enter your marks (out of 50): ");
        double yourMarks = sc.nextDouble();

        System.out.print("Enter class average (out of 50): ");
        double classAverage = sc.nextDouble();

        System.out.print("Enter highest marks (out of 50): ");
        double highestMarks = sc.nextDouble();

        System.out.print("Enter lowest marks (out of 50): ");
        double lowestMarks = sc.nextDouble();


        // Basic validation
        if (yourMarks < 0 || yourMarks > 50 ||
            classAverage < 0 || classAverage > 50 ||
            highestMarks < 0 || highestMarks > 50 ||
            lowestMarks < 0 || lowestMarks > 50) {

            System.out.println("\nInvalid marks!");
            System.out.println("All marks must be between 0 and 50.");

            sc.close();
            return;
        }


        // Difference from class average
        double difference = yourMarks - classAverage;


        // Calculate position between lowest and highest
        double range = highestMarks - lowestMarks;

        double relativePosition = 0;

        if (range > 0) {
            relativePosition =
                    ((yourMarks - lowestMarks) / range) * 100;
        }


        // Relative Grade
        String grade;

        if (yourMarks >= highestMarks - (range * 0.10)) {
            grade = "S";
        }
        else if (yourMarks >= classAverage + (range * 0.10)) {
            grade = "A";
        }
        else if (yourMarks >= classAverage - (range * 0.10)) {
            grade = "B";
        }
        else if (yourMarks >= classAverage - (range * 0.25)) {
            grade = "C";
        }
        else if (yourMarks >= lowestMarks + (range * 0.10)) {
            grade = "D";
        }
        else {
            grade = "F";
        }


        // Performance compared with class average
        String performance;

        if (yourMarks > classAverage) {
            performance = "Above Class Average";
        }
        else if (yourMarks < classAverage) {
            performance = "Below Class Average";
        }
        else {
            performance = "Equal to Class Average";
        }


        // Display result
        System.out.println();
        System.out.println("========== RESULT ==========");

        System.out.printf("Your Marks       : %.2f / 50%n", yourMarks);
        System.out.printf("Class Average    : %.2f / 50%n", classAverage);
        System.out.printf("Highest Marks    : %.2f / 50%n", highestMarks);
        System.out.printf("Lowest Marks     : %.2f / 50%n", lowestMarks);

        System.out.println("----------------------------");

        System.out.printf("Difference       : %.2f marks%n", difference);
        System.out.println("Performance      : " + performance);
        System.out.println("Relative Grade   : " + grade);

        System.out.printf(
            "Relative Position: %.2f%%%n",
            relativePosition
        );

        System.out.println("============================");

        sc.close();
    }
}
