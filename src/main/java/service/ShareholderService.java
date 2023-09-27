package service;

import entity.Shareholder;
import repository.ShareholderRepository;

import java.sql.SQLException;

public class ShareholderService {
    private ShareholderRepository shareholderRepository =new ShareholderRepository()


    public ShareholderService() throws SQLException {
    }
    public  int save(Shareholder shareholder) throws SQLException {
        return ShareholderRepository.save(shareholder);
    }
}
