public class App {
  public static void main(String[] args) {
      int[] exampleArr = new int[]{-5, -4, 3, -2, -1};
      BinaryTree t = new BinaryTree(exampleArr);
      t.levelOrder();
      System.out.println(t.isMaxHeap());
      System.out.println(t.minValue());









      // {int[] exampleArr = new int[]{1, 6, 9, 12, 5, 4, 22, 3};
      // int[] minHeapArr = new int[]{1, 4, 5, 7, 9 ,10, 13, 15};
      // int[] maxHeapArr = new int[]{100, 90, 80, 61, 60, 59, 44, 40, 41, 10, 5, 1};
      // int[] randomArr = new int[]{59, 31, 69, 400, 100, 101, 10, 22, 1, 0, 4, -1};
      // BinaryTree tree1 = new BinaryTree(exampleArr);
      // // BinaryTree tree = new BinaryTree(new int[]{5, 4, 3, 2, 1});
      // System.out.print("level order for tree1 ==> ");
      // tree1.levelOrder();
      // System.out.println("isMinHeap for tree1: " + tree1.isMinHeap());
      // System.out.println("isMaxHeap for tree1: " + tree1.isMaxHeap());
      // System.out.println("tree1's min: " + tree1.minValue() + " \ntree1's max: " + tree1.maxValue());
      // System.out.println("-------------initializing array: "+arrString(exampleArr)+"-------------\n");

      // BinaryTree tree2 = new BinaryTree(minHeapArr);
      // System.out.print("level order for tree2 ==> ");
      // tree2.levelOrder();
      // System.out.println("isMinHeap for tree2: " + tree2.isMinHeap());
      // System.out.println("isMaxHeap for tree2: " + tree2.isMaxHeap());
      // System.out.println("tree2's min: " + tree2.minValue() + " \ntree2's max: " + tree2.maxValue());
      // System.out.println("-------------initializing array: "+arrString(minHeapArr)+"-------------\n");


      // BinaryTree tree3 = new BinaryTree(maxHeapArr);
      // System.out.print("level order for tree3 ==> ");
      // tree3.levelOrder();
      // System.out.println("isMinHeap for tree3: " + tree3.isMinHeap());
      // System.out.println("isMaxHeap for tree3: " + tree3.isMaxHeap());
      // System.out.println("tree3's min: " + tree3.minValue() + " \ntree3's max: " + tree3.maxValue());
      // System.out.println("-------------initializing array: "+arrString(maxHeapArr)+"-------------\n");


      // BinaryTree tree4 = new BinaryTree(randomArr);
      // System.out.print("level order for tree4 ==> ");
      // tree4.levelOrder();
      // System.out.println("isMinHeap for tree4: " + tree4.isMinHeap());
      // System.out.println("isMaxHeap for tree4: " + tree4.isMaxHeap());
      // System.out.println("tree4's min: " + tree4.minValue() + " \ntree4's max: " + tree4.maxValue());
      // System.out.println("-------------initializing array: "+arrString(randomArr)+"-------------\n");}

    }
    public static String arrString(int[] arr){
      String s = "[";
      for(int i = 0; i < arr.length - 1; i++){
        s += arr[i] + ", ";
      }
      s += arr[arr.length-1] + "]";
      return s;
    }

}