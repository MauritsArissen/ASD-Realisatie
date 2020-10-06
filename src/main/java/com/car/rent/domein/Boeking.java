package com.car.rent.domein;

import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.valueobject.*;

public class Boeking {
    private final BoekingId boekingId;
    private final BoekingPeriode boekingPeriode;
    private BoekingStatus boekingStatus;
    private final KlantId klantId;
    private final AutoId autoId;
    private final VestigingId startVestigingId;
    private final VestigingId eindVestigingId;
    private final BetalingId betalingId;

    public Boeking(BoekingPeriode boekingPeriode, BoekingStatus boekingStatus, KlantId klantId, AutoId autoId, VestigingId startVestigingId, VestigingId eindVestigingId, BetalingId betalingId) {
        this.boekingId = new BoekingId();
        this.boekingPeriode = boekingPeriode;
        this.boekingStatus = boekingStatus;
        this.klantId = klantId;
        this.autoId = autoId;
        this.startVestigingId = startVestigingId;
        this.eindVestigingId = eindVestigingId;
        this.betalingId = betalingId;
    }

    public BoekingId getBoekingId() {
        return boekingId;
    }

    public BoekingPeriode getBoekingPeriode() {
        return boekingPeriode;
    }

    public BoekingStatus getBoekingStatus() {
        return boekingStatus;
    }

    public void setBoekingStatus(BoekingStatus boekingStatus) {
        this.boekingStatus = boekingStatus;
    }
}
