package br.com.jlago.lfc.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class JTextDocumentCustomizado extends PlainDocument {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 
    private int limit;

    public JTextDocumentCustomizado(int limit) {
    	super();
     	this.limit = limit;
    }
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if(validar(str)){
            super.insertString(offs, str, a);
        }
    }
    
    private boolean validar(String str){
    	
    	if(!(str != null && (getLength() + str.length() <= limit))){
    		return false;
    	}
    	if (!(str != null && Util.isNumeroRegexp(str))){
    		return false;
    	}
    	
    	return true;
    }
    
  
}
