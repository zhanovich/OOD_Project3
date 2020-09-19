public class DiscoLightOnCommand implements Command {
	DiscoLight discoLight;

	public DiscoLightOnCommand(DiscoLight discoLight) {
		this.discoLight = discoLight;
	}
	public void execute() {
		discoLight.on();	
	}
}