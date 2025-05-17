package com.gomocodes.CRUD.service;

import com.gomocodes.CRUD.entity.Students;
import com.gomocodes.CRUD.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UsersService {

    private final Map<Long, Students> usersStorage = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public List<Students> getAllUsers() {
        return new ArrayList<>(usersStorage.values());
    }

    public Students getUsersByID(Long id) {
        Students user = usersStorage.get(id);
        if (user == null) {
            throw new ResourceNotFoundException("USER NOT FOUND WITH THIS ID : " + id);
        }
        return user;
    }

    public Students createUsers(Students user) {
        Long id = idGenerator.getAndIncrement();
        user.setId(id);
        usersStorage.put(id, user);
        return user;
    }

    public Students updateUser(Long id, Students userDetails) {
        Students existingUser = getUsersByID(id); // throws exception if not found
        existingUser.setName(userDetails.getName());
        existingUser.setEmail(userDetails.getEmail());
        existingUser.setContact(userDetails.getContact());
        usersStorage.put(id, existingUser);
        return existingUser;
    }

    public void deleteUsersByID(Long id) {
        if (!usersStorage.containsKey(id)) {
            throw new ResourceNotFoundException("USER NOT FOUND WITH THIS ID : " + id);
        }
        usersStorage.remove(id);
    }
}
