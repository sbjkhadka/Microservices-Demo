package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {
    // fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L,"amit@email.com", "Amit", 1311L),
            new Contact(2L,"anil@email.com", "Anil", 1311L),
            new Contact(3L,"rohan@email.com", "Rohan", 1312L),
            new Contact(4L,"sameer@email.com", "Sameer", 1314L));
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId() == userId).collect(Collectors.toList());
    }
}
