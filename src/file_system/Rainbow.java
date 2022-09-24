package file_system;

enum Rainbow {
	VIOLET(1),
	INDIGO (2),
	BLUE (3),
	GREEN(4),
	YELLOW(5),
	ORANGE(6),
	RED(7);
	final int code;
	Rainbow(int code) {
		this.code= code;
		// TODO Auto-generated constructor stub
	}
	public int getter(){
		return code;
	}
}
