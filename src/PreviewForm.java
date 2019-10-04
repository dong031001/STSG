import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PreviewForm {
    JPanel previewPanel;
    JList list1;
    JButton 确认生成Button;
    JButton 取消生成Button;

    public PreviewForm() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {}
    }
}
