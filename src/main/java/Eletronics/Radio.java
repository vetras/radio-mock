package Eletronics;

import Exceptions.InsufficientBattery;
import Models.Message;
import utils.BatteryLevel;
import utils.IdGenerator;

import java.util.Date;

public class Radio {
    private IdGenerator idGenerator = new IdGenerator();

    private Transmitter transmitter = new Transmitter();

    private BatteryLevel battery = new BatteryLevel();

    public Radio() {
        battery.charge();
    }

    public void charge() {
        battery.charge();
    }

    public void broadcast(String message) {
        var m = new Message();
        m.Id = idGenerator.newId();
        m.Timestamp = new Date();
        m.Text = message;

        if (battery.checkCharge() > 10) {
            transmitter.send(m);
        }

        battery.spend(5);
    }

    public Message receive() {
        battery.spend(10);
        if (battery.checkCharge() > 10) {

            return transmitter.receive();
        }
        throw new InsufficientBattery("Can't receive messages with low battery");
    }

}
