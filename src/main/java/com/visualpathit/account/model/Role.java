package com.visualpathit.account.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    private Long id;
    private String name;
    private Set<User> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "roles", cascade = CascadeType.ALL)
    public Set<User> getUsers() {
        return users;
    }

    public final void setUsers(Set<User> users) {
        this.users = users;
    }
}
