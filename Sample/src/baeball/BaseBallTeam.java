package baeball;

public class BaseBallTeam {
    
    private final String name;
    private final int win;
    private final int lose;
    private final int draw;
    
    public BaseBallTeam(String getName, int getWin, int getLose, int getDraw) {
        this.name = getName;
        this.win = getWin;
        this.lose = getLose;
        this.draw = getDraw;
    }
    
    private double getRate(){
        
        double dWin=this.win;
        double dLose=this.lose;

        return dWin/(dWin+dLose);
    }
    
    public void report(){
        System.out.println(name + "の2023年の成績は "+ win +"勝" +lose + "敗" + draw +"分、勝率は "+ getRate() + "です。");
    }
}
