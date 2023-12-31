package inflearn.java.algorithm.problem.solving.beginner.ch4;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HashTreeTest {


  @Test
  @DisplayName("1. 학급 회장(해쉬)")
  void classPresident() {
    assertThat(HashTreeUtil.classPresident(15, "BACBACCACCBDEDE")).isEqualTo('C');

  }

  @Test
  @DisplayName("2. 아나그램 (해쉬)")
  void anagram() {
    assertThat(HashTreeUtil.anagram("AbaAeCe", "baeeACA")).isEqualTo("YES");
    assertThat(HashTreeUtil.anagram("abaCC", "Caaab")).isEqualTo("NO");
  }

  @Test
  @DisplayName("3. 매출액의 종류")
  void salesKind() {
    assertThat(HashTreeUtil.salesKind(7, 4, new int[]{20, 12, 20, 10, 23, 17, 10})).isEqualTo(
        new int[]{3, 4, 4, 3});

  }

  @Test
  @DisplayName("4. 모든 아나그램 찾기")
  void allAnagram() {
    assertThat(HashTreeUtil.allAnagram("bacaAacba", "abc")).isEqualTo(3);
    assertThat(HashTreeUtil.allAnagram(
        "AGSDEGEWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyzWetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabtWestuwxyz",
        "WetabtqtqEFqGHIJKLtabeWPQRSTUVWetabdgXYabteWcdefghijklmnopqrabt")).isEqualTo(180);

  }

  @Test
  @DisplayName("5. K번째 큰 수")
  void largestNumberK(){
    assertThat(HashTreeUtil.largestNumberK(10,3,new int[]{13,15,34,23,45,65,33,11,26,42})).isEqualTo(143);
    assertThat(HashTreeUtil.largestNumberK(10,1200,new int[]{23,24,50,17,34,35,50,22,53,41})).isEqualTo(-1);

  }
}
