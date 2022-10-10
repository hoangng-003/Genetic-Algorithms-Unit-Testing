package Main;
import java.util.Random;
import org.junit.Test;

import TreeNode.TreeNode;

import static org.junit.Assert.*;

public class Main {

  public static String out = "";

  public static double sum = 0;

  public static double GlobalTrueMinusFalse = 0;
  public static double GlobalBT = 0;
  public static double GlobalPrices = 0;

  // ---------------------- Logic -------------------

  // private Main() {
  // throw new AssertionError();
  // }

  public static TreeNode logic(TreeNode[] reg) {
    while (true) {
      reg = random(reg);
      cross(reg);
      statics(reg);

      for (TreeNode child : reg) {
        if (child.isSuccess()) {
          return child;
        }
      }
    }
  }

  // ---------------------- Statics ----------------------------

  public static void statics(TreeNode[] root) {
    sum = 0;
    GlobalTrueMinusFalse = 0;

    for (int i = 0; i < 4; i++) {
      root[i].reCalculate();
      root[i].calDeltaPrice(GlobalPrices);
      sum += root[i].oneDiviveAns();
    }

    if (root[0].getDeltaPrices() == root[1].getDeltaPrices() && root[0].getDeltaPrices() == root[2].getDeltaPrices()
        && root[0].getDeltaPrices() == root[3].getDeltaPrices()) {

      root[0].setSuccess(true);

    }

    print(root);
  }

  public static void print(TreeNode[] root) {

    out = "\t Tree \t TrueMinusFalse \t SumChild \t       Prices                     DeltaPrices                   1/DeltaPrices                   Percent \n \n";

    for (int i = 0; i < 4; i++) {
      out += root[i].statics(i, sum);
    }

    System.out.println("\n" + out);
    System.out.println("GlobalPrices : " + GlobalPrices + "\n");
    System.out.println("Sum : " + sum + "\n");
  }

  // -------------- Random --------------

  public static TreeNode[] random(TreeNode[] root) {
    Random[] r = {
        new Random(),
        new Random(),
        new Random(),
        new Random(),
    };

    TreeNode[] reg = new TreeNode[4];

    for (int i = 0; i < 4; i++) {
      int j = 0;
      double randomValue = 0 + (100 - 0) * r[i].nextDouble();
      System.out.print("Random " + i + " : " + randomValue + " - ");

      if (randomValue <= root[0].calPercent(sum)) {
        reg[i] = root[0];
        j = 0;
      } else if (randomValue > root[0].calPercent(sum)
          && randomValue <= root[0].calPercent(sum) + root[1].calPercent(sum)) {
        reg[i] = root[1];
        j = 1;

      } else if (randomValue > root[0].calPercent(sum) + root[1].calPercent(sum)
          && randomValue <= root[0].calPercent(sum) + root[1].calPercent(sum) + root[2].calPercent(sum)) {
        reg[i] = root[2];
        j = 2;

      } else if (randomValue <= root[0].calPercent(sum) + root[1].calPercent(sum) + root[2].calPercent(sum)
          + root[3].calPercent(sum)) {
        reg[i] = root[3];
        j = 3;
      }

      System.out.println(" Tree : " + j + "\n");

    }
    return reg;
  }

  // -------------------Crossing---------------------

  public static void cross(TreeNode[] reg) {
    TreeNode temp1 = reg[0].removeLeftChild();
    TreeNode temp2 = reg[1].removeLeftChild();

    reg[0].addChild(temp2);
    reg[1].addChild(temp1);

    temp1 = reg[2].removeLeftChild();
    temp2 = reg[3].removeLeftChild();

    reg[2].addChild(temp2);
    reg[3].addChild(temp1);
  }

  public static double main(boolean[] tree0, boolean[] tree1, boolean[] tree2, boolean[] tree3) {

    // ------------------- Initial Population
    // -----------------------------------------------

    TreeNode[] root = {
        new TreeNode(),
        new TreeNode(),
        new TreeNode(),
        new TreeNode()
    };

    // Tree 0
    {
      TreeNode node0_0 = root[0].addChild(tree0[0]);
      {
        TreeNode node0_0_0 = node0_0.addChild(tree0[1]);
        TreeNode node0_0_1 = node0_0.addChild(tree0[2]);
        TreeNode node0_0_2 = node0_0.addChild(tree0[3]);
      }

      TreeNode node0_1 = root[0].addChild(tree0[4]);
      {
        TreeNode node0_1_0 = node0_1.addChild(tree0[5]);
        TreeNode node0_1_1 = node0_1.addChild(tree0[6]);
        TreeNode node0_1_2 = node0_1.addChild(tree0[7]);
        TreeNode node0_1_3 = node0_1.addChild(tree0[8]);
      }
      TreeNode node0_2 = root[0].addChild(tree0[9]);
    }

    // Tree 1
    {
      TreeNode node1_0 = root[1].addChild(tree1[0]);
      {
        TreeNode node1_0_0 = node1_0.addChild(tree1[1]);
        TreeNode node1_0_1 = node1_0.addChild(tree1[2]);
        TreeNode node1_0_2 = node1_0.addChild(tree1[3]);
      }

      TreeNode node1_1 = root[1].addChild(tree1[4]);
      {
        TreeNode node1_1_0 = node1_1.addChild(tree1[5]);
        TreeNode node1_1_1 = node1_1.addChild(tree1[6]);
        {
          TreeNode node1_1_1_0 = node1_1_1.addChild(tree1[7]);
          TreeNode node1_1_1_1 = node1_1_1.addChild(tree1[8]);
        }
        TreeNode node1_1_2 = node1_1.addChild(tree1[9]);
      }

    }

    // Tree 2

    {
      TreeNode node2_0 = root[2].addChild(tree2[0]);
      {
        TreeNode node2_0_0 = node2_0.addChild(tree2[1]);
        TreeNode node2_0_1 = node2_0.addChild(tree2[2]);
      }

      TreeNode node2_1 = root[2].addChild(tree2[3]);
      {
        TreeNode node2_1_0 = node2_1.addChild(tree2[4]);
        TreeNode node2_1_1 = node2_1.addChild(tree2[5]);
      }
      TreeNode node2_2 = root[2].addChild(tree2[6]);
      {
        TreeNode node2_2_0 = node2_2.addChild(tree2[7]);
        TreeNode node2_2_1 = node2_2.addChild(tree2[8]);
      }
      TreeNode node2_3 = root[2].addChild(tree2[9]);

    }

    // Tree 3

    {
      TreeNode node3_0 = root[3].addChild(tree3[0]);
      {
        TreeNode node3_0_0 = node3_0.addChild(tree3[1]);
        TreeNode node3_0_1 = node3_0.addChild(tree3[2]);
        {
          TreeNode node3_0_1_0 = node3_0_1.addChild(tree3[3]);
          TreeNode node3_0_1_1 = node3_0_1.addChild(tree3[4]);
          {
            TreeNode node3_0_1_1_0 = node3_0_1_1.addChild(tree3[5]);
            TreeNode node3_0_1_1_1 = node3_0_1_1.addChild(tree3[6]);
          }
        }
      }

      TreeNode node3_1 = root[3].addChild(tree3[7]);
      {
        TreeNode node3_1_0 = node3_1.addChild(tree3[8]);
      }
      TreeNode node3_2 = root[3].addChild(tree3[9]);
    }

    // ------------- Logic -------------------

    // Turn 0

    for (int i = 0; i < 4; i++) {
      root[i].bfs();
      GlobalTrueMinusFalse += root[i].getTrueMinusFalse();
    }
    GlobalBT = (GlobalTrueMinusFalse) / 40;
    GlobalPrices = 2 / (1 + Math.exp(-2 * GlobalBT));
    statics(root);

    // Turn 1 - end

    TreeNode[] reg = root;
    TreeNode result = logic(reg);

    System.out.println("=>>>>>>>> RESULT : " + result.getDeltaPrices() + "\n");
    System.out.println("------------------------------------- NEXT TESTCASE ----------------------------------- \n");

    return result.getDeltaPrices();
  }

}
