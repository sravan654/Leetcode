package trees;

/**
 * Created by apuris on 09/07/18.
 */
public class CheckBST {

    public boolean checkBST(BinarySearchTree root){
        return checkBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    private boolean checkBST(BinarySearchTree root, int maxValue, int minValue) {
        if(root == null)
            return true;
        else if(root.val < minValue || root.val > maxValue)
            return false;
        return checkBST(root.left, root.val-1, minValue) && checkBST(root.right, maxValue, root.val+1);
    }

}
