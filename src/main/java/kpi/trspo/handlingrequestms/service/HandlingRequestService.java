package kpi.trspo.handlingrequestms.service;

import javassist.NotFoundException;
import kpi.trspo.handlingrequestms.model.HandlingRequest;

import java.util.List;
import java.util.UUID;

public interface HandlingRequestService {
    List<HandlingRequest> getAll();
    HandlingRequest getById(UUID handlingRequestId) throws NotFoundException;
    HandlingRequest create(HandlingRequest handlingRequestObject);
    HandlingRequest update(UUID handlingRequestId, HandlingRequest handlingRequestDetails) throws NotFoundException;
    void delete(UUID handlingRequestId) throws NotFoundException;
}
