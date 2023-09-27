package service;

import entity.Brand;
import repository.BrandRepository;

import java.sql.SQLException;

public class BrandService {
    private BrandRepository brandRepository = new BrandRepository();

    public BrandService() throws SQLException{

}
public int save(Brand brand){
      return brandRepository.Save(brand);
}


}
