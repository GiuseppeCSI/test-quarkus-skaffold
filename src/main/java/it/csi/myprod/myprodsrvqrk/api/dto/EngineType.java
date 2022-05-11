package it.csi.myprod.myprodsrvqrk.api.dto;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
public enum EngineType {
  GASOLINE,
  DIESEL,
  ELECTRIC;
}
