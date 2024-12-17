package com.splitwizz.object;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "\"groups\"")
public class Group {

    @Id
    @GeneratedValue
    @Column(name = "group_id")
    private long groupId;

    @Column(name = "group_name")
    private String groupName;

    @Column(name = "num_members")
    private int numMembers;

    @ManyToOne
    @JoinColumn(name = "group_admin")
    private User admin;

    @ManyToMany(mappedBy = "userGroups")
    private Set<User> groupUsers;

    @OneToMany(mappedBy = "postedIn", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Expense> expensesPosted;
}
