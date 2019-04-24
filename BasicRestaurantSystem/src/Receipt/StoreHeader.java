/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receipt;

/**
 *
 * @author Elias
 */
public class StoreHeader {

    private String street_addr;
    private String zip_code;
    private String state_code;
    private String phone_num;
    private String store_num; // e.g., #1004

    public StoreHeader(String street_addr, String zip_code, String state_code, String phone_num, String store_num) {
        this.street_addr = street_addr;
        this.zip_code = zip_code;
        this.state_code = state_code;
        this.phone_num = phone_num;
        this.store_num = store_num;
    }

    public String getStateCode() {
        return this.state_code;
    }

    public String toString() {
        return "Address: " + this.street_addr + ", " + this.state_code + " " + this.zip_code + "\n" +"Phone #: " + this.phone_num + "\n" +"Store #: " + this.store_num;
    }
}
