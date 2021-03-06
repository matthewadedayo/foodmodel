package com.food.FoodModel.Account;

import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User  {
    public User() {
    }

    public User(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.enabled = user.isEnabled();
        this.accountNonExpired = user.isAccountNonExpired();
        this.credentialsNonExpired = user.isCredentialsNonExpired();
        this.accountNonLocked = user.isAccountNonLocked();
        this.roles = user.getRoles();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email", unique= true)
    private String email;
    
    @Column(name = "passwordResetCode")
    private String passwordResetCode;
   
    @Column(name = "enabled")
    private boolean enabled;
   
    @Column(name = "accountNonExpired")
    private boolean accountNonExpired;
    
    @Column(name = "credentialsNonExpired")
    private boolean credentialsNonExpired;
   
    @Column(name = "accountNonLocked")
    private boolean accountNonLocked;


    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinTable(name = "role_user", joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "userId")},
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id", referencedColumnName = "id")})
    private Set<Role> roles = new HashSet<Role>();




}
