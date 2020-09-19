public class SmokeMachineOffCommand implements Command {
	SmokeMachine smokeMachine;

	public SmokeMachineOffCommand(SmokeMachine smokeMachine) {
		this.smokeMachine = smokeMachine;
	}
	public void execute() {
		smokeMachine.off();	
	}
}