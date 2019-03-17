package com.nf147.platform.entity;

import java.util.List;

public class GeRole {
    private Integer id;

    private String name;

    private String nickname;

    private List<GePermission> permissionList;

    public List<GePermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<GePermission> permissionList) {
        this.permissionList = permissionList;
    }

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
