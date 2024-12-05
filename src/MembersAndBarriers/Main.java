package MembersAndBarriers;

public class Main {
    public static void main(String[] args) {
        InfoMembers[] members = {
                new Human("Vadim", 1000, 2),
                new Cat("Sima", 200, 3),
                new Robot("Vertor", 5000, 10)
        };

        Barriers[] barriers = {
                new RunningTrack(950),
                new Wall(3)
        };

        for (InfoMembers member : members) {
            System.out.println("Member: " + member.getName());
            boolean passedAll = true;

            for (Barriers barrier : barriers) {
                if (!barrier.overcome(new InfoMembers[]{member})) {
                    passedAll = false;
                    break;
                }
            }

            if (!passedAll) {
                System.out.println(member.getName() + "  cant do this.");
            } else {
                System.out.println(member.getName() + " Done!!!");
            }
            System.out.println("----------------");
        }
    }
}