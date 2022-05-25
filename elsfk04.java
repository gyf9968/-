import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class elsfk006 extends JFrame implements KeyListener{
    private static final int game_x = 26;
    private static final int game_y = 12;
    JTextArea[][] text;
    int[][] data;
    JLabel label1;
    JLabel label;
    boolean isrunning;

    public void initWindow() {
        this.setSize(600,850);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setTitle("我的俄罗斯方块游戏");
    }

    public void initGamePanel() {
        JPanel game_main = new JPanel();
        game_main.setLayout(new GridLayout(game_x,game_y,1,1));
        for (int i = 0 ; i < text.length ; i++) {
            for (int j = 0 ; j < text[i].length ;j++) {
                text[i][j] = new JTextArea(game_x,game_y);
                text[i][j].setBackground(Color.WHITE);
                text[i][j].addKeyListener(this);
                if (j == 0 || j == text[i].length-1 || i == text.length-1) {
                    text[i][j].setBackground(Color.MAGENTA);
                    data[i][j] = 1;
                }
                text[i][j].setEditable(false);
                game_main.add(text[i][j]);
            }
        }
        this.setLayout(new BorderLayout());
        this.add(game_main,BorderLayout.CENTER);
    }

    public void initExplainPanel() {
        JPanel explain_left = new JPanel();
        JPanel explain_right = new JPanel();

        explain_left.setLayout(new GridLayout(4,1));
        explain_right.setLayout(new GridLayout(2,1));

        explain_left.add(new JLabel("按空格键,方块变形"));
        explain_left.add(new JLabel("按左箭头,方块左移"));
        explain_left.add(new JLabel("按右箭头,方块右移"));
        explain_left.add(new JLabel("按下箭头,方块下落"));
        label1.setForeground(Color.RED);
        explain_right.add(label);
        explain_right.add(label1);
        this.add(explain_left,BorderLayout.WEST);
        this.add(explain_right,BorderLayout.EAST);
    }

    public elsfk006() {
        text = new JTextArea[game_x][game_y];
        data = new int[game_x][game_y];
        label1 = new JLabel("游戏状态: 正在游戏中!");
        label = new JLabel("游戏得分为: 0");
        initGamePanel();
        initExplainPanel();
        initWindow();
        isrunning = true;
    }

    public static void main(String[] args) {
        elsfk006 tertris = new elsfk006();
    }

    public void game_begin() {
        while (true){
            if (!isrunning) {
                break;
            }

            game_begin();
        }
        label1.setText("游戏状态: 游戏结束!");
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}