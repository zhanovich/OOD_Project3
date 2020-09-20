public class DiscoLightOffCommand implements Command {
	DiscoLight discoLight;

	public DiscoLightOffCommand(DiscoLight discoLight) {
		this.discoLight = discoLight;
	}
	public void execute() {
		discoLight.off();	
	}
}