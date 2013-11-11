package Hijiri.Enokihara;

//委譲　デリゲート
class B{
	Base b=new Base();
	public int methodA(){//上書きっぽいけど上書きしてない。methodAのマネ
		b.methodA();
		//methodAを行ってほかの処理を行う。
		return 0;
	}
	public int methodB(){//上書きっぽいけど上書きしてない。methodBのマネ
		b.methodB();
		return 0;
	}
	public int methodC(){//新規
		return 0;
		
	}
}