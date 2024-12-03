package MembersAndBarriers;

public class Robot implements InfoMembers{
    private final String name;
    private final int runCap;
    private final int jumpCap;

    public Robot (String name, int runCap,int jumpCap){
        this.name = name;
        this.runCap = runCap;
        this.jumpCap = jumpCap;


    }

    @Override
    public boolean run(int distance) {
        if (distance <= runCap) {
            System.out.println(name + " was able to run " + distance + "m.");
            return true;
        } else {
            System.out.println(name + " couldnt to run " + distance + "m.");
            return false;
        }
    }

    @Override
    public boolean jump(int distance) {
        if (distance <= jumpCap) {
            System.out.println(name + " was able to jump " + distance + "m.");
            return true;
        } else {
            System.out.println(name + " couldnt to jump " + distance + "m.");
            return false;
        }
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public int getRunCap () {
        return runCap;
    }

    @Override
    public int getJumpCap () {
        return jumpCap;
    }
}
