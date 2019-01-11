/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paypal.credentials;

/**
 *
 * @author gonzalo
 */
public class Credentials {
    
    private String username;
    private String password;
    private String signature;
    private String pathToCertificate;
    private String type;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getSignature() {
        return signature;
    }

    public String getPathToCertificate() {
        return pathToCertificate;
    }

    public String getType() {
        return type;
    }
    
    private Credentials(){}
   
    public static CredentialsBuilder builder() {
        return new CredentialsBuilder();
    }
    
    public static class CredentialsBuilder {
        private Credentials instance;
        
        private String username;
        private String password;
        private String signature;
        private String pathToCertificate;
        private String type;
        
        private CredentialsBuilder(){}
        
        public CredentialsBuilder withCertificate(String pathToCertificate) {
            this.pathToCertificate = pathToCertificate;
            this.type = "CERT_API";
            
            return this;
        }
        
        public CredentialsBuilder withSignature(String signature) {
            this.signature = signature;
            this.type = "SIGNATURE_API";
            
            return this;
        }
        
        public CredentialsBuilder username(String username) {
            this.username = username;
            return this;
        }
        
        public CredentialsBuilder password(String password) {
            this.password = password;
            return this;
        }
        
        public Credentials build() {
            this.instance = new Credentials();
            
            this.instance.username = username;
            this.instance.password = password;
            this.instance.signature = signature;
            this.instance.pathToCertificate = pathToCertificate;
            this.instance.type = type;
            
            return instance;
        }
    }
}
