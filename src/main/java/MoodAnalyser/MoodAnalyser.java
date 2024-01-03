package MoodAnalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() { // Default constructor
        this.message = ""; // Default message
    }

    // Constructor with message parameter
    public MoodAnalyser(String message) { // Parameterized constructor
        this.message = message;
    }

    // MoodAnalysisError Enum
    public enum MoodAnalysisError {
        NULL_MOOD, EMPTY_MOOD
    }

    public String analyseMood() throws MoodAnalysisException {
        if (this.message == null) {
            throw new MoodAnalysisException("Invalid Mood: Message is null", MoodAnalysisError.NULL_MOOD);
        }

        if (this.message.trim().isEmpty()) {
            throw new MoodAnalysisException("Invalid Mood: Message is empty", MoodAnalysisError.EMPTY_MOOD);
        }

        String lowerCaseMessage = this.message.toLowerCase(); // Converting message to lower case

        if (lowerCaseMessage.contains("sad")){
            return "Sad";
        } else {
            return "Happy";
        }
    }
}
