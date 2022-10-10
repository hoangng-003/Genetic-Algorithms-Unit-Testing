package Testing;

import org.junit.Test;

import Main.Main;

import static org.junit.Assert.*;

public class RandomTest {
  // Kiểm thử ngẫu nhiên

  @Test
  public void testMain0() throws Exception {
    boolean[] tree0 = { false, false, false, false, true, true, false, true, false, false };
    boolean[] tree1 = { true, true, false, true, true, true, true, true, true, false };
    boolean[] tree2 = { true, false, true, false, false, false, true, true, true, true };
    boolean[] tree3 = { true, true, true, true, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }
}
