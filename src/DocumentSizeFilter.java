import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.awt.*;

public class DocumentSizeFilter extends DocumentFilter {
    private int min;
    private int max;

    public DocumentSizeFilter(int min, int max){
        this.min = min;
        this.max = max;
    }

    public void insertString(FilterBypass fb, int offs, String str, AttributeSet a) throws BadLocationException
    {
        if ((fb.getDocument().getLength() + str.length()) <=max &&
                (fb.getDocument().getLength() + str.length()) >= min){
            super.insertString(fb, offs, str, a);
        } else
            Toolkit.getDefaultToolkit().beep();
    }
    public void replace(FilterBypass fb, int offs,
                        int length,
                        String str, AttributeSet a)
            throws BadLocationException {
        if ((fb.getDocument().getLength() + str.length()
                - length) <= max)
            super.replace(fb, offs, length, str, a);
        else
            Toolkit.getDefaultToolkit().beep();
    }


    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
