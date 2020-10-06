package com.car.rent;

import com.car.rent.domein.Boeking;
import com.car.rent.domein.Vestiging;
import com.car.rent.enumeration.Status;
import com.car.rent.repository.BoekingRepository;
import com.car.rent.repository.VestigingRepository;
import com.car.rent.valueobject.BoekingId;
import com.car.rent.valueobject.Periode;
import com.car.rent.valueobject.VestigingId;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class RentApplication {

	public static void main(String[] args) {
		//SpringApplication.run(RentApplication.class, args);
		BoekingRepository br = new BoekingRepository();

		for (Boeking b : br.getBoekingList()) {
			System.out.println(b.getBoekingId().getId());
		}

		Boeking b = new Boeking(new BoekingId(), new Periode(new Date(), new Date()), Status.GEHONOREERD);
		br.store(b);

		System.out.println(br.getBoekingById(4).getStatus().getNaam());

		VestigingRepository vr = new VestigingRepository();

		for (Vestiging v : vr.getVestigingList()) {
			System.out.println(v.getVestigingId().getId());
		}

		Vestiging v = new Vestiging("Avis", new VestigingId());
		vr.store(v);

		System.out.println(vr.getVestigingById(1).getNaam());

	}

}
