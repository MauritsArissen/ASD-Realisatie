package com.car.rent.domain;

import com.car.rent.enumeration.BoekingStatus;
import com.car.rent.repository.AutoRepository;
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
    private MedewerkerId medewerkerId;

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

    public KlantId getKlantId() {
        return klantId;
    }

    public AutoId getAutoId() {
        return autoId;
    }

    public BetalingId getBetalingId() {
        return betalingId;
    }

    public VestigingId getEindVestigingId() {
        return eindVestigingId;
    }

    public VestigingId getStartVestigingId() {
        return startVestigingId;
    }

    public BoekingPeriode getBoekingPeriode() {
        return boekingPeriode;
    }

    public BoekingStatus getBoekingStatus() {
        return boekingStatus;
    }

    public MedewerkerId getMedewerkerId() {
        return medewerkerId;
    }

    public void setMedewerkerId(MedewerkerId medewerkerId) {
        this.medewerkerId = medewerkerId;
    }

    public void setBoekingStatus(BoekingStatus boekingStatus) {
        this.boekingStatus = boekingStatus;
    }

    public void retournerningAuto() {
        AutoRepository repository = new AutoRepository();

        Auto a = repository.getAutoById(this.autoId);
        // a.processRetour...

        this.boekingStatus = BoekingStatus.AFGEHANDELD;
    }

}
