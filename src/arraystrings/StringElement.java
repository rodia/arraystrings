package arraystrings;

public class StringElement {
    public int[] counter(String[] values) {
        int[] elements = new int[values.length];
        int i = 0;

        for (String value: values) {
            String comparision = (value != null) ? value : "";
            int counter = 0;

            for (String candidate: values) {
                if (candidate != null && candidate.equals(comparision)) {
                    counter++;
                }
            }

            elements[i++] = counter;
        }

        return elements;
    }

    private boolean elementsIn(String[] uniques, String comparision) {
        for (String value: uniques) {
            if (value != null && value.equals(comparision)) {
                return true;
            }
        }

        return false;
    }
}
