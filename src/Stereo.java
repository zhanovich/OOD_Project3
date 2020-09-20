public class Stereo {
	String name;
	public Stereo(String string) {
		// TODO Auto-generated constructor stub
		name = string;
	}
	void on() {
		System.out.println(name + " Stereo is on");
	}
	void off() {
		System.out.println(name + " Stereo is off");
	}
	void setCD() {
		System.out.println(name + " Stereo CD is set");
	}
	void setVolume() {
		System.out.println(name + " Stereo Volume is set");
	}
}