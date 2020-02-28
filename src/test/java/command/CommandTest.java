package command;

import org.junit.Test;

public class CommandTest {
    @Test
    public void test() {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmOnCommand = new AlarmOnCommand(alarm);

        Button button = new Button(lampOnCommand);
        button.pressed();
        button.changeCommand(alarmOnCommand);
        button.pressed();
    }
}
