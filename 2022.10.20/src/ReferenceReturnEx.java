
class ReferenceReturnEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		
		Data d2 = aaa(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}

	static Data aaa(Data d) { // ��ü�� �ּҸ� �����´�.
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}
	
}
