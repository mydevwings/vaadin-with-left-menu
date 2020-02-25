package my.devwings.contactpolicy.service;

import my.devwings.contactpolicy.model.PersonInfo;

import java.util.Collections;
import java.util.List;

public class PersonDataServiceImpl implements PersonDataService {
    @Override
    public List<PersonInfo> get() {
        return Collections.singletonList(PersonInfo.builder().age(1).name("test").build());
    }
}
