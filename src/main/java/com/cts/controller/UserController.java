package com.cts.controller;

import com.cts.model.User;
import com.cts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ModelAttribute
    public void displayData(Model m) {
        m.addAttribute("name", "John");
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("listUsers")
    public String listUsers(Model m) {
        m.addAttribute("listUsers", this.userService.listUsers());
        return "showUser";
    }

    @GetMapping("getUserById")
    public String getUserById(@RequestParam int id, Model m) throws Exception {
        m.addAttribute("getUserById", this.userService.getUserById(id));
        return "showUser";
    }

    @RequestMapping("addUser")
    public String addUser(@ModelAttribute("add") User user) {
        List<User> existingUsers = this.userService.listUsers();
        Boolean data = false;
        for (User user1 : existingUsers) {
            if (user1.getId() == user.getId()) {
                data = true;
            }
        }
        if (data) {
            this.userService.updateUser(user);
        } else {
            this.userService.addUser(user);
        }
        return "showUser";
    }

    @RequestMapping("removeUser")
    public String removeUser(@RequestParam int id, Model m) {
        m.addAttribute("removeUser", this.userService.removeUser(id));
        return "showUser";
    }
}