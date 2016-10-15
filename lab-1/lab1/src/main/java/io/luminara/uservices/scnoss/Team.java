package io.luminara.uservices.scnoss;

public class Team {
    private final long id;
    private final String name;
    private final String location;
    private final String mascotte;

    public Team(long id, String name, String location, String mascotte) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.mascotte = mascotte;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getMascotte() {
        return mascotte;
    }
}
