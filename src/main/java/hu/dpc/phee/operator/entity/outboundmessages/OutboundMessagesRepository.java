package hu.dpc.phee.operator.entity.outboundmessages;

public interface OutboundMessagesRepository extends JpaRepository<OutboudMessages, Long>, JpaSpecificationExecutor {
    OutboudMessages findByInternalId(Long internalId);
}
