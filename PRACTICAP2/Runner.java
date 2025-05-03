package POO.PRACTICAP2;

public class Runner {

    private String name;
    private String team;
    private String[] raceIDs = new String[5];
    private float[] times = new float[5];
    private int numRaces;
    private boolean professional;

    public Runner(String name, String team, String[] raceIDs, float[] times, int numRaces, boolean professional){
        this.name = name;
        this.team = team;
        for (int i = 0; i < raceIDs.length && i < this.raceIDs.length; i++){
            this.raceIDs[i] = raceIDs[i];
        }
        for (int i = 0; i < times.length && i < this.times.length; i++){
            this.times[i] = times[i];
        }
        this.numRaces = numRaces;
        this.professional = professional;
    }

    // Setters y Getters
    public void setName(String name) { this.name = name; }
    public void setTeam(String team) { this.team = team; }
    public void setRaceIDs(String[] raceIDs) { this.raceIDs = raceIDs; }
    public void setTimes(float[] times) { this.times = times; }
    public void setNumRaces(int numRaces) { this.numRaces = numRaces; }
    public void setProfessional(boolean professional) { this.professional = professional; }

    public String getName() { return name; }
    public String getTeam() { return team; }
    public String[] getRaceIDs() { return raceIDs; }
    public float[] getTimes() { return times; }
    public int getNumRaces() { return numRaces; }
    public boolean isProfessional() { return professional; }

    // Métodos varios nose
    public void addRace(String newRace){
        if (numRaces < raceIDs.length) {
            raceIDs[numRaces] = newRace;
            numRaces++;
        }
    }

    public void addRaceAndTime(String newRace, float newTime){
        if (numRaces < raceIDs.length) {
            raceIDs[numRaces] = newRace;
            times[numRaces] = newTime;
            numRaces++;
        }
    }

    public float bestTime(){
        float min = Float.MAX_VALUE;
        for (int i = 0; i < numRaces; i++){
            if (times[i] < min){
                min = times[i];
            }
        }
        return min;
    }

    public float averageTime(){
        float total = 0;
        int emptycases = 0;
        for (int i = 0; i < numRaces; i++){
            if (times[i] != 0) { total += times[i];} else { emptycases++;}
        }
        return total / (numRaces-emptycases);
    }

    public String bestRace(){
        float min = Float.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numRaces; i++){
            if (times[i] < min){
                min = times[i];
                index = i;
            }
        }
        if(index >= 0) { return raceIDs[index]; } else {return "//No ha participat//";}
    }
}