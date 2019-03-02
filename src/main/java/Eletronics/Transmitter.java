package Eletronics;

import Models.Message;
import utils.IdGenerator;

import java.util.Date;

/*
 * out of scope of the exercise.
 * the purpose of this class is to be an example of a dependency of the radio class.
 */

public class Transmitter {
    private IdGenerator idGenerator = new IdGenerator();

    public void send(Message message) {
        System.out.println(String.format("Sending message: %s", message));
    }

    public Message receive() {
        var m = new Message();
        m.Id = idGenerator.newId();
        m.Timestamp = new Date();
        m.Text = "First, solve the problem. Then, write the code.";
        System.out.println(String.format("Receiving message: %s", m));
        return m;
    }
}
