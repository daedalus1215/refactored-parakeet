package com.example.demo.current_project.daos;

import com.example.demo.dependency_library.entities.UserEntity;
import java.util.List;

public interface UserDAOInterface {

  List<UserEntity> getUsers();

}
