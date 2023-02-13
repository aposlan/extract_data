public enum PantSize {

	XS(78, 100, 107), 
	S(80.5, 102, 108), 
	M(83, 105, 109), 
	L(85.5, 107, 110), 
	XL(88, 110, 111), 
	XXL(91.5, 112, 112);
	
	double waist, hips, length;
	
	PantSize(double waist, double hips, double length){
		this.waist = waist;
		this.hips = hips;
		this.length = length;
	}
	
}
