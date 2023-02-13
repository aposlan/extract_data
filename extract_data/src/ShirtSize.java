

public enum ShirtSize {

	XS(98, 75, 86, 67), 
	S(104, 81, 92, 67), 
	M(110, 82, 98, 67), 
	L(116, 83, 104, 68), 
	XL(124, 84, 112, 68), 
	XXL(136, 85, 126, 68);
	
	int chest, back, waist, arm;
	
	ShirtSize(int chest, int back, int waist, int arm){
		this.chest = chest;
		this.back = back;
		this.waist = waist;
		this.arm = arm;
	}
	
}
