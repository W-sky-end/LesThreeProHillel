package MembersAndBarriers;

public class Wall implements Barriers{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(InfoMembers[] infoMembers) {
        for (InfoMembers members : infoMembers){
            if(!members.jump(height)){
                return false;
            }
        }
        return true;
    }
}
