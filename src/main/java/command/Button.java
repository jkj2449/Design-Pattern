package command;

import lombok.Getter;

@Getter
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }

    public void changeCommand(Command command) {
        this.command = command;
    }
}
