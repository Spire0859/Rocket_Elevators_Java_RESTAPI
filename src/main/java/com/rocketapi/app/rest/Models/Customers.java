
package com.rocketapi.app.rest.Models;
        import org.springframework.boot.autoconfigure.domain.EntityScan;
        import org.springframework.context.annotation.EnableAspectJAutoProxy;
        import javax.annotation.Generated;
        import javax.persistence.*;


@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String companyName;
    @Column
    private String fullName;
    @Column
    private String contactPhone;
    @Column
    private String email;
    @Column
    private String status;
    @Column
    private String description;
    @Column
    private String companyHqAddresse;
    @Column
    private String fullNameTechnicalAuthority;
    @Column
    private String technicalAuthorityPhone;
    @Column
    private String technicalAuthorityEmail;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private int user_id;


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }

    public String  getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStatus() {

        return status;
    }

    public String getContactPhone() {

        return contactPhone;

    }

    public void setContactPhone(String contactPhone) {

        this.contactPhone = contactPhone;

    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getCompanyHqAddresse() {

        return companyHqAddresse;
    }

    public void setCompanyHqAddresse(String companyHqAddresse) {

        this.companyHqAddresse = companyHqAddresse;
    }

    public String getTechnicalAuthorityEmail() {

        return technicalAuthorityEmail;
    }

    public void setTechnicalAuthorityEmail(String technicalAuthorityEmail) {

        this.technicalAuthorityEmail = technicalAuthorityEmail;
    }

    public String getTechnicalAuthorityPhone() {

        return technicalAuthorityPhone;
    }

    public void setTechnicalAuthorityPhone(String technicalAuthorityPhone) {

        this.technicalAuthorityPhone = technicalAuthorityPhone;
    }

    public String getFullNameTechnicalAuthority() {

        return fullNameTechnicalAuthority;
    }

    public void setFullNameTechnicalAuthority(String fullNameTechnicalAuthority) {

        this.fullNameTechnicalAuthority = fullNameTechnicalAuthority;
    }

    public String  getCreated_at() {

        return created_at;
    }

    public void setCreated_at(String created_at) {

        this.created_at = created_at;
    }

    public String  getUpdated_at() {

        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public int getUser_id() {

        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }



}