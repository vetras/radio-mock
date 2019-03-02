package Models;

import java.util.Date;

public class Message {
    public int Id;
    public String Text;
    public Date Timestamp;

    @Override
    public String toString() {
        return String.format("{Id=%d, Text='%s', Timestamp=%s}", Id, Text, Timestamp);
    }
}
