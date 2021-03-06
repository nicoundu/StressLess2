package cl.pingon.stressless.data;

import java.util.ArrayList;
import java.util.List;

import cl.pingon.stressless.models.Pending;

public class Queries {

    public List<Pending> pendings () {

        List<Pending> pendings = new ArrayList<>();
        List<Pending> pendingList = Pending.find(Pending.class, "done = 0");
        if (pendingList != null && pendingList.size() > 0){
            pendings.addAll(pendingList);
        }

        return pendings;

    }

    public Pending byId (long idpending) {
        Pending pending;
        pending = Pending.findById(Pending.class, idpending);
        return pending;
    }

}
