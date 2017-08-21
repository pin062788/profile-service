package com.souravpati.profile.service;

import com.souravpati.profile.document.ProfileDocument;
import com.souravpati.profile.repository.ProfileRepository;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
class ProfileServiceTest {

    @Mock
    ProfileService service;

    @Mock
    private ProfileRepository repository;

    @Before
    public void setup(){
        service = new ProfileService(repository);
    }


    @Test
   public void testGetProfileReturnOneProfile() {
        ProfileDocument testDocument = new ProfileDocument();
        testDocument.setId("Id");
        List<ProfileDocument>list = new ArrayList();
        Iterable<ProfileDocument> documents = list;
        when(repository.findAll()).thenReturn(documents);
        ProfileDocument document = service.getProfile();
        Assert.assertThat(document.getId(), CoreMatchers.is("id"));
    }
}