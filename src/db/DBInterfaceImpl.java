package db;

import model.*;
import org.jetbrains.annotations.Nullable;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DBInterfaceImpl implements DBInterface {

    private String URL;

    public DBInterfaceImpl(String URL, String databaseName, String userName, String password) {
        this.URL = "jdbc:" + URL + ";databaseName=" + databaseName + ";user=" + userName + ";password=" + password;
    }

    @Override
    public List<Article> getAllArticles() {
        return null;
    }

    @Override
    public List<Article> getAllArticlesWithPendingService(int days) {
        return null;
    }

    @Override
    public List<Distributor> getDistributorsList() {
        try(Connection c = DriverManager.getConnection(URL); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery("SELECT id, nazev, telefon FROM dodavatel");
            List<Distributor> list = new ArrayList<>();
            while(rs.next()) {
                list.add(new Distributor(
                        rs.getInt("id"), rs.getString("nazev"), rs.getString("telefon")));
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Manufacturer> getManufacturersList() {
        return null;
    }

    @Override
    public List<Product> getProductList() {
        return null;
    }

    @Override
    public List<Section> getSectionList() {
        return null;
    }

    @Override
    public List<ServiceFirm> getServiceFirmsList() {
        return null;
    }

    @Override
    public List<Log> getDatabaseLogs() {
        return null;
    }

    @Override
    public boolean addArticle(Article a) {
        return false;
    }

    @Override
    public boolean addArticleServiceProtocol(int id, String link, @Nullable LocalDate date) {
        return false;
    }

    @Override
    public boolean addArticleDocument(int id, String link, @Nullable LocalDate date) {
        return false;
    }

    @Override
    public boolean addDistributor(Distributor d) {
        return false;
    }

    @Override
    public boolean addManufacturer(Manufacturer m) {
        return false;
    }

    @Override
    public boolean addProduct(Product p) {
        return false;
    }

    @Override
    public boolean addSection(Section s) {
        return false;
    }

    @Override
    public boolean addServiceFirm(ServiceFirm s) {
        return false;
    }

    @Override
    public boolean removeArticle(int id) {
        return false;
    }

    @Override
    public boolean removeDistributor(int id) {
        return false;
    }

    @Override
    public boolean removeManufacturer(int id) {
        return false;
    }

    @Override
    public boolean removeProduct(int id) {
        return false;
    }

    @Override
    public boolean removeSection(int id) {
        return false;
    }

    @Override
    public boolean removeServiceFirm(int id) {
        return false;
    }

    @Override
    public boolean removeArticleServiceProtocol(int id) {
        return false;
    }

    @Override
    public boolean removeArticleDocument(int id) {
        return false;
    }

    @Override
    public boolean editArticle(int id, int productID, int distributorID, int securityID, int articleTypeID, String UMDNS,
                               LocalDate buyDate, int checkPeriod, int articleStatusID, String note, int sectionID, double price) {
        return false;
    }

    @Override
    public boolean editArticleStatus(int articleID, int articleStatusID) {
        return false;
    }

    @Override
    public boolean editDistributor(int id, String name, String phoneNumber) {
        return false;
    }

    @Override
    public boolean editManufacturer(int id, String name, String phone) {
        return false;
    }

    @Override
    public boolean editProduct(int id, int manufacturerID, String serialNumber, String name) {
        return false;
    }

    @Override
    public boolean editSection(int id, String name) {
        return false;
    }

    @Override
    public boolean editServiceFirm(int id, String name, String phoneNumber) {
        return false;
    }
}
