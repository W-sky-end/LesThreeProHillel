package MembersAndBarriers;

public class RunningTrack implements Barriers {
    private int length;

    public RunningTrack(int length) {
         this.length = length;
    }

    @Override
    public boolean overcome(InfoMembers[] infoMembers) {
        for (InfoMembers members : infoMembers) {
            if (!members.run(length)) {
                return false;
            }
        }
        return true;
    }
}
