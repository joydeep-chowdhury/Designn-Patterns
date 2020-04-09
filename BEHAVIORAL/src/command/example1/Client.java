package command.example1;

public class Client {
	public static void main(String args[]) {
		Switcher switcher = new Switcher();
		Light light = new Light();
		TurnOnCommand turnOnCommand = new TurnOnCommand(light);
		TurnOffCommand turnOffCommand = new TurnOffCommand(light);
		switcher.addCommand(turnOnCommand);
		switcher.addCommand(turnOffCommand);
		switcher.executeCommands();
	}

}
