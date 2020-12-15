public interface Reader { char getchar(); }
public interface Writer { void putchar(char c)}

class CharCopier {

  void copy(Reader reader, Writer writer) {
    int c;
    while ((c = reader.getchar()) != EOF) {
      writer.putchar();
    }
  }
}

public Keyboard implements Reader {...}
public Printer implements Writer {…}