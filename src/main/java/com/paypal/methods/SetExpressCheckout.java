/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paypal.methods;

import com.paypal.credentials.Credentials;

/**
 *
 * @author gonzalo
 */
public class SetExpressCheckout {
    
    
    public static SetExpressCheckoutBuilder builder() {
        SetExpressCheckoutBuilder builder = new SetExpressCheckoutBuilder();
        
        return builder;
    }
    
    private static class SetExpressCheckoutBuilder {
        private SetExpressCheckout instance;
        
        private Credentials credentials;
        
        public SetExpressCheckoutBuilder withCredentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }
    }
}
