package com.spring.data.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {

    @JsonIgnore
    private long id;

    @JsonProperty("first_name")
    private String firstName;

    private String lastName;

//    public StudentResponse(){
//
//    }
//

//    public StudentResponse(long id, String firstName, String lastName) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }


}
