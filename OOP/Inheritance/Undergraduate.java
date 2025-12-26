public class Undergraduate extends Student{
    private int level;

    public Undergraduate(){
        super();
        level=1;
    }


    public Undergraduate(String undergraduateName,int ID,int type){
        super(undergraduateName,ID);
        level=type;
    }

    public void setLevel(int type){
        level=type;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public void writeOutput(){
        super.writeOutput();
        System.out.println("Level: "+(level==1?"Freshman":level==2?"Sophomore":level==3?"Junior":"Senior"));
    }



}