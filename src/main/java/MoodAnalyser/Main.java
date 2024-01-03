package MoodAnalyser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mood Analyser program!");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your message:");
            String moodInput = sc.nextLine();

            MoodAnalyser moodAnalyser = new MoodAnalyser(moodInput); // Creating object of MoodAnalyser class
            System.out.println(moodAnalyser.analyseMood()); // Calling analyseMood method
        } catch (MoodAnalysisException e) {
            if (e.getErrorType() == MoodAnalyser.MoodAnalysisError.EMPTY_MOOD) {
                System.err.println("Empty Message: " + e.getMessage());
            } else if (e.getErrorType() == MoodAnalyser.MoodAnalysisError.NULL_MOOD) {
                System.err.println("Null Message: " + e.getMessage());
            }
        } finally {
            sc.close();
        }
    }
}