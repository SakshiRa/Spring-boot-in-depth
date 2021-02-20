package com.sakshi.sakshilearn.CDI;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBuisness {
    @Inject
    SomeCDIDAO someCDIDAO;
    public SomeCDIDAO getSomeCDIDAO() {
        return someCDIDAO;
    }
    public void setSomeCDIDAO(SomeCDIDAO someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
