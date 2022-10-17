package Testing;

import org.junit.Test;

import Main.Main;

import static org.junit.Assert.*;

public class DDKTest {
  // Kiểm thử Dòng điều khiển

  // 15.3% - 13.5% - 44.6% - 26.6% ( dải đều xung quanh 25% )
  @Test
  public void testDDK1() throws Exception {
    boolean[] tree0 = { false, false, false, false, true, true, false, true, false, false };
    boolean[] tree1 = { true, true, false, true, true, true, true, true, true, false };
    boolean[] tree2 = { true, false, true, false, false, false, true, true, true, true };
    boolean[] tree3 = { true, true, true, true, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  @Test
  public void testDDK2() throws Exception {
    boolean[] tree0 = { true, false, true, false, false, false, true, true, true, true };
    boolean[] tree1 = { true, true, false, true, true, true, true, true, true, false };
    boolean[] tree2 = { true, true, true, true, false, false, false, false, false, false };
    boolean[] tree3 = { false, false, false, false, true, true, false, true, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  @Test
  public void testDDK3() throws Exception {
    boolean[] tree0 = { false, false, false, false, true, true, false, true, false, false };
    boolean[] tree1 = { true, false, true, false, false, false, true, true, true, true };
    boolean[] tree2 = { true, true, false, true, true, true, true, true, true, false };
    boolean[] tree3 = { true, true, true, true, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }
}
