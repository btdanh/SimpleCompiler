import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class DecafParserErrorListener implements ANTLRErrorListener {
	
	private List<String> _errors = new ArrayList<String>(); 
	
	public List<String> GetAllErrors(){
		return new ArrayList<>(_errors);
	}
	
	public Boolean HasErrors(){
		return (_errors.size() > 0);
	}
	
	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
			ATNConfigSet arg6) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub

	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
			RecognitionException arg5) {
		// TODO Auto-generated method stub
		//List<String> stack = ((Parser)arg0).getRuleInvocationStack();
		//System.err.println("rule stack: " + stack);
		_errors.add("line " + arg2 + ":" + arg3 + ": " + arg4);
	}

}
