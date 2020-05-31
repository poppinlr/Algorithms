package algorithms._01._04._02.binary.search.tree;

public class _01BinarySearchTree {

    private Node root;

    public Integer get(String key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.getKey());
            if (cmp < 0) {
                x = x.getLeft();
            } else if (cmp > 0) {
                x = x.getRight();
            } else {
                return x.getValue();
            }
        }
        return null;
    }

    public void put(String key, Integer val) {
        root = put(root, key, val);
    }

    private Node put(Node x, String key, Integer val) {
        if (x == null) {
            return new Node(key, val);
        }

        int cmp = key.compareTo(x.getKey());
        if (cmp < 0) {
            x.setLeft(put(x.getLeft(), key, val));
        } else if (cmp > 0) {
            x.setRight(put(x.getRight(), key, val));
        } else {
            x.setValue(val);
        }

        return x;
    }

    public String floor(String key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        }
        return x.getKey();
    }

    private Node floor(Node x, String key) {
        if (x == null) {
            return  null;
        }
        int cmp = key.compareTo(x.getKey());

        if (cmp == 0) {
            return x;
        } else if (cmp < 0) {
            return floor(x.getLeft(), key);
        } else {
            Node t = floor(root.getRight(), key);
            if(t != null) return t;
            else return x;
        }
    }

    private void delete(String key) {
        root = delete(root, key);
    }

    //TODO core
    private Node delete(Node x, String key) {
//        if (x == null) {
//            return null;
//        }
//        int cmp = key.compareTo(x.getKey());
//        if (cmp < 0) {
//            x.setLeft(delete(x.getLeft(), key));
//        } else if (cmp > 0) {
//            x.setRight(delete(x.getRight(), key));
//        } else {
//            if (x.getRight() == null) {
//                return x.getLeft();
//            } else if (x.getLeft() == null) {
//                return x.getRight();
//            } else {
//                Node t = x;
//                x = min(t.getRight());
//                x.setRight(deleteMin(t.getRight()));
//                x.setLeft(t.getLeft());
//            }
//        }
        return x;
    }

}
