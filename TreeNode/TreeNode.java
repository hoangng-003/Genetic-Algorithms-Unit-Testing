package TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
  private boolean value;
  private TreeNode parent;
  private List<TreeNode> children = new ArrayList<>();

  private String print = "";
  private double trueMinusFalse;
  private double sumChild = 0;
  private double DeltaPrices;

  private boolean success = false;

  public TreeNode addChild(boolean _value) {
    TreeNode childNode = new TreeNode(_value);
    childNode.parent = this;
    this.children.add(childNode);
    return childNode;
  }

  public void addChild(TreeNode temp) {
    temp.parent = this;
    this.children.add(temp);
  }

  public TreeNode removeLeftChild() {
    TreeNode childNode = children.get(0);
    this.children.remove(children.get(0));
    return childNode;
  }

  public void calValueAgain() {
    int countTrue = 0;
    int countFalse = 0;

    for (TreeNode child : children) {
      if (child.getValue()) {
        countTrue++;
      } else {
        countFalse++;
      }
    }

    if (countTrue >= countFalse) {
      setValue(true);
    } else {
      setValue(false);
    }
  }

  public double calPrice() {
    double bt = trueMinusFalse / sumChild;
    double price = 2 / (1 + Math.exp(-2 * bt));
    return price;
  }

  public void calDeltaPrice(double GlobalPrices) {
    DeltaPrices = Math.abs(calPrice() - GlobalPrices);
    if (DeltaPrices < 0.04) {
      success = true;
    }
  }

  public double oneDiviveAns() {
    if (DeltaPrices == 0) {
      success = true;
      return 10000000;
    } else {
      return 1 / DeltaPrices;
    }
  }

  public double calPercent(double sum) {
    double percent = (oneDiviveAns() / sum) * 100;
    return percent;
  }

  public void bfs() {

    int sumTrue = 0;
    int sumFalse = 0;

    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(this);
    while (!queue.isEmpty()) {
      TreeNode temp = queue.poll();
      sumChild++;
      print += temp.getValue() + " ";

      if (!temp.equals(this)) {
        if (temp.getValue()) {
          sumTrue++;
        } else {
          sumFalse++;
        }
      }

      for (TreeNode child : temp.getChildren()) {
        if (child != null) {
          queue.add(child);
        }
      }
    }
    sumChild -= 1;
    trueMinusFalse = sumTrue - sumFalse;

  }

  public String statics(int stt, double sum) {
    String out = "\t  " + stt + "\t    " + getTrueMinusFalse() + "                    " + getSumChild()
        + "              "
        + calPrice() + "         " +
        +DeltaPrices + "          " + oneDiviveAns() + "          "
        + calPercent(sum) + " ( % )" + "\n \n";
    return out;
  }

  public void reCalculate() {
    calValueAgain();
    setSumChild(0);
    setPrint("");
    bfs();
  }

  // ------ Getter , Setter , Constructor , Equals ------

  public double getTrueMinusFalse() {
    return trueMinusFalse;
  }

  public double getDeltaPrices() {
    return DeltaPrices;
  }

  public void setDeltaPrices(double deltaPrices) {
    DeltaPrices = deltaPrices;
  }

  public double getSumChild() {
    return sumChild;
  }

  public String getPrint() {
    return print;
  }

  public void setPrint(String print) {
    this.print = print;
  }

  public TreeNode(boolean value) {
    this.value = value;
  }

  public TreeNode() {
    this.value = value;
  }

  public boolean getValue() {
    return value;
  }

  public void setValue(boolean value) {
    this.value = value;
  }

  public void setTrueMinusFalse(double trueMinusFalse) {
    this.trueMinusFalse = trueMinusFalse;
  }

  public void setSumChild(double sumChild) {
    this.sumChild = sumChild;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }

  public List<TreeNode> getChildren() {
    return children;
  }

  public void setChildren(List<TreeNode> children) {
    this.children = children;
  }

  public TreeNode getChild(int index) {
    return children.get(index);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    TreeNode other = (TreeNode) obj;
    if (value != other.value)
      return false;
    if (parent == null) {
      if (other.parent != null)
        return false;
    } else if (!parent.equals(other.parent))
      return false;
    if (children == null) {
      if (other.children != null)
        return false;
    } else if (!children.equals(other.children))
      return false;
    return true;
  }
}