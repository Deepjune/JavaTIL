package com.example.firstproject.dto;

public class MemberForm02 {
  private String email;
  private int password;

  public MemberForm02(String email, int password) {
    this.email = email;
    this.password = password;
  }

  @Override
  public String toString() {
    return "MemberForm02{" +
            "email='" + email + '\'' +
            ", password=" + password +
            '}';
  }
}
