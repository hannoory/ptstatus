package ptplatform3;

import ptplatform3.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PtstatusViewHandler {


    @Autowired
    private PtstatusRepository ptstatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrdered_then_CREATE_1 (@Payload PtOrdered ptOrdered) {
        try {
            if (ptOrdered.isMe()) {
                // view 객체 생성
                Ptstatus ptstatus = new Ptstatus();
                // view 객체에 이벤트의 Value 를 set 함
                ptstatus.setPtOrderId(ptOrdered.getId());
                ptstatus.setPtClassId(ptOrdered.getPtClassId());
                ptstatus.setPtClassName(ptOrdered.getPtClassName());
                ptstatus.setPtCustomerId(ptOrdered.getCustomerId());
                ptstatus.setPtCustomerName(ptOrdered.getCustomerName());
                ptstatus.setPtOrderStatus(ptOrdered.getStatus());
                ptstatus.setPtClassId(ptOrdered.getPtClassId());
                ptstatus.setPtClassName(ptOrdered.getPtClassName());
                ptstatus.setPtCustomerId(ptOrdered.getCustomerId());
                ptstatus.setPtCustomerName(ptOrdered.getCustomerName());
                ptstatus.setPtOrderStatus(ptOrdered.getStatus());
                // view 레파지 토리에 save
                ptstatusRepository.save(ptstatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderAccepted_then_CREATE_2 (@Payload PtOrderAccepted ptOrderAccepted) {
        try {
            if (ptOrderAccepted.isMe()) {
                // view 객체 생성
                Ptstatus ptstatus = new Ptstatus();
                // view 객체에 이벤트의 Value 를 set 함
                ptstatus.setPtManagerStatus(ptOrderAccepted.getStatus());
                ptstatus.setTrainerId(ptOrderAccepted.getTrainerId());
                ptstatus.setTrainerName(ptOrderAccepted.getTrainerName());
                // view 레파지 토리에 save
                ptstatusRepository.save(ptstatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtScheduleConfirmed_then_CREATE_3 (@Payload PtScheduleConfirmed ptScheduleConfirmed) {
        try {
            if (ptScheduleConfirmed.isMe()) {
                // view 객체 생성
                Ptstatus ptstatus = new Ptstatus();
                // view 객체에 이벤트의 Value 를 set 함
                ptstatus.setPtTrainerStatus(ptScheduleConfirmed.getStatus());
                ptstatus.setPtClassDate(ptScheduleConfirmed.getPtClassDate());
                // view 레파지 토리에 save
                ptstatusRepository.save(ptstatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderAccepted_then_CREATE_4 (@Payload PtOrderAccepted ptOrderAccepted) {
        try {
            if (ptOrderAccepted.isMe()) {
                // view 객체 생성
                Ptstatus ptstatus = new Ptstatus();
                // view 객체에 이벤트의 Value 를 set 함
                ptstatus.setPtManagerStatus(ptOrderAccepted.getStatus());
                ptstatus.setTrainerId(ptOrderAccepted.getTrainerId());
                ptstatus.setTrainerName(ptOrderAccepted.getTrainerName());
                // view 레파지 토리에 save
                ptstatusRepository.save(ptstatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtScheduleConfirmed_then_CREATE_5 (@Payload PtScheduleConfirmed ptScheduleConfirmed) {
        try {
            if (ptScheduleConfirmed.isMe()) {
                // view 객체 생성
                Ptstatus ptstatus = new Ptstatus();
                // view 객체에 이벤트의 Value 를 set 함
                ptstatus.setPtTrainerStatus(ptScheduleConfirmed.getStatus());
                ptstatus.setPtClassDate(ptScheduleConfirmed.getPtClassDate());
                // view 레파지 토리에 save
                ptstatusRepository.save(ptstatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderConfirmed_then_UPDATE_1(@Payload PtOrderConfirmed ptOrderConfirmed) {
        try {
            if (ptOrderConfirmed.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptOrderConfirmed.getPtOrderId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtTrainerId(ptOrderConfirmed.getPtTrainerId());
                    ptstatus.setPtManagerStatus(ptOrderConfirmed.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCompleted_then_UPDATE_2(@Payload PtOrderCompleted ptOrderCompleted) {
        try {
            if (ptOrderCompleted.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptOrderCompleted.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtManagerId(ptOrderCompleted.getPtManagerId());
                    ptstatus.setPtTrainerId(ptOrderCompleted.getPtTrainerId());
                    ptstatus.setPtOrderStatus(ptOrderCompleted.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtCancelOrdered_then_UPDATE_3(@Payload PtCancelOrdered ptCancelOrdered) {
        try {
            if (ptCancelOrdered.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptCancelOrdered.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptCancelOrdered.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCancelAccepted_then_UPDATE_4(@Payload PtOrderCancelAccepted ptOrderCancelAccepted) {
        try {
            if (ptOrderCancelAccepted.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtManagerId(ptOrderCancelAccepted.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtManagerStatus(ptOrderCancelAccepted.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCanceled_then_UPDATE_5(@Payload PtOrderCanceled ptOrderCanceled) {
        try {
            if (ptOrderCanceled.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptOrderCanceled.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptOrderCanceled.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtScheduleCanceled_then_UPDATE_6(@Payload PtScheduleCanceled ptScheduleCanceled) {
        try {
            if (ptScheduleCanceled.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtTrainerId(ptScheduleCanceled.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtTrainerStatus(ptScheduleCanceled.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCompleted_then_UPDATE_7(@Payload PtOrderCompleted ptOrderCompleted) {
        try {
            if (ptOrderCompleted.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptOrderCompleted.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtManagerId(ptOrderCompleted.getPtManagerId());
                    ptstatus.setPtTrainerId(ptOrderCompleted.getPtTrainerId());
                    ptstatus.setPtOrderStatus(ptOrderCompleted.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtCancelOrdered_then_UPDATE_8(@Payload PtCancelOrdered ptCancelOrdered) {
        try {
            if (ptCancelOrdered.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptCancelOrdered.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptCancelOrdered.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCancelAccepted_then_UPDATE_9(@Payload PtOrderCancelAccepted ptOrderCancelAccepted) {
        try {
            if (ptOrderCancelAccepted.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtManagerId(ptOrderCancelAccepted.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtManagerStatus(ptOrderCancelAccepted.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtOrderCanceled_then_UPDATE_10(@Payload PtOrderCanceled ptOrderCanceled) {
        try {
            if (ptOrderCanceled.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptOrderCanceled.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptOrderCanceled.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtScheduleCanceled_then_UPDATE_11(@Payload PtScheduleCanceled ptScheduleCanceled) {
        try {
            if (ptScheduleCanceled.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtTrainerId(ptScheduleCanceled.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtTrainerStatus(ptScheduleCanceled.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtResultCreated_then_UPDATE_12(@Payload PtResultCreated ptResultCreated) {
        try {
            if (ptResultCreated.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtTrainerId(ptResultCreated.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtTrainerStatus(ptResultCreated.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtResultRead_then_UPDATE_13(@Payload PtResultRead ptResultRead) {
        try {
            if (ptResultRead.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptResultRead.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptResultRead.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtResultCreated_then_UPDATE_14(@Payload PtResultCreated ptResultCreated) {
        try {
            if (ptResultCreated.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtTrainerId(ptResultCreated.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtTrainerStatus(ptResultCreated.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenPtResultRead_then_UPDATE_15(@Payload PtResultRead ptResultRead) {
        try {
            if (ptResultRead.isMe()) {
                // view 객체 조회
                List<Ptstatus> ptstatusList = ptstatusRepository.findByPtOrderId(ptResultRead.getId());
                for(Ptstatus ptstatus : ptstatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    ptstatus.setPtOrderStatus(ptResultRead.getStatus());
                    // view 레파지 토리에 save
                    ptstatusRepository.save(ptstatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}