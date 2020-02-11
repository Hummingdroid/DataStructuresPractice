public  class RouterConnection <N,P> {
	N name;
	P password;

	// Constructor builds the Router Object
	public RouterConnection(N name, P password){
	this.name = name;
	this.password = password;
	}

	// Method to send password
	public P passPasswordToServer(){
		return password;
	}

	// Method to send UserName
	public N sendUserName(){
		return name;
	}
}
