package POO.PRACTICAP2;

public class Race {

    private String raceID;
    private Runner[] runners = new Runner[8];
    private float[] times = new float[8];
    private boolean isFinals;
    private int numRunners;
    private float classificationTime;

    public Race(String raceID, Runner[] runners, float[] times, boolean isFinals, int numRunners, float classificationTime ){
        this.raceID = raceID;
        for (int i = 0; i < runners.length && i < this.runners.length; i++){
            this.runners[i] = runners[i];
        }
        for (int i = 0; i < times.length && i < this.times.length; i++){
            this.times[i] = times[i];
        }
        this.isFinals = isFinals;
        this.numRunners = numRunners;
        this.classificationTime = classificationTime;
    }

    // Setters y Getters
    public void setRaceID(String raceID) { this.raceID = raceID; }
    public void setRunners(Runner[] runners) { this.runners = runners; }
    public void setTimes(float[] times) { this.times = times; }
    public void setFinals(boolean finals) { isFinals = finals; }
    public void setNumRunners(int numRunners) { this.numRunners = numRunners; }
    public void setClassificationTime(float classificationTime) { this.classificationTime = classificationTime; }

    public String getRaceID() { return raceID; }
    public Runner[] getRunners() { return runners; }
    public float[] getTimes() { return times; }
    public boolean isFinals() { return isFinals; }
    public int getNumRunners() { return numRunners; }
    public float getClassificationTime() { return classificationTime; }



    //Métodos varios//
    public void addRunner(Runner runner, float time) {
        if (numRunners < runners.length) {
            runners[numRunners] = runner;
            times[numRunners] = time;
            numRunners++;

            runner.addRaceAndTime(raceID, time);
        }
    }

    public float bestTime(){
        float min = Float.MAX_VALUE;
        for (int i = 0; i < numRunners; i++){
            if (times[i] < min){
                min = times[i];
            }
        }
        return min;
    }

    public String bestRunner(){
        float min = Float.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < numRunners; i++){
            if (times[i] < min){
                min = times[i];
                index = i;
            }
        }
        return runners[index].getName();
    }

    public float averageTimes(){
        float average = 0;
        int skippedcases = 0;
        for (int i = 0; i < times.length-1; i++){
            if(times[i] == 0){
                skippedcases++;
            } else {
                average += times[i];
            }
        }
        return average / (times.length-1-skippedcases);
    }

    public float differenceBestFromWorst(){
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;

        for (int i = 0; i < times.length-1; i++){
            if(times[i] < min && times[i] != 0){
                min = times[i];
            }
            if (times[i] > max){
                max = times[i];
            }
        }
        return max-min;
    }
}