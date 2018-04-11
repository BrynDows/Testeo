public class AvoidMissingDEFAULTinSwitchStatamentCheck{
	
	public AvoidMissingDEFAULTinSwitchStatamentCheck() {
		int a = 0;
		switch (a) {
		case 3:
			
			break;
			

		}
	}
	
	public void foo1() {
		String b = null;
		switch (b) {
		case "a":
			
			break;
		case "b":
			break;
		default:
			break;
		}
	}
	
	public String foo2() {
		String b = null;
		switch (b) {
		case "a":
			
			break;
		case "b":
			break;
		default:
			break;
		}
		return null;
	}
	
}