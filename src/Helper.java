import java.util.Map;

// Class that contains music data
public class Helper {

    // Array of the 12 musical notes
    public static final String[] notes = new String[]{"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

    // Maps scales to the intervals that comprise them
    public static final Map<String, String[]> scaleTypes = Map.ofEntries(
            Map.entry("Ionian", new String[]{"P1", "M2", "M3", "P4", "P5", "M6", "M7"}),
            Map.entry("Dorian", new String[]{"P1", "M2", "m3", "P4", "P5", "M6", "m7"}),
            Map.entry("Phrygian", new String[]{"P1", "m2", "m3", "P4", "P5", "m6", "m7"}),
            Map.entry("Lydian", new String[]{"P1", "M2", "M3", "A4", "P5", "M6", "M7"}),
            Map.entry("Mixolydian", new String[]{"P1", "M2", "M3", "P4", "P5", "M6", "m7"}),
            Map.entry("Aeolian", new String[]{"P1", "M2", "m3", "P4", "P5", "m6", "m7"}),
            Map.entry("Locrian", new String[]{"P1", "m2", "m3", "P4", "d5", "m6", "m7"}),
            Map.entry("Harmonic Minor", new String[]{"P1", "M2", "m3", "P4", "P5", "m6", "M7"}),
            Map.entry("Minor Pentatonic", new String[]{"P1", "m3", "P4", "P5", "m7"}),
            Map.entry("Major Pentatonic", new String[]{"P1", "M3", "P4", "P5", "M7"})
    );

    // Maps intervals to the number of semitones that comprise them
    public static final Map<String, Integer> intervals = Map.ofEntries(
            Map.entry("P1", 0),
            Map.entry("m2", 1),
            Map.entry("M2", 2),
            Map.entry("m3", 3),
            Map.entry("M3", 4),
            Map.entry("P4", 5),
            Map.entry("A4", 6),
            Map.entry("d5", 6),
            Map.entry("P5", 7),
            Map.entry("m6", 8),
            Map.entry("M6", 9),
            Map.entry("m7", 10),
            Map.entry("M7", 11)
    );

    // Maps interval codes to their long names
    public static final Map<String, String> intervalsLong = Map.ofEntries(
            Map.entry("P1", "Perfect Unison"),
            Map.entry("m2", "Minor Second"),
            Map.entry("M2", "Major Second"),
            Map.entry("m3", "Minor Third"),
            Map.entry("M3", "Major Third"),
            Map.entry("P4", "Perfect Fourth"),
            Map.entry("A4", "Augmented Fourth"),
            Map.entry("d5", "Diminished Fifth"),
            Map.entry("P5", "Perfect Fifth"),
            Map.entry("m6", "Minor Sixth"),
            Map.entry("M6", "Major Sixth"),
            Map.entry("m7", "Minor Seventh"),
            Map.entry("M7", "Major Seventh"),
            Map.entry("P8", "Perfect Octave")
    );
}
