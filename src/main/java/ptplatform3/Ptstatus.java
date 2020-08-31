package ptplatform3;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Ptstatus_table")
public class Ptstatus {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long ptOrderId;
        private Long ptManagerId;
        private Long ptTrainerId;
        private Long ptClassId;
        private Long ptCustomerId;
        private Long trainerId;
        private String ptOrderStatus;
        private String ptManagerStatus;
        private String ptTrainerStatus;
        private String ptClassName;
        private String ptCustomerName;
        private String trainerName;
        private String ptResult;
        private String ptClassDate;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getPtOrderId() {
            return ptOrderId;
        }

        public void setPtOrderId(Long ptOrderId) {
            this.ptOrderId = ptOrderId;
        }
        public Long getPtManagerId() {
            return ptManagerId;
        }

        public void setPtManagerId(Long ptManagerId) {
            this.ptManagerId = ptManagerId;
        }
        public Long getPtTrainerId() {
            return ptTrainerId;
        }

        public void setPtTrainerId(Long ptTrainerId) {
            this.ptTrainerId = ptTrainerId;
        }
        public Long getPtClassId() {
            return ptClassId;
        }

        public void setPtClassId(Long ptClassId) {
            this.ptClassId = ptClassId;
        }
        public Long getPtCustomerId() {
            return ptCustomerId;
        }

        public void setPtCustomerId(Long ptCustomerId) {
            this.ptCustomerId = ptCustomerId;
        }
        public Long getTrainerId() {
            return trainerId;
        }

        public void setTrainerId(Long trainerId) {
            this.trainerId = trainerId;
        }
        public String getPtOrderStatus() {
            return ptOrderStatus;
        }

        public void setPtOrderStatus(String ptOrderStatus) {
            this.ptOrderStatus = ptOrderStatus;
        }
        public String getPtManagerStatus() {
            return ptManagerStatus;
        }

        public void setPtManagerStatus(String ptManagerStatus) {
            this.ptManagerStatus = ptManagerStatus;
        }
        public String getPtTrainerStatus() {
            return ptTrainerStatus;
        }

        public void setPtTrainerStatus(String ptTrainerStatus) {
            this.ptTrainerStatus = ptTrainerStatus;
        }
        public String getPtClassName() {
            return ptClassName;
        }

        public void setPtClassName(String ptClassName) {
            this.ptClassName = ptClassName;
        }
        public String getPtCustomerName() {
            return ptCustomerName;
        }

        public void setPtCustomerName(String ptCustomerName) {
            this.ptCustomerName = ptCustomerName;
        }
        public String getTrainerName() {
            return trainerName;
        }

        public void setTrainerName(String trainerName) {
            this.trainerName = trainerName;
        }
        public String getPtResult() {
            return ptResult;
        }

        public void setPtResult(String ptResult) {
            this.ptResult = ptResult;
        }
        public String getPtClassDate() {
            return ptClassDate;
        }

        public void setPtClassDate(String ptClassDate) {
            this.ptClassDate = ptClassDate;
        }

        @Override
        public String toString() {
            return "PtSTATUS{" +
                    "id=" + id +
                    ", ptOrderId=" + ptOrderId +
                    ", ptManagerId=" + ptManagerId +
                    ", ptTrainerId=" + ptTrainerId +
                    ", ptCustomerId=" + ptCustomerId + 
                    ", ptCustomerName='" + ptCustomerName + '\'' +
                    ", ptClassId=" + ptClassId + 
                    ", ptClassName='" + ptClassName + '\'' +
                    ", trainerId=" + trainerId +
                    ", trainerName='" + trainerName + '\'' +
                    ", ptResult='" + ptResult + '\'' +
                    ", ptClassDate='" + ptClassDate + '\'' +
                    ", ptOrderStatus='" + ptOrderStatus + '\'' +
                    ", ptManagerStatus='" + ptManagerStatus + '\'' +
                    ", ptTrainerStatus='" + ptTrainerStatus + '\'' +
                    '}';
        }

}
