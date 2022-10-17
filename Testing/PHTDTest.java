package Testing;

import org.junit.Test;

import Main.Main;

import static org.junit.Assert.*;

public class PHTDTest {

  // Kiểm thử Phân hoạch tương đương

  // Cặp (3,5,9,10)
  @Test
  public void testPHTD1() throws Exception {
    boolean[] tree0 = { true, true, true, false, false, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, true, true, true, true, false };
    boolean[] tree3 = { true, true, true, true, true, true, true, true, true, true };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // Cặp (8,2,1,5)

  @Test
  public void testPHTD2() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, true, true, true, false, false };
    boolean[] tree1 = { true, true, false, false, false, false, false, false, false, false };
    boolean[] tree2 = { true, false, false, false, false, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // Cặp (5,7,5,4)

  @Test
  public void testPHTD3() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, true, true, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }
}
