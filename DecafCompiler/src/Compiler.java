
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
//import org.antlr.v4.runtime.tree.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Compiler {
	
	public static String LookUpTokenName(Map<String, Integer> map, int tokenType){
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			if(tokenType == entry.getValue())
				return entry.getKey();
		}
		return "";
	}	
	
	public static void RunScanner(String inputPath, String outputPath) throws IOException{
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputPath));
		
		DecafLexer lexer = new DecafLexer(input);		
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		DecafParser parser = new DecafParser(tokens);
				
		
		File outputFile = new File(outputPath);
		if(!outputFile.exists()){
			outputFile.createNewFile();
		}	
		
		
		FileWriter output = new FileWriter(outputFile.getAbsolutePath());		
		BufferedWriter bufferedOutput = new BufferedWriter(output);
		DecafLexerErrorListener errorListener = new DecafLexerErrorListener(bufferedOutput);		
		lexer.addErrorListener(errorListener);
		
		Map<String, Integer> map = parser.getTokenTypeMap();			
			
		for(Token t = lexer.nextToken(); t.getType() != Token.EOF; t = lexer.nextToken()){
			
			int type = t.getType();
			String tokenType = "";
			if(type == DecafLexer.INT_LITERAL || 
					type == DecafLexer.BOOL_LITERAL ||  
					type == DecafLexer.CHAR_LITERAL ||
					type == DecafLexer.STRING_LITERAL ||
					type == DecafLexer.IDENTIIER){
				tokenType =  LookUpTokenName(map, t.getType());
			}
			
			bufferedOutput.write(t.getLine() + " " + tokenType + " " + t.getText());
			bufferedOutput.newLine();		
		}
		
		lexer.removeErrorListener(errorListener);
		bufferedOutput.close();
	}
	
	public static void RunParser(String inputPath, String outputPath) throws IOException{
		
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputPath));
		
		DecafLexer lexer = new DecafLexer(input);		
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);		
		DecafParser parser = new DecafParser(tokens);
		
		DecafParserErrorListener errorListener = new DecafParserErrorListener();	
		parser.addErrorListener(errorListener);
		
		ParseTree tree = parser.program();
		System.out.println(tree.toStringTree(parser));
		
		File outputFile = new File(outputPath);
		if(!outputFile.exists()){
			outputFile.createNewFile();
		}	
		
		
		FileWriter output = new FileWriter(outputFile.getAbsolutePath());		
		BufferedWriter bufferedOutput = new BufferedWriter(output);	
		
		
		if(!errorListener.HasErrors()){
			bufferedOutput.write("0 error");
		}
		else{
			for(String s : errorListener.GetAllErrors()){
				bufferedOutput.write(s);
				bufferedOutput.newLine();
			}
		}
		bufferedOutput.close();		
		parser.removeErrorListener(errorListener);
		
	}
	
	public static void main(String[] args){
		
		if(args.length % 2 != 0){
			System.out.println("Tham so khong dung");
			return;
		}
		
		String task = "";
		String inputPath = "";
		for(int i = 0; i < args.length; i+= 2){
			if(args[i].equalsIgnoreCase("-target")){
				task = args[i+1];
			}
			else if(args[i].equalsIgnoreCase("-debug")){
				inputPath = args[i+1];
			}
		}
		if(task.isEmpty() || inputPath.isEmpty()){
			System.out.println("Tham so dau vao rong");
			return;
		}
		
		if(task.equalsIgnoreCase("scan")){
			try {				
				RunScanner(inputPath, "output.decaf");
			} catch (IOException e) {
				// TODO: handle exception
			}
			
		}
		if(task.equalsIgnoreCase("parse")){
			try {
				RunParser(inputPath, "output.decaf");	
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
	}
}
