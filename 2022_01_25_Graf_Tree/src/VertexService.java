import java.util.LinkedList;

public class VertexService {

    public int countHigh(Vertex root) {
        if (root == null) return 0;
        return 1 + Math.max(countHigh(root.leftChild), countHigh(root.rightChild));
    }

    public int countVertices(Vertex root) {

        int res = 1;
        if (root.leftChild != null){
           res += countVertices(root.leftChild);
        }

        if (root.rightChild != null) {
        res += countVertices(root.rightChild);
        }

        return res;
    }
}
