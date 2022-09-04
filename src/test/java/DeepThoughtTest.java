import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeepThoughtTest {

  @Test
  void foobar() {
    DeepThought dt = new DeepThought();
    int result = dt.answer_to_the_ultimate_question_of_life_the_universe_and_everything();
    assertEquals(42, result);
  }
}