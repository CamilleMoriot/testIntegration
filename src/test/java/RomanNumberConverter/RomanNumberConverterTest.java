package romannumberconverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

  RomanNumberConverter number;

  @Before
  public void setup() {
    number = new RomanNumberConverter();
  }

  @Test
  public void checkConvertToString10() {
    assertThat(number.convert("X"))
      .isEqualTo(10);
    }
    @Test
  public void checkConvertToString1() {
    assertThat(number.convert("I"))
      .isEqualTo(1);
  }
  @Test
  public void checkConvertToString5() {
    assertThat(number.convert("V"))
      .isEqualTo(5);
  }
  @Test
  public void checkConvertToString50() {
    assertThat(number.convert("L"))
      .isEqualTo(50);
  }
  @Test
  public void checkConvertToString100() {
    assertThat(number.convert("C"))
      .isEqualTo(100);
  }
  @Test
  public void checkConvertToString500() {
    assertThat(number.convert("D"))
      .isEqualTo(500);
  }
  @Test
  public void checkConvertToString1000() {
    assertThat(number.convert("M"))
      .isEqualTo(1000);
  }

  @Test
  public void checkConvertToNumber() {
    assertThat(number.convert(10))
      .isNotEmpty()
      .isEqualTo("X");
    assertThat(number.convert(1))
      .isNotEmpty()
      .isEqualTo("I");
    assertThat(number.convert(5))
      .isNotEmpty()
      .isEqualTo("V");
    assertThat(number.convert(50))
      .isNotEmpty()
      .isEqualTo("L");
    assertThat(number.convert(100))
      .isNotEmpty()
      .isEqualTo("C");
    assertThat(number.convert(500))
      .isNotEmpty()
      .isEqualTo("D");
    assertThat(number.convert(1000))
      .isNotEmpty()
      .isEqualTo("M");
  }
}
