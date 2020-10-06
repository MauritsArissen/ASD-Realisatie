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
    private MedewerkerId medewerkerId;

    public Boeking(BoekingPeriode boekingPeriode, BoekingStatus boekingStatus, KlantId klantId, AutoId autoId, VestigingId startVestigingId, VestigingId eindVestigingId) {
        this.boekingId = new BoekingId();
        this.boekingPeriode = boekingPeriode;
        this.boekingStatus = boekingStatus;
        this.klantId = klantId;
        this.autoId = autoId;
        this.startVestigingId = startVestigingId;
        this.eindVestigingId = eindVestigingId;
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
        // validaties etc... op de auto in de toekomst.

        this.boekingStatus = BoekingStatus.AFGEHANDELD;
    }

}
