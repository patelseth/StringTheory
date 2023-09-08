import java.util.ArrayList;
import java.util.List;

public final class Scale {

    private final String scaleName;
    private final String scaleKey;
    private String[] scaleIntervals;
    private List<String> scaleNotes;


    public Scale(String scaleName, String key) {
        this.scaleName = scaleName;
        this.scaleKey = key;
        generateScaleData();
    }

    private void generateScaleData() {
        scaleIntervals = Helper.scaleTypes.get(scaleName);
        scaleNotes = new ArrayList<>();

        List<String> notes = new ArrayList<>(List.of(Helper.notes));
        List<String> temp = new ArrayList<>();

        for (int i = 0; i < notes.indexOf(scaleKey); i++) {
            temp.add(notes.get(i));
        }

        notes.removeAll(temp);
        notes.addAll(temp);

        for (String scaleInterval : scaleIntervals) {
            int i = Helper.intervals.get(scaleInterval);
            scaleNotes.add(notes.get(i));
        }
    }

    public void printScaleData() {

        System.out.println("\n" + scaleKey + " " + scaleName);

        System.out.println("\nNotes:\n" + scaleNotes);

        System.out.println("\nIntervals:");

        for (String scaleInterval : scaleIntervals) {
            System.out.println(Helper.intervalsLong.get(scaleInterval));
        }
    }
}
