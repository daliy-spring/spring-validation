package com.example.validate.dto;

import com.example.validate.annotation.YearMonth;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class User {

    @NotBlank
    private String name;

    @Max(value = 90)
    private int age;


    @Valid
    private List<Car> cars;


//    @Email
//    private  String email;
//
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$", message = "핸드폰 번호의 양식과 맞지 않습니다. 01x-xxx(x)-xxxx")
//    private String phoneNumber;

    //@Size(min = 6, max = 6)
//    @YearMonth
//    private String reqYearMonth ; //yyyymm





//    @AssertTrue(message = "yyyyMM 형식에 맞지 않습니다.")
//    public boolean isReqYearMonthValidation() {
//        //true가 되면 정상, false는실패
//        try {
//            LocalDate localDate = LocalDate.parse(getReqYearMonth() + "01", DateTimeFormatter.ofPattern("yyyyMMdd"));
//        }catch (Exception e){
//            return false;
//        }
//        return true;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cars=" + cars +
                '}';
    }
}



