package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {

    WhatsappRepository repository = new WhatsappRepository();
    public String createUser(String name, String mobile) throws Exception{
        return repository.createUser(name,mobile);
    }
    public Group createGroup(List<User> users){

        return repository.createGroup(users);
    }
    public int createMessage(String content){
        return repository.createMessage(content);
    }
    public int sendMessage(Message message,User user, Group group) throws Exception {
        return repository.sendMessage(message,user,group);
    }
    public String changeAdmin(User approver,User user,Group group) throws Exception {
        return repository.changeAdmin(approver,user,group);
    }
    public int removeUser(User user) throws Exception {
        return repository.removeUser(user);
    }
    public String findMessage(Date start, Date end, int k) throws Exception{
        return repository.findMessage(start,end,k);
    }
}
