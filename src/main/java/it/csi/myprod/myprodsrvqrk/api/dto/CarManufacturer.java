package it.csi.myprod.myprodsrvqrk.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import it.csi.myprod.myprodsrvqrk.api.dto.CarModel;
import java.util.List;
import javax.validation.constraints.*;

public class CarManufacturer   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String code = null;
  private String name = null;
  private List<CarModel> models = new ArrayList<CarModel>();

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
  

  @JsonProperty("name") 
 
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  

  @JsonProperty("models") 
 
  public List<CarModel> getModels() {
    return models;
  }
  public void setModels(List<CarModel> models) {
    this.models = models;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarManufacturer carManufacturer = (CarManufacturer) o;
    return Objects.equals(code, carManufacturer.code) &&
        Objects.equals(name, carManufacturer.name) &&
        Objects.equals(models, carManufacturer.models);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, models);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarManufacturer {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    models: ").append(toIndentedString(models)).append("\n");
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

