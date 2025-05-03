package POO.PRACTICAP2;
import java.util.Random;

public class PracticaP2MAIN {


    public static Team[] allTeams = new Team[5];
    public static Race[] allRaces = new Race[10];
    public static Runner[] allRunners = new Runner[100];



    public static void main(String[] args) {
        Random random = new Random();

        allRunners[0] = new Runner ("Paco", "", new String[5], new float[5], 0, true);
        allRunners[1] = new Runner ("Bel", "Team2", new String[5], new float[5], 0, false);
        allRunners[0].setTeam("Team1");
        allRunners[0].setProfessional(true);
        allRunners[0].addRaceAndTime("Palma", 12.5f);
        allRunners[0].addRaceAndTime("Inca", 15f);
        allRunners[0].addRaceAndTime("Campos", 10f);
        allRunners[0].addRaceAndTime("Manacor", 11f);
        allRunners[0].addRaceAndTime("Llurito", 17f);

        allTeams[0] = new Team("Team1", new Runner[5], 0,true);
        allTeams[1] = new Team("Team2", new Runner[5], 0,false);

        allTeams[0].addRunner(allRunners[0]);
        allTeams[1].addRunner(allRunners[1]);

        Team equipo1 = allTeams[0];

        allRaces[0] = new Race("RaceA", new Runner[8], new float[8], false, 0,13);
        allRaces[1] = new Race("RaceB", new Runner[8], new float[8], true, 0,12.5f);
        allRaces[2] = new Race("RaceC", new Runner[8], new float[8], true, 0,10.5f);

        allRaces[0].addRunner(allRunners[0], 12f);
        allRaces[0].addRunner(allRunners[1], 11.5f);



        Runner tio1puntojotapegé = allRunners[0];
        System.out.printf("Millor carrera de %s va ser a %s amb temps %.2f segons. \n",
                tio1puntojotapegé.getName(), tio1puntojotapegé.bestRace(), tio1puntojotapegé.bestTime());

        System.out.printf("Temps mig de l'equip %s és %.2f. \n",
                equipo1.getName(), equipo1.averageTimes()*2);
        System.out.printf("L'equip %s té %d corredor/s professionals.\n",
                equipo1.getName(), equipo1.numProfessionals());

        Race c1 = allRaces[0];
        System.out.printf("Millor corredor/a de la carrera %s és %s amb temps %.2f. \n",
                c1.getRaceID(), c1.bestRunner(), c1.bestTime());

        System.out.printf("%s és el millor corredor/a de l'equip %s.\n",
                bestProfessionalRunnerOfTeam(equipo1), equipo1.getName());

        System.out.printf("%s és el millor equip.\n", bestTeam(allTeams));

        //Esto ha sido lo mas cojonudamente difícil que he hecho hasta ahora. No quiero imaginarme la solución informática.
    }

    public static String randomName(Random random){
        String alphabet = "qwertyuiopasdfghjklñzxcvbnmç";
        StringBuilder nextName = new StringBuilder();
        for (int i = 0; i < random.nextInt(7,9);i++){

        int index = random.nextInt(alphabet.length());
        nextName.append(alphabet.charAt(index));

        }

        nextName.setCharAt(0, Character.toUpperCase(nextName.charAt(0)));
        return nextName.toString();
    }

    public static String randomID(Random random){
        String IDlist = "1234567890QWERTYUIOPASDFGHJKLÑÇZXCVBNM";
        StringBuilder nextName = new StringBuilder();
        for (int i = 0; i < random.nextInt(3,5);i++){

        int index = random.nextInt(IDlist.length());
        nextName.append(IDlist.charAt(index));

        }

        nextName.setCharAt(0, Character.toUpperCase(nextName.charAt(0)));
        return nextName.toString();
    }

    public static String bestProfessionalRunnerOfTeam(Team t) {
        Runner[] runners = t.getRunners();
        float bestTime = Float.MAX_VALUE;
        String bestRunner = null;
        for (int i = 0; i < t.getNumRunners(); i++) {
            if (runners[i].isProfessional()) {
                float time = runners[i].bestTime();
                if (time < bestTime) {
                    bestTime = time;
                    bestRunner = runners[i].getName();
                }
            }
        }
        return bestRunner;
    }

    public static String bestTeam(Team[] teams) {
        float bestAvg = Float.MAX_VALUE;
        String bestTeamName = null;
        for (int i = 0; i < teams.length; i++) {
            if (teams[i] != null) {
                float avg = teams[i].averageTimes();
                if (avg < bestAvg) {
                    bestAvg = avg;
                    bestTeamName = teams[i].getName();
                }
            }
        }
        return bestTeamName;
    }

    public static Runner[] getClassifiedRunners(Race r, String nameTeam) {
        Runner[] classified = new Runner[r.getNumRunners()];
        int count = 0;
        Runner[] runners = r.getRunners();
        float[] times = r.getTimes();
        for (int i = 0; i < r.getNumRunners(); i++) {
            if (runners[i] != null && runners[i].getTeam().equals(nameTeam) && times[i] <= r.getClassificationTime()) {
                classified[count++] = runners[i];
            }
        }
        Runner[] result = new Runner[count];
        for (int i = 0; i < count; i++) {
            result[i] = classified[i];
        }
        return result;
    }

    public static boolean hasImproved(Runner r, Race[] races) {
        float[] times = new float[r.getNumRaces()];
        int count = 0;
        for (int i = 0; i < races.length; i++) {
            if (races[i] != null) {
                Runner[] raceRunners = races[i].getRunners();
                float[] raceTimes = races[i].getTimes();
                for (int j = 0; j < races[i].getNumRunners(); j++) {
                    if (raceRunners[j] == r) {
                        times[count++] = raceTimes[j];
                    }
                }
            }
        }
        for (int i = 1; i < count; i++) {
            if (times[i] >= times[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean everClassified(Runner r, Race[] races) {
        for (int i = 0; i < races.length; i++) {
            if (races[i] != null) {
                Runner[] raceRunners = races[i].getRunners();
                float[] raceTimes = races[i].getTimes();
                for (int j = 0; j < races[i].getNumRunners(); j++) {
                    if (raceRunners[j] == r) {
                        if (raceTimes[j] > races[i].getClassificationTime()) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static float averageNumRunners(Race[] races) {
        float total = 0;
        int count = 0;
        for (int i = 0; i < races.length; i++) {
            if (races[i] != null) {
                total += races[i].getNumRunners();
                count++;
            }
        }
        if (count == 0) return 0;
        return total / count;
    }

    public static float averageTimesRaces(Race[] races) {
        float total = 0;
        int count = 0;
        for (int i = 0; i < races.length; i++) {
            if (races[i] != null) {
                total += races[i].averageTimes();
                count++;
            }
        }
        if (count == 0) return 0;
        return total / count;
    }

    public static String[] racesWhereWinnerIsNotProfessional(Race[] races) {
        String[] result = new String[races.length];
        int count = 0;
        for (int i = 0; i < races.length; i++) {
            if (races[i] != null) {
                float best = Float.MAX_VALUE;
                int index = -1;
                for (int j = 0; j < races[i].getNumRunners(); j++) {
                    if (races[i].getTimes()[j] < best) {
                        best = races[i].getTimes()[j];
                        index = j;
                    }
                }
                if (index >= 0 && !races[i].getRunners()[index].isProfessional()) {
                    result[count++] = races[i].getRaceID();
                }
            }
        }
        String[] finalResult = new String[count];
        for (int i = 0; i < count; i++) {
            finalResult[i] = result[i];
        }
        return finalResult;
    }
}
