package com.souravpati.profile.service;

import com.souravpati.profile.document.ProfileDocument;
import com.souravpati.profile.repository.ProfileRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProfileServiceTest {

    @Mock
    private ProfileRepository repository;

    private ProfileService service;

    @Before
    public  void setUp(){
        service = new ProfileService(repository);
    }

    @Test
    public void testGetProfileReturnOneProfile() {
        ProfileDocument testDocument = new ProfileDocument();
        testDocument.setId("id");
        List<ProfileDocument> list = new ArrayList();
        list.add(testDocument);
        Iterable<ProfileDocument> documents = list;
        when(repository.findAll()).thenReturn(documents);
        ProfileDocument document = service.getProfile();
        assertThat(document.getId(), CoreMatchers.is("id"));
    }
}
