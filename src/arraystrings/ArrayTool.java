package arraystrings;

public class ArrayTool {

    public String[] add(String[] elements, String value) {
        String[] newArray = new String[elements.length + 1];
        int i = 0;

        for (String data: elements) {
            newArray[i++] = data;
        }

        newArray[newArray.length - 1] = value;

        return newArray;
    }
}
