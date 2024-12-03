package MembersAndBarriers;

public interface Barriers {

    boolean overcome(InfoMembers[] infoMembers);

    class RunningTrack implements Barriers {
        private int length;

        public RunningTrack(int length) {
            this.length = length;
        }

        @Override
        public boolean overcome(InfoMembers[] infoMembers) {
            for (InfoMembers member : infoMembers) {
                if (!member.run(length)) {
                    return false;
                }
            }
            return true;
        }
    }

    class Wall implements Barriers {
        private final int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public boolean overcome(InfoMembers[] infoMembers) {
            for (InfoMembers member : infoMembers) {
                if (!member.jump(height)) {
                    return false;
                }
            }
            return true;
        }
    }
}