package it.csi.myprod.myprodsrvqrk.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import it.csi.myprod.myprodsrvqrk.api.dto.CarModelVariant;
import java.util.List;
import javax.validation.constraints.*;

public class CarModel   {
  // verra' utilizzata la seguente strategia serializzazione degli attributi: [explicit-as-modeled] 
  
  private String code = null;
  private String name = null;
  private List<CarModelVariant> variants = new ArrayList<CarModelVariant>();

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
  

  @JsonProperty("variants") 
 
  public List<CarModelVariant> getVariants() {
    return variants;
  }
  public void setVariants(List<CarModelVariant> variants) {
    this.variants = variants;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarModel carModel = (CarModel) o;
    return Objects.equals(code, carModel.code) &&
        Objects.equals(name, carModel.name) &&
        Objects.equals(variants, carModel.variants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, variants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarModel {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    variants: ").append(toIndentedString(variants)).append("\n");
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

