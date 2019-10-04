import javax.swing.*;

public class MainForm {
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTree tree1;
    private JRadioButton 是否需要父进度来解锁RadioButton;
    private JTextPane textPane1;
    private JTextField 模组ID物品IDTextField;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton 是否无需解锁前继进度即可见RadioButton;
    private JRadioButton 是否以直线连接前继进度RadioButton;
    private JRadioButton 普通RadioButton;
    private JRadioButton 任务RadioButton;
    private JRadioButton 挑战RadioButton;
    private JRadioButton 左击方块RadioButton;
    private JRadioButton 右击方块RadioButton;
    private JTextField 方块IDTextField;
    private JRadioButton 击杀生物RadioButton;
    private JRadioButton 获取物品RadioButton;
    private JRadioButton 合成物品RadioButton;
    private JRadioButton 摧毁方块RadioButton;
    private JTextField 手持物品IDTextField;
    private JTextField 生物IDTextField;
    private JButton 添加Button;
    private JList eventList;
    private JButton 生成进度Button;
    private JRadioButton 是否隐藏与前继进度连线RadioButton;
    private JRadioButton 完成时是否显示进度完成标识RadioButton;
    private JRadioButton 完成时是否显示至聊天栏RadioButton;

    public MainForm() {
        ButtonGroup group = new ButtonGroup(){{
            add(任务RadioButton);
            add(挑战RadioButton);
            add(普通RadioButton);
        }};
        普通RadioButton.setSelected(true);
        ButtonGroup group2 = new ButtonGroup(){{
            add(击杀生物RadioButton);
            add(合成物品RadioButton);
            add(右击方块RadioButton);
            add(左击方块RadioButton);
            add(摧毁方块RadioButton);
            add(获取物品RadioButton);
        }};
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
