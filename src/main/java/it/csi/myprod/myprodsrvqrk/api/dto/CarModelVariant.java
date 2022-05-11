package it.csi.myprod.myprodsrvqrk.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import it.csi.myprod.myprodsrvqrk.api.dto.EngineType;
import java.math.BigDecimal;
import javax.validation.constraints.*;

public class CarModelVariant   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String code = null;
  private EngineType engineType = null;
  private BigDecimal enginePower = null;
  private Integer doors = null;

  /**
   **/
  

  @JsonProperty("code") 
 
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  

  @JsonProperty("engineType") 
 
  public EngineType getEngineType() {
    return engineType;
  }
  public void setEngineType(EngineType engineType) {
    this.engineType = engineType;
  }

  /**
   **/
  

  @JsonProperty("enginePower") 
 
  public BigDecimal getEnginePower() {
    return enginePower;
  }
  public void setEnginePower(BigDecimal enginePower) {
    this.enginePower = enginePower;
  }

  /**
   **/
  

  @JsonProperty("doors") 
 
  public Integer getDoors() {
    return doors;
  }
  public void setDoors(Integer doors) {
    this.doors = doors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarModelVariant carModelVariant = (CarModelVariant) o;
    return Objects.equals(code, carModelVariant.code) &&
        Objects.equals(engineType, carModelVariant.engineType) &&
        Objects.equals(enginePower, carModelVariant.enginePower) &&
        Objects.equals(doors, carModelVariant.doors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, engineType, enginePower, doors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarModelVariant {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
    sb.append("    enginePower: ").append(toIndentedString(enginePower)).append("\n");
    sb.append("    doors: ").append(toIndentedString(doors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

