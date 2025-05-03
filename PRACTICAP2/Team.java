package POO.PRACTICAP2;

public class Team{

    private String name;
    private Runner[] runners = new Runner[5];
    private int numRunners;
    private boolean international;

    public Team (String name, Runner[] runners, int numRunners, boolean international){
        this.name = name;
        for (int i = 0; i < runners.length; i++){
            this.runners[i] = runners[i];
        }
        this.numRunners = numRunners;
        this.international = international;
    }

    //Setters y Getters//
    public void setName(String name) {this.name = name;}
    public void setRunners(Runner[] runners) {this.runners = runners;}
    public void setNumRunners(int numRunners) {this.numRunners = numRunners;}
    public void setInternational(boolean international) {this.international = international;}

    public String getName() {return name;}
    public Runner[] getRunners() {return runners;}
    public int getNumRunners() {return numRunners;}
    public boolean isInternational() {return international;}


    //Métodos varios
    public void addRunner(Runner runner) {
        if (numRunners < runners.length) {
            runners[numRunners] = runner;
            numRunners++;

            runner.addRace(getName());
        }
    }
    public float averageTimes(){
        int skippedCases = 0;
        float average = 0;
        for (int i = 0; i < runners.length-1;i++){
            if (runners[i] == null){
                skippedCases++;
            } else {
                average += runners[i].averageTime();
            }
        }
        return average/(runners.length-skippedCases);
    }
    public boolean areAllProfessionals(){
        for (int i = 0; i < runners.length-1; i++){
            if (runners[i].isProfessional() != true){
                return false;
            }
        }
        return true;
    }
    public int numProfessionals() {
        int n = 0;
        for (int i = 0; i < runners.length; i++) {
            if (runners[i] != null && runners[i].isProfessional()) {
                n++;
            }
        }
        return n;
    }
}