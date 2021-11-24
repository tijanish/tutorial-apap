package apap.tutorial.pergipergi.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown= true)
public class AgensiDetail {

        private String status;

        @JsonProperty("agensi-license")
        private Integer agensiLicense;

        @JsonProperty("valid-until")
        private Date validUntil;

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Integer getAgensiLicense() {
                return agensiLicense;
        }

        public void setAgensiLicense(Integer agensiLicense) {
                this.agensiLicense = agensiLicense;
        }

        public Date getvalidUntil() {
                return validUntil;
        }

        public void setvalidUntil(Date validUntil) {
                this.validUntil = validUntil;
        }
}