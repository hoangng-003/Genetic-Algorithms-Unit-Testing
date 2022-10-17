package Testing;

import org.junit.Test;

import Main.Main;

import static org.junit.Assert.*;

public class GTBTest {

  // Kiểm thử giá trị biên

  // nom - nom - nom - min
  @Test
  public void testGTB1() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { false, false, false, false, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - nom - min+

  @Test
  public void testGTB2() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, false, false, false, false, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - nom - nom

  @Test
  public void testGTB3() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - nom - max-

  @Test
  public void testGTB4() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, true, true, true, true, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - nom - max

  @Test
  public void testGTB5() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, true, true, true, true, true };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - min - nom

  @Test
  public void testGTB6() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { false, false, false, false, false, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - min+ - nom

  @Test
  public void testGTB7() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, false, false, false, false, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - max- - nom

  @Test
  public void testGTB8() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, true, true, true, true, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - nom - max - nom

  @Test
  public void testGTB9() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, true, true, true, true, true };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - min - nom - nom

  @Test
  public void testGTB10() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { false, false, false, false, false, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - min+ - nom - nom

  @Test
  public void testGTB11() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, false, false, false, false, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - max- - nom - nom

  @Test
  public void testGTB12() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, true, true, true, true, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // nom - max - nom - nom

  @Test
  public void testGTB13() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, true, true, true, true, true };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // min - nom - nom - nom

  @Test
  public void testGTB14() throws Exception {
    boolean[] tree0 = { false, false, false, false, false, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // min+ - nom - nom - nom

  @Test
  public void testGTB15() throws Exception {
    boolean[] tree0 = { true, false, false, false, false, false, false, false, false, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // max- - nom - nom - nom

  @Test
  public void testGTB16() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, true, true, true, true, false };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

  // max - nom - nom - nom

  @Test
  public void testGTB17() throws Exception {
    boolean[] tree0 = { true, true, true, true, true, true, true, true, true, true };
    boolean[] tree1 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree2 = { true, true, true, true, true, false, false, false, false, false };
    boolean[] tree3 = { true, true, true, true, true, false, false, false, false, false };

    assertTrue(" Chưa tối ưu . Hãy thử lại 1 lần nữa . ", Main.main(tree0, tree1, tree2, tree3) < 0.4);
  }

}
