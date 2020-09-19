public class SmokeMachineOnCommand implements Command {
	SmokeMachine smokeMachine;

	public SmokeMachineOnCommand(SmokeMachine smokeMachine) {
		this.smokeMachine = smokeMachine;
	}
	public void execute() {
		smokeMachine.on();	
	}
}