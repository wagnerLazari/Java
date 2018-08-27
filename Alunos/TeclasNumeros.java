package aula11;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TeclasNumeros extends PlainDocument{
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    }
    
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.replaceAll("[^0-9]", ""), attr);
    }
    
}
