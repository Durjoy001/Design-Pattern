public interface Channel{
    byte[] receive();
    void send(byte[] data);
}
public interface Connection{
    void open();
    void close();
}