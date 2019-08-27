package com.s2.otms.model;

public class User {
  private String username;
  private String password;
  private String[] roles;

  public User(String username, String password, String... roles) {
    this.username = username;
    this.password = password;
    this.roles = roles;
  }

  // Getter and Setter methods
  public String getUsername() {
      return username;
  }

  public String getPassword() {
    return password;
  }

  public String[] getRoles() {
    return roles;
  }

  public void setUsername(String username) {
      this.username = username;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRoles(String... roles) {
    this.roles = roles;
  }
}
