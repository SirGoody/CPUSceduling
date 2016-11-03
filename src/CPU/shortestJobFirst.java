package CPU;

import java.lang.reflect.Array;

public class shortestJobFirst {

    public void schedule(Array[][] jobs[][]) {
        Array[][] shortestJob = new Array[jobs.length][]{

        }
        size = jobs[0].length;
        string job;
        int time = -1;
        for (i = size; i > 0; i--) {
            for (j = 0; j < size; j++) {
                if (jobs[j][1] > time) {
                    time = jobs[j][1];
                    job = jobs[j][0];
                }
            }
            shortestJob[i][1] = time;
            shortestJob[i][0] = job;

        }

    }
}
