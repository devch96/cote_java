import java.util.HashMap;
import java.util.Map;

public class FolderHierarchy {
    public static void main(String[] args) {
        String[][] folders = {{"folder1", "root"}, {"folder2", "folder1"}, {"folder3", "folder1"}, {"folder4", "folder2"}};

        Map<String, String> parentMap = new HashMap<>();
        Map<String, Integer> levelMap = new HashMap<>();
        String root = "";

        // Find the root folder
        for (String[] folder : folders) {
            String child = folder[0];
            String parent = folder[1];
            parentMap.put(child, parent);
            if (!parentMap.containsKey(parent)) {
                root = parent;
            }
        }

        // Set the level of each folder
        levelMap.put(root, 0);
        for (String[] folder : folders) {
            String child = folder[0];
            String parent = folder[1];
            if (!levelMap.containsKey(child)) {
                int parentLevel = levelMap.get(parent);
                levelMap.put(child, parentLevel + 1);
            }
        }

        // Print the folder hierarchy
        for (String[] folder : folders) {
            String child = folder[0];
            int level = levelMap.get(child);
            String indent = "  ".repeat(level);
            System.out.println(indent + child);
        }
    }
}
