package MembersAndBarriers;

public interface InfoMembers {
    String getName();
    int getRunCap();
    int getJumpCap();

    boolean run(int length);

    boolean jump(int height);
}
