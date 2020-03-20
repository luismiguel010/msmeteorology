package co.com.fac.rest.msmeteorology.services;

import co.com.fac.rest.msmeteorology.enums.MSError;
import co.com.fac.rest.msmeteorology.exceptions.BadRequestException;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class MeteorologyDomainServiceImpl implements MeteorologyDomainService{
    @Override
    public void saveImageInfraredWeb(String date) throws BadRequestException{
        try(InputStream in = new URL("http://bart.ideam.gov.co/geotiff/satelite/colombia/infrarojo/" + date + ".jpg").openStream()){
            Files.copy(in, Paths.get("/Users/luismonteszuluaga/Documents/QuemesDoc/meteorology/infrared/"+date+".jpg"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
