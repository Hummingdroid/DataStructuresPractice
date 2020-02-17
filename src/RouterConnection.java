public  class RouterConnection <N,P> {
	N name;
	P password;
	N [] nameArray;

	// Constructor builds the Router Object
	public RouterConnection(N name, P password){
	this.name = name;
	this.password = password;
	}

	public P sendPasswordToRouter(){
		return password;
	}


	public N sendUserNametoRouter(){
		return name;
	}

	public void setName(N name){
		this.name = name;
	}

	public void setPassword(P password){
		this.password = password;
	}
}
