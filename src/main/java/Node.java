import lombok.Getter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@ToString(onlyExplicitlyIncluded = true)
public class Node {

    @ToString.Include
    private String name;
    private String description;
    private HashMap<Integer, Node> paths;
    private String[] forwardOptions;
    private boolean finalNode;

    public Node(String name, String description, String[] options) {
        this.name = name;
        this.description = description;
        paths = new HashMap<>();
        forwardOptions = options;
    }

    public void setPaths(Node firstPath, Node secondPath) {
        paths.put(1, firstPath);
        paths.put(2, secondPath);
    }

    public Node getPath(int pathNo) {
        return paths.get(pathNo);
    }

    public void makeFinalNode() {
        finalNode = true;
    }

    public boolean isFinalNode() {
        return finalNode;
    }


}
