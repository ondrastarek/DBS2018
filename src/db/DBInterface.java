package db;

import model.*;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Pavel Pilař
 */
public interface DBInterface {

    /**
     * @return Returns a List with all articles in database
     */
    List<Article> getAllArticles();

    /**
     * @param days Maximal number of days before planned service
     *
     * @return Returns a List with all articles in database with service planned
     * in 0 to <code>days</code> days
     */
    List<Article> getAllArticlesWithPendingService(int days);

    /**
     * @return Returns a List with all distributors in database
     */
    List<Distributor> getDistributorsList();

    /**
     * @return Returns a List with all manufacturers in database
     */
    List<Manufacturer> getManufacturersList();

    /**
     * @return Returns a List with all products in database
     */
    List<Product> getProductList();

    /**
     * @return Returns a List with all sections in database
     */
    List<Section> getSectionList();

    /**
     * @return Returns a List with all service firms in database
     */
    List<ServiceFirm> getServiceFirmsList();

    /**
     * @return Returns a List with database logs
     */
    List<Log> getDatabaseLogs();

    /**
     * @param a The article to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addArticle(Article a);

    /**
     * Adds a service protocol to the article and sets the date of last service to the provided date.
     * If date is null, the service was unplanned and does not change the last service date
     *
     * @param id ID of the article
     * @param link Link to the service protocol
     * @param date Date of the service
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addArticleServiceProtocol(int id, String link, @Nullable LocalDate date);

    /**
     * Adds a document to the article.
     *
     * @param id ID of the article
     * @param link Link to the document
     * @param date Date of the document
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addArticleDocument(int id, String link, @Nullable LocalDate date);

    /**
     * @param d The distributor to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addDistributor(Distributor d);

    /**
     * @param m The manufacturer to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addManufacturer(Manufacturer m);

    /**
     * @param p The product to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addProduct(Product p);

    /**
     * @param s The section to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addSection(Section s);

    /**
     * @param s The service firm to be added
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean addServiceFirm(ServiceFirm s);

    /**
     * Removes an article and all of the documents tied to it
     *
     * @param id ID of the article to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeArticle(int id);

    /**
     * @param id ID of the distributor to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeDistributor(int id);

    /**
     * @param id ID of the manufacturer to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeManufacturer(int id);

    /**
     * @param id ID of the product to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeProduct(int id);

    /**
     * @param id ID of the section to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeSection(int id);

    /**
     * @param id ID of the service firm to be removed
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeServiceFirm(int id);

    /**
     * @param id ID of the service protocol
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeArticleServiceProtocol(int id);

    /**
     * @param id ID of the document
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean removeArticleDocument(int id);

    /**
     * @param id ID of the article to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editArticle(int id, int productID, int distributorID, int securityID, int articleTypeID,
                        String UMDNS, LocalDate buyDate, int checkPeriod, int articleStatusID, String note,
                        int sectionID, double price);

    /**
     * @param articleID ID of the article to be edited
     * @param articleStatusID ID of the status the article will be changed to
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editArticleStatus(int articleID, int articleStatusID);



    /**
     * @param id ID of the distributor to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editDistributor(int id, String name, String phoneNumber);

    /**
     * @param id ID of the manufacturer to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editManufacturer(int id, String name, String phone);

    /**
     * @param id ID of the product to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editProduct(int id, int manufacturerID, String serialNumber, String name);

    /**
     * @param id ID of the section to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editSection(int id, String name);

    /**
     * @param id ID of the service firm to be edited
     *
     * @return Returns true if the transaction was successful, false otherwise
     */
    boolean editServiceFirm(int id, String name, String phoneNumber);

}
