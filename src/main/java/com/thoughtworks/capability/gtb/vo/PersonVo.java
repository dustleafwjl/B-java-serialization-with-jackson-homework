package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PersonVo {

  private String id;
  private Integer age;
  private String name;
  private String hobby;

  public Integer getAge() {
    if(this.age == null) {
      return 0;
    }
    return age;
  }
}
