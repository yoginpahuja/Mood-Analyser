package MoodAnalyser;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    public void SadMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("Sad", mood);
    }

    @Test
    public void HappyMood() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        assertEquals("Happy", mood);
    }

    @Test
    public void NullMoodException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
    }

    @Test
    public void EmptyMoodException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        assertThrows(MoodAnalysisException.class, moodAnalyser::analyseMood);
    }
}
