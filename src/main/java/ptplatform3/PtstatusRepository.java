package ptplatform3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PtstatusRepository extends CrudRepository<Ptstatus, Long> {

    List<Ptstatus> findByPtOrderId(Long ptOrderId);
    List<Ptstatus> findByPtManagerId(Long ptManagerId);
    List<Ptstatus> findByPtTrainerId(Long ptTrainerId);

}