package kpi.trspo.handlingrequestms.repository;

import kpi.trspo.handlingrequestms.model.HandlingRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HandlingRequestRepository extends JpaRepository<HandlingRequest, UUID> {
}
