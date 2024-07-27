class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        int numberOfPeople = names.length;

        // Create a TreeMap to store height-name pairs (automatically sorted by height)
        TreeMap<Integer, String> heightToNameMap = new TreeMap<>();

        // Populate the map with height as key and name as value
        for (int i = 0; i < numberOfPeople; i++) {
            heightToNameMap.put(heights[i], names[i]);
        }

        String[] sortedNames = new String[numberOfPeople];

        // Index for filling sortedNames array from end to start
        int currentIndex = numberOfPeople - 1;

        // Iterate through the map (sorted by height in ascending order)
        // and fill the sortedNames array from end to start
        for (int height : heightToNameMap.keySet()) {
            sortedNames[currentIndex] = heightToNameMap.get(height);
            currentIndex--;
        }

        return sortedNames;
    }
}