class AvoidPublicInstanceVariablesCheck {
	public Error a = new Error();
	public String b = "lalalala";

	public void lolo() {
		public Error a = new Error();

	}
}