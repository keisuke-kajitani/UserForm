package com.example.damo1.form;



import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class QuestForm {
    @NotBlank(message = "名前を入力してください")
    private String name;
    @NotBlank(message = "メールを入力してください")
    @Size(min = 1, max = 127, message = "メールは1〜127文字で入力してください")
    private String email;
     @NotNull(message = "性別を選択してください")
    private String gender;
    @NotEmpty(message = "趣味を1つ以上選択してください")
    private List<String> sports;  
    @NotBlank(message = "好きな言語を選んでください")
    private String language;      
    @Size(min = 1, max = 200, message = "コメントは1〜200文字で入力してください")
    private String other;         

    
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getSports() {
        return sports;
    }

    public void setSports(List<String> sports) {
        this.sports = sports;
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
