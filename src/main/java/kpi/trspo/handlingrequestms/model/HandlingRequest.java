package kpi.trspo.handlingrequestms.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.UUID;

@EnableAutoConfiguration
@Entity
@Table(name = "handling_requests")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HandlingRequest {

    @Id
    @GeneratedValue
    private UUID handlingRequestId;
    @NotNull
    @JoinColumn(name = "container_id")
    private UUID containerToHandle;
    @NotNull
    @JoinColumn(name = "giver_machinery_id")
    private UUID giverMachinery;
    @NotNull
    @JoinColumn(name = "receiver_machinery_id")
    private UUID receiverMachinery;




}
