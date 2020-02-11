public  class RouterConnection <N,P> {
	N name;
	P password;

	// Constructor builds the Router Object
	public RouterConnection(N name, P password){
	this.name = name;
	this.password = password;
	}

	
	public P passPasswordToServer(){
		return password;
	}


	public N sendUserName(){
		return name;
	}

	public void setName(N name){
		this.name = name;
	}

	public void setPassword(P password){
		this.password = password;
	}
}
