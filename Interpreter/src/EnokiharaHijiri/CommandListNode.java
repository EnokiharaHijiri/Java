package EnokiharaHijiri;


import java.util.ArrayList;


// <commandList list> ::= <command>* end
public class CommandListNode extends Node {
	
	private ArrayList list = new ArrayList();
	
	@Override
	public void parse(Context context) throws ParseException {
		while ( true ){
			
			if( context.currentToken() == null ){
				throw new ParseException("Missing 'end' ");
				
			} else if( context.currentToken().equals("end") ){
				context.skipToken("end");
				break;
				
			} else {
				
			}
		}

	}
	public String toString(){
		return list.toString();
	}

}
