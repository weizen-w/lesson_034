public class Triangle {
//  Создайте класс Triangle (треугольник), принимающий три целых значения -
//  длины трёх сторон треугольника.

//  В конструкторе нужно проверить введённые значения на корректность
//  (например, длины не могут быть отрицательными).

//  В классе должен быть описан отдельный статический метод, который должен проверить
//  неравенство треугольника.  public static boolean checkSides(int a, int b, int c)

//  Этот метод необходимо использовать в конструкторе.
//  При провале любой из проверок нужно вывести на экран соответствующее сообщение
//  или выкинуть исключение.

  private final int a;
  private final int b;
  private final int c;

  public Triangle(int a, int b, int c) {
    if (checkSides(a, b, c)) {
      throw new IllegalArgumentException("Such a triangle does not exist.");
    }
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public String getString() {
    return String.format("<%d, %d, %d>", a, b, c);
  }

  private static boolean checkSides(int a, int b, int c) {
    if (a >= 0 & b >= 0 & c >= 0) {
      return !(a < (b + c) & b < (a + c) & c < (b + a));
    }
    return true;
  }
}
