package MoodAnalyser;

public class MoodAnalysisException extends Exception {
    private final MoodAnalyser.MoodAnalysisError errorType;

    public MoodAnalysisException(String message, MoodAnalyser.MoodAnalysisError errorType) {
        super(message);
        this.errorType = errorType;
    }

    public MoodAnalyser.MoodAnalysisError getErrorType() {
        return this.errorType;
    }
}
