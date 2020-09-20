public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		DiscoLight discoLight = new DiscoLight("Scene");
		SmokeMachine smokeMachine = new SmokeMachine("Scene");
		DiscoLightOnCommand lightOn = new DiscoLightOnCommand(discoLight);
		SmokeMachineOnCommand smokeMachineOn =
		new SmokeMachineOnCommand(smokeMachine);
		SmokeMachineOffCommand smokeMachineOff =
		new SmokeMachineOffCommand(smokeMachine);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		remote.setCommand(smokeMachineOn);
		remote.buttonWasPressed();
		remote.setCommand(smokeMachineOff);
		remote.buttonWasPressed();
	}
}