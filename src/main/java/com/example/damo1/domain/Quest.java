package com.example.damo1.domain;

import java.util.List;

public class Quest {

private Integer id;
private String name;
private String email;
private String password;
private List<String> sports;
private String gender;
private String language;      
private String other;
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public List<String> getHobbyList() {
    return sports;
}
public void setHobbyList(List<String> sports) {
    this.sports = sports;
}
public String getGender() {
    return gender;
}
public void setGender(String gender) {
    this.gender = gender;
}
public String getLanguage() {
    return language;
}
public void setLanguage(String language) {
    this.language = language;
}
public String getOther() {
    return other;
}
public void setOther(String other) {
    this.other = other;
} 

}
