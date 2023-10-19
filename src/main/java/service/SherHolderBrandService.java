package service;

import repository.SherHolderBrand;

import java.sql.SQLException;

public class SherHolderBrandService {

    private SherHolderBrand sherHolderBrand = new SherHolderBrand();


    public SherHolderBrandService() throws SQLException{


    }
    public int save(SherHolderBrand sherHolderBrand)throws SQLException{
        return SherHolderBrand.save(sherHolderBrand);
    }
}
