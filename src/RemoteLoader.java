public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		DiscoLight barDiscoLight = new DiscoLight("Bar");
		DiscoLight sceneDiscoLight = new DiscoLight("Scene");
		SmokeMachine sceneSmokeMachine= new SmokeMachine("Scene");
		Stereo stereo = new Stereo("Scene");

		DiscoLightOnCommand barDiscoLightOn =
		new DiscoLightOnCommand(barDiscoLight);
		DiscoLightOffCommand barDiscoLightOff =
		new DiscoLightOffCommand(barDiscoLight);
		DiscoLightOnCommand sceneDiscoLightOn =
		new DiscoLightOnCommand(sceneDiscoLight);
		DiscoLightOffCommand sceneDiscoLightOff =
		new DiscoLightOffCommand(sceneDiscoLight);

		SmokeMachineOnCommand sceneSmokeMachineOn =
		new SmokeMachineOnCommand(sceneSmokeMachine);
		SmokeMachineOffCommand sceneSmokeMachineOff =
		new SmokeMachineOffCommand(sceneSmokeMachine);
		StereoOnWithCDCommand stereoOnWithCD =
		new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff =
		new StereoOffCommand(stereo);
		remoteControl.setCommand(0, barDiscoLightOn, barDiscoLightOff);
		remoteControl.setCommand(1, sceneDiscoLightOn, sceneDiscoLightOff);
		remoteControl.setCommand(2, sceneSmokeMachineOn, sceneSmokeMachineOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
}