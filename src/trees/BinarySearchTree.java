package trees;

/**
 * Created by apuris on 09/07/18.
 */
public class BinarySearchTree {
        int val;
        BinarySearchTree left;
        BinarySearchTree right;

        public BinarySearchTree(int x){
            val = x;
        }

        public static void main(String[] args){
            Solution solution = new Solution();
            BinarySearchTree root = buildBST(new int[]{4,2,5,1,3});
            System.out.println(solution.closest(root, 3.71));

            CheckBST checkBST = new CheckBST();
            System.out.println(checkBST.checkBST(root));
        }

    private static BinarySearchTree buildBST(int[] tree) {
            BinarySearchTree root = new BinarySearchTree(tree[0]);
            root.left = new BinarySearchTree(tree[1]);
            root.right = new BinarySearchTree(tree[2]);
            root.left.left = new BinarySearchTree(tree[3]);
            root.left.right = new BinarySearchTree(tree[4]);
            return  root;

    }


}

class Solution{
    public int closest(BinarySearchTree root, double target){
        return closestValue(root, target, root.val );
    }

    public int closestValue(BinarySearchTree root, double target, int val ){
        if(root == null) return val;
        if(Math.abs(root.val - target) < Math.abs(val - target))
            val = root.val;
        if(root.val < target)
            val = closestValue(root.right,target,val);
        else if(root.val > target)
            val = closestValue(root.left, target, val);
        return val;
    }
}
