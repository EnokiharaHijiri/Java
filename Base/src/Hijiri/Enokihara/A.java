package Hijiri.Enokihara;

//継承
class A extends Base{
	
	public int methodA(){//上書き
		super.methodA();
		return 0;
	}
	
	public int methodC(){//新規
		return 0;
	}
	
}