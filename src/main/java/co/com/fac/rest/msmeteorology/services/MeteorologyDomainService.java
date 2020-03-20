package co.com.fac.rest.msmeteorology.services;

import co.com.fac.rest.msmeteorology.exceptions.BadRequestException;

import java.io.IOException;
import java.net.MalformedURLException;

public interface MeteorologyDomainService {
    void saveImageInfraredWeb(String date) throws BadRequestException, IOException;
}
