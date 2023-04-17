package guru.springframework.spring5webapp.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Publisher {
    
        private String name;
        private String addressLine1;
        private String city;
        private String state;
        private String zip;

        @OneToMany
        // @JoinColumn("publisher_id");
        private Set<Book> books = new HashSet<>();

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
   
        // @ManyToMany(mappedBy = "publishers")
        // private Set<Book> books = new HashSet<>();

        public Publisher() {
        }


        public Set<Book> getBooks() {
            return this.books;
        }

        public void setBooks(Set<Book> books) {
            this.books = books;
        }

    
        public Publisher(String name, String addressLine1, String city, String state, String zip) {
            this.name = name;
            this.addressLine1 = addressLine1;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }
    
        public String getName() {
            return this.name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public String getAddressLine1() {
            return this.addressLine1;
        }
    
        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }
    
        public String getCity() {
            return this.city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public String getState() {
            return this.state;
        }
    
        public void setState(String state) {
            this.state = state;
        }
    
        public String getZip() {
            return this.zip;
        }
    
        public void setZip(String zip) {
            this.zip = zip;
        }

        public Long getId() {
            return this.id;
        }

        public void setId(Long id) {
            this.id = id;
        }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", addressLine1='" + getAddressLine1() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", zip='" + getZip() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Publisher)) {
            return false;
        }
        Publisher publisher = (Publisher) o;
        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
}
